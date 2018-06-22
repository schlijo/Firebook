package ch.basler.fire.marshall;

import ch.basler.fire.dom.*;

import ch.basler.fire.jaxb.ConfigRoot;
import ch.basler.fire.jaxb.ConfigRoot.Mappings.Mapping;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.log4j.Logger;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBElement;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.Serializable;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

@Api(value = "firebook")
@Path("/firewallchannel")
public class FirewallChannelStack {
  private static final Logger LOG = Logger.getLogger("APPL." + FirewallChannelStack.class.getName());

  static Source[] toStreamSources(@NotNull final URI stream) {
    return new Source[] {new StreamSource(stream.toString())};
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @ApiOperation(value = "Get configuration properties (separated per Environment) from a channel.")
  public ChannelStack getChannelStackForChannel(
      @ApiParam(value = "name of the channel (e.g. BIA), case sensitive") @QueryParam("channel") String channel) throws Exception {
    // "Den benoetige ich vom Client"
    //    String channelName = channel.split("/")[3];
    String channelName = channel;
    ChannelStack channelStack = new ChannelStack();

    channelStack.setChannelSetting(readChannelSetting(channelName));
    channelStack.setDisplayOrder(Arrays
        .asList("latestCommitDate", "name", "virtuallHost", "entryPath", "backendPath", "backendEndpoint", "backendTimeout", "authorizedRoles",
            "sessionHandling", "passthroughCookiePrefix", "minSessionIdleTimeout", "deniedAccessUrl", "loadBalancingCookie", "outputCompression",
            "controlApi", "envCookies", "includePortalHeaders", "encryptedCookiePrefix", "requestHeaderActions",
            "backendHttpRedirectLocationHeaderRewrites", "backendGroupId", "requestFrequencyFilterMaxRequestsPerInterval",
            "requestFrequencyFilterInterval", "requestBodySizeLimit", "maxPathLength", "maxNumberOfParameters", "maxParameterNameLength",
            "maxParameterValueLength", "generalBackendContentRewrite", "allowRules", "allowRuleParameterNameException"));





    //    channelStack.setIntChannelSetting(readChannelSetting("int", channelName));
    //    channelStack.setAccChannelSetting(readChannelSetting("acc", channelName));
    //    channelStack.setProdChannelSetting(readChannelSetting("prod", channelName));
    return channelStack;
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("{channel}")
  @ApiOperation(value = "Get configuration properties (separated per Environment) from a channel.")
  public ChannelStack getChannelStackForChannelByPath(
      @ApiParam(value = "name of the channel (e.g. BIA), case sensitive") @PathParam("channel") String channel) throws Exception {
    return getChannelStackForChannel(channel);
    //    // "Den benoetige ich vom Client"
    //    //    String channelName = channel.split("/")[3];
    //    String channelName = channel;
    //    ChannelStack channelStack = new ChannelStack();
    //
    //    channelStack.setTestChannelSetting(readChannelSetting(channelName));
    //    channelStack.setDisplayOrder(Arrays.asList("name", "virtuallHost", "entryPath", "backendPath", "backendEndpoint", "backendTimeout", "authorizedRoles", "sessionHandling"));
    //    //    channelStack.setIntChannelSetting(readChannelSetting("int", channelName));
    //    //    channelStack.setAccChannelSetting(readChannelSetting("acc", channelName));
    //    //    channelStack.setProdChannelSetting(readChannelSetting("prod", channelName));
    //    return channelStack;
  }

  //  private void addDenyRules(ChannelSetting channelSetting, Mapping mapping) {
  //    List<Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage> denyRulesUsages = mapping.getDenyRuleGroupUsages().getDenyRuleGroupUsage();
  //    for (Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage denyRulesUsage : denyRulesUsages) {
  //      List<Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleUsages.DenyRuleUsage> usages = denyRulesUsage.getDenyRuleUsages()
  //          .getDenyRuleUsage();
  //      for (Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleUsages.DenyRuleUsage usage : usages) {
  //        usage.get
  //      }
  //    }
  //
  //  }

  private ChannelSetting readChannelSetting(String channelname) throws Exception {
    ChannelSetting channelSetting = new ChannelSetting();
    AirlogConfigFileMarshaller airlogConfigFileMarshaller = new AirlogConfigFileMarshaller();
    ConfigRoot configRoot = airlogConfigFileMarshaller.parseAlecFullFile();
    String commitDate = airlogConfigFileMarshaller.latestCommitDate();
    channelSetting.setLatestCommitDate(commitDate);
    for (Mapping mapping : configRoot.getMappings().getMapping()) {
      String name = mapping.getName();
      LOG.debug("channel: " + name);
      if (channelname.equals(name)) {
        channelSetting.setName(name);
        channelSetting.setEntryPath(mapping.getEntryPath());
        channelSetting.setEnvCookies(mapping.getEnvCookies());
        channelSetting.setSessionHandling(mapping.getSessionHandling());
        channelSetting.setAuthorizedRoles(mapping.getAuthorizedRoles());
        channelSetting.setBackendTimeout(mapping.getBackendTimeout());

        channelSetting.setVirtuallHost(getVirtualHost(configRoot, mapping.getVirtualHostIds()));
        channelSetting.setBackendPath(mapping.getBackendPath());
        channelSetting.setBackendEndpoint(getBackendEndpoints(configRoot, mapping.getBackendGroupId()));

        channelSetting.setMinSessionIdleTimeout(mapping.getMinSessionIdleTimeout());
        channelSetting.setDeniedAccessUrl(mapping.getDeniedAccessUrl());
        channelSetting.setLoadBalancingCookie(mapping.getLoadBalancingCookie());
        channelSetting.setOutputCompression(mapping.getOutputCompression());
        channelSetting.setControlApi(mapping.getControlApi());
        channelSetting.setEnvCookies(mapping.getEnvCookies());
        channelSetting.setIncludePortalHeaders(mapping.getIncludePortalHeaders());
        channelSetting.setEncryptedCookiePrefix(mapping.getEncryptedCookiePrefix());
        channelSetting.setPassthroughCookiePrefix(mapping.getPassthroughCookiePrefix());

        addRequestHeaderActions(channelSetting, mapping);
        addBackendHttpRedirectLocationHeaderRewrites(channelSetting, mapping);
        addGeneralBackendContentRewrites(channelSetting, mapping);
        addBackendHtmlContentRewrites(channelSetting, mapping);
        channelSetting.setRequestBodySizeLimit(mapping.getRequestBodySizeLimit());
        channelSetting.setMaxPathLength(mapping.getMaxPathLength());

        channelSetting.setMaxNumberOfParameters(mapping.getMaxNumberOfParameters());
        channelSetting.setMaxParameterNameLength(mapping.getMaxParameterNameLength());
        channelSetting.setMaxParameterValueLength(mapping.getMaxParameterValueLength());
        //TODO muss konvertiert werden
        AllowRuleParameterNameException allowRuleParameterNameException = new AllowRuleParameterNameException();
        allowRuleParameterNameException.setName("allowRuleParameterNameException");
        allowRuleParameterNameException.setValue(mapping.getAllowRuleParameterNameException().getPattern().getPatternString());
        allowRuleParameterNameException.setActive(mapping.getAllowRuleParameterNameException().getActive());
//        allowRuleParameterNameException.setName(mapping.getAllowRuleParameterNameException().getPattern().getPatternString());
        channelSetting.setAllowRuleParameterNameException(allowRuleParameterNameException);
        addAllowRules(channelSetting, mapping);
        //TODO: Denyrules kommen in Kommentarfeld.
//        addDenyRules(channelSetting, mapping);
        channelSetting.setRequestFrequencyFilterMaxRequestsPerInterval(mapping.getRequestFrequencyFilterMaxRequestsPerInterval());
        channelSetting.setRequestFrequencyFilterInterval(mapping.getRequestFrequencyFilterInterval());


        //Freitextfeld f�r allgemeine Settings
        //Freitextfeld f�r Expert Settings (apache settings)

        //-----------------------------------------------------------------------------------------------
        //        channelSetting.setThreatHandling(mapping.getThreatHandling());
        //        channelSetting.setOperationalMode(mapping.getOperationalMode());
        //        channelSetting.setCredentialsPropagationType(mapping.getCredentialsPropagationType());
        //        channelSetting.setCredentialsPropagationMandatory(mapping.getCredentialsPropagationMandatory());
        //        channelSetting.setControlApi(mapping.getControlApi());

        //        channelSetting.setMaintenancePage(mapping.getMaintenancePage());
        //        channelSetting.setOutputCompression(mapping.getOutputCompression());

        //        channelSetting.setLoadBalancingCookie(mapping.getLoadBalancingCookie());
        //        channelSetting.setSslClientCertAuthentication(mapping.getSslClientCertAuthentication());
        //        channelSetting.setNTLMPassthrough(mapping.getNTLMPassthrough());
        //        channelSetting.setAuthenticationFlow(mapping.getAuthenticationFlow());

        //        channelSetting.setDeniedAccessUrl(mapping.getDeniedAccessUrl());
        //        channelSetting.setDeniedAccessUrlMode(mapping.getDeniedAccessUrlMode());
        //        channelSetting.setMinSessionIdleTimeout(mapping.getMinSessionIdleTimeout());
        // channelSetting.setVirtualHostIds(mapping.get
        // channelSetting.set <VirtualHostId(mapping.get722());VirtualHostId(mapping.get
        // channelSetting.set/VirtualHostIds(mapping.get

        /*channelSetting.setEntryPath(mapping.getEntryPath());
        channelSetting.setBackendLogoutUrl(mapping.getBackendLogoutUrl());
        channelSetting.setEntryPathIgnoreCase(mapping.getEntryPathIgnoreCase());
        channelSetting.setBackendGroupId(mapping.getBackendGroupId());*/
        //        channelSetting.setBackendPath(mapping.getBackendPath());
        //        channelSetting.setRequestFrequencyFilter(mapping.getRequestFrequencyFilter());
        //        channelSetting.setRequestFrequencyFilterMaxRequestsPerInterval(mapping.getRequestFrequencyFilterMaxRequestsPerInterval());
        //        channelSetting.setRequestFrequencyFilterInterval(mapping.getRequestFrequencyFilterInterval());
        //        channelSetting.setBackendHttpRedirectLocationHeaderRewriteMode(mapping.getBackendHttpRedirectLocationHeaderRewriteMode());
        //        channelSetting.setBackendHttpRedirectLocationHeaderRewriteComment(mapping.getBackendHttpRedirectLocationHeaderRewriteComment());
        return channelSetting;
      }
    }
    return channelSetting;
  }

  private void addAllowRules(ChannelSetting channelSetting, Mapping mapping) {
    Mapping.AllowRules allowRules = mapping.getAllowRules();
    for (Mapping.AllowRules.AllowRule allowRule : allowRules.getAllowRule()) {
      AllowRule rule = new AllowRule();
      rule.setActive(allowRule.getActive());
      rule.setContentTypePattern(allowRule.getContentTypePattern().getPattern().getPatternString());
      rule.setHttpMethodPattern(allowRule.getHttpMethodPattern().getPattern().getPatternString());
      rule.setIpPattern(allowRule.getIpPattern().getPattern().getPatternString());
      rule.setPathPattern(allowRule.getPathPattern().getPattern().getPatternString());
      rule.setLogOnly(allowRule.getLogOnly());
      rule.setName(allowRule.getName());
      rule.setValue(getValueString("METHOD", rule.getHttpMethodPattern()) + getValueString("CONTENT", rule.getContentTypePattern()) + getValueString("PAT", rule.getPathPattern()) + getValueString("IP", rule.getIpPattern()));
      channelSetting.setAllowRules(rule);
    }
  }

  private String getValueString(String type, String rule) {
    if (rule != null && rule.length() > 0) {
      return type + ": \"" + rule + "\" ";
    }
    return "";
  }

  private void addBackendHtmlContentRewrites(ChannelSetting channelSetting, Mapping mapping) {
    List<Serializable> content = mapping.getBackendHtmlContentRewrites().getContent();
    for (Serializable serializable : content) {
      if (serializable instanceof JAXBElement) {
        JAXBElement jaxbElement = (JAXBElement)serializable;
        if (jaxbElement.getValue() instanceof Mapping.BackendHtmlContentRewrites.BackendHtmlContentRewrite) {
          BackendHtmlContentRewrite backendHtmlContentRewrite = new BackendHtmlContentRewrite();
          Mapping.BackendHtmlContentRewrites.BackendHtmlContentRewrite jaxbElementValue = (Mapping.BackendHtmlContentRewrites.BackendHtmlContentRewrite)jaxbElement.getValue();
          backendHtmlContentRewrite.setRewriteTo(jaxbElementValue.getRewriteTo());
          backendHtmlContentRewrite.setRewriteFrom(jaxbElementValue.getRewriteFrom());
          backendHtmlContentRewrite.setIgnoreCase(jaxbElementValue.getIgnoreCase());
          backendHtmlContentRewrite.setEnabled(jaxbElementValue.getEnabled());
          backendHtmlContentRewrite.setEmbedded(jaxbElementValue.getEmbedded());
          backendHtmlContentRewrite.setEvents(jaxbElementValue.getEvents());
          backendHtmlContentRewrite.setUris(jaxbElementValue.getUris());
          channelSetting.setBackendHtmlContentRewrites(backendHtmlContentRewrite);
        }
      }
    }
  }

  private void addBackendHttpRedirectLocationHeaderRewrites(ChannelSetting channelSetting, Mapping mapping) {
//    channelSetting.setBackendHttpRedirectLocationHeaderRewrites();
    List<Serializable> content = mapping.getBackendHttpRedirectLocationHeaderRewrites().getContent();
    for (Serializable serializable : content) {
      if (serializable instanceof JAXBElement) {
        JAXBElement jaxbElement = (JAXBElement)serializable;
        if (jaxbElement.getValue() instanceof Mapping.BackendHttpRedirectLocationHeaderRewrites.BackendHttpRedirectLocationHeaderRewrite) {
          Mapping.BackendHttpRedirectLocationHeaderRewrites.BackendHttpRedirectLocationHeaderRewrite jaxbElementValue = (Mapping.BackendHttpRedirectLocationHeaderRewrites.BackendHttpRedirectLocationHeaderRewrite)jaxbElement.getValue();
          BackendHttpRedirectLocationHeaderRewrite backendHttpRedirectLocationHeaderRewrite = new BackendHttpRedirectLocationHeaderRewrite();
          backendHttpRedirectLocationHeaderRewrite.setIgnoreCase(jaxbElementValue.getIgnoreCase());
          backendHttpRedirectLocationHeaderRewrite.setEnabled(jaxbElementValue.getEnabled());
          backendHttpRedirectLocationHeaderRewrite.setRewriteFrom(jaxbElementValue.getRewriteFrom());
          backendHttpRedirectLocationHeaderRewrite.setRewriteTo(jaxbElementValue.getRewriteTo());
          backendHttpRedirectLocationHeaderRewrite.setName("backendHttpRedirectLocationHeaderRewritesFromTo");
          backendHttpRedirectLocationHeaderRewrite.setValue(jaxbElementValue.getRewriteFrom());
          backendHttpRedirectLocationHeaderRewrite.setValue(jaxbElementValue.getRewriteTo());
          channelSetting.setBackendHttpRedirectLocationHeaderRewrites(backendHttpRedirectLocationHeaderRewrite);
        }
      }
    }
  }

  private void addGeneralBackendContentRewrites(ChannelSetting channelSetting, Mapping mapping) {
    Mapping.GeneralBackendContentRewrites rewrites = mapping.getGeneralBackendContentRewrites();
    for (Serializable serializable : rewrites.getContent()) {
      if (serializable instanceof JAXBElement) {
        JAXBElement jaxbElement = (JAXBElement)serializable;
        if (jaxbElement.getValue() instanceof Mapping.GeneralBackendContentRewrites.GeneralBackendContentRewrite) {
          Mapping.GeneralBackendContentRewrites.GeneralBackendContentRewrite jaxbElementValue = (Mapping.GeneralBackendContentRewrites.GeneralBackendContentRewrite)jaxbElement.getValue();
          GeneralBackendContentRewrite rewrite = new GeneralBackendContentRewrite();
          rewrite.setName("generalBackendContentRewriteFromTo");
          rewrite.setValue(jaxbElementValue.getRewriteFrom());
          rewrite.setValue(jaxbElementValue.getRewriteTo());
          rewrite.setIgnoreCase(jaxbElementValue.getIgnoreCase());
          rewrite.setRewriteFrom(jaxbElementValue.getRewriteFrom());
          rewrite.setRewriteTo(jaxbElementValue.getRewriteTo());
          channelSetting.setGeneralBackendContentRewrite(rewrite);
        }
      }
    }
  }

  private void addRequestHeaderActions(ChannelSetting channelSetting, Mapping mapping) {
    Mapping.RequestHeaderActions actions = mapping.getRequestHeaderActions();
    for (Serializable serializable : actions.getContent()) {
      if (serializable instanceof JAXBElement) {
        JAXBElement jaxbElement = (JAXBElement)serializable;
        if (jaxbElement.getValue() instanceof Mapping.RequestHeaderActions.RequestHeaderAction) {
          Mapping.RequestHeaderActions.RequestHeaderAction requestHeaderAction = (Mapping.RequestHeaderActions.RequestHeaderAction)jaxbElement.getValue();
          RequestHeaderAction headerAction = new RequestHeaderAction();
          headerAction.setActionType(requestHeaderAction.getActionType());
          headerAction.setName(requestHeaderAction.getActionType());
          headerAction.setValue(requestHeaderAction.getHeaderName().getPatternString());
          RequestHeaderName name = new RequestHeaderName();
          name.setPatternString(requestHeaderAction.getHeaderName().getPatternString());
          name.setIgnoreCase(requestHeaderAction.getHeaderName().getIgnoreCase());
          name.setInvertPattern(requestHeaderAction.getHeaderName().getInvertPattern());
          headerAction.setRequestHeaderName(name);

          RequestHeaderValue value = new RequestHeaderValue();
          value.setPatternString(requestHeaderAction.getHeaderValue().getPatternString());
          value.setInvertPattern(requestHeaderAction.getHeaderValue().getInvertPattern());
          value.setIgnoreCase(requestHeaderAction.getHeaderValue().getIgnoreCase());
          headerAction.setRequestHeaderValue(value);
          channelSetting.setRequestHeaderAction(headerAction);
        }
      }
    }
  }

  private String getBackendEndpoints(ConfigRoot configRoot, short backendGroupId) {
    String result = "";
    for (ConfigRoot.BackendGroups.BackendGroup group : configRoot.getBackendGroups().getBackendGroup()) {
      if (group.getId().equals(backendGroupId)) {
        for (ConfigRoot.BackendGroups.BackendGroup.BackendHosts.BackendHost host : group.getBackendHosts().getBackendHost()) {
          if (host.getStatus().equalsIgnoreCase("enabled")) {
            if (result.length() > 0) {
              result += " ,";
            }

            result += host.getTransportProtocol() + "://" + host.getAddress() + ":" + host.getPort();
          }
        }
      }
    }
    return result;
  }

  private String getVirtualHost(ConfigRoot configRoot, Mapping.VirtualHostIds virtualHostIds) {
    String result = "";
    for (Short id : virtualHostIds.getVirtualHostId()) {
      String hostName = getHostname(configRoot.getVirtualHosts(), id);
      if (hostName.length() > 0) {
        if (result.length() > 0) {
          result += ", ";
        }
        result += hostName;
      }
    }
    return result;
  }

  private String getHostname(ConfigRoot.VirtualHosts configRoot, Short id) {
    for (ConfigRoot.VirtualHosts.VirtualHost virtualHost : configRoot.getVirtualHost()) {
      if (virtualHost.getId().equals(id)) {
        String result = "";
        if (virtualHost.getHttpEnabled().equalsIgnoreCase("true")) {
          result += "http://" + virtualHost.getHostName() + ":" + virtualHost.getHttpPort();
        }
        if (virtualHost.getHttpsEnabled().equalsIgnoreCase("true")) {
          if (result.length() > 0) {
            result += ", ";
          }
          result += "https://" + virtualHost.getHostName() + ":" + virtualHost.getHttpsPort();
        }

        return result;
      }
    }

    return "";
  }

}
