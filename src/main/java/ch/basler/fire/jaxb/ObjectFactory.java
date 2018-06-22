
package ch.basler.fire.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.basler.firebook.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConfigRootMappingsMappingIcapRequestServiceBackendViewUsagesIcapRequestServiceBackendViewUsage_QNAME = new QName("", "IcapRequestServiceBackendViewUsage");
    private final static QName _ConfigRootBackendGroupsBackendGroupMappingIdsMappingId_QNAME = new QName("", "MappingId");
    private final static QName _ConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleException_QNAME = new QName("", "DenyRuleException");
    private final static QName _ConfigRootMappingsMappingAllowRulesAllowRuleAllowRuleParametersAllowRuleParameter_QNAME = new QName("", "AllowRuleParameter");
    private final static QName _ConfigRootMappingsMappingBackendHttpRedirectLocationHeaderRewritesBackendHttpRedirectLocationHeaderRewrite_QNAME = new QName("", "BackendHttpRedirectLocationHeaderRewrite");
    private final static QName _ConfigRootSslCertificatesSslCertificateVirtualHostIdsVirtualHostId_QNAME = new QName("", "VirtualHostId");
    private final static QName _ConfigRootMappingsMappingGeneralBackendContentRewritesGeneralBackendContentRewrite_QNAME = new QName("", "GeneralBackendContentRewrite");
    private final static QName _ConfigRootMappingsMappingBackendHtmlContentRewritesBackendHtmlContentRewrite_QNAME = new QName("", "BackendHtmlContentRewrite");
    private final static QName _ConfigRootMappingsMappingRequestHeaderActionsRequestHeaderAction_QNAME = new QName("", "RequestHeaderAction");
    private final static QName _ConfigRootMappingsMappingBackendErrorPageReplacementsBackendErrorPageReplacement_QNAME = new QName("", "BackendErrorPageReplacement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.basler.firebook.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.HttpHeaderNamePattern.Pattern }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.HttpHeaderNamePattern.Pattern createConfigRootDenyRulesDenyRuleHttpHeaderNamePatternPattern() {
        return new ConfigRoot.DenyRules.DenyRule.HttpHeaderNamePattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.IpPattern.Pattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.IpPattern.Pattern createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleExceptionIpPatternPattern() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.IpPattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRuleGroups.DenyRuleGroup.DenyRuleIds }
     * 
     */
    public ConfigRoot.DenyRuleGroups.DenyRuleGroup.DenyRuleIds createConfigRootDenyRuleGroupsDenyRuleGroupDenyRuleIds() {
        return new ConfigRoot.DenyRuleGroups.DenyRuleGroup.DenyRuleIds();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.AllowRuleParameterNameException.Pattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.AllowRuleParameterNameException.Pattern createConfigRootMappingsMappingAllowRuleParameterNameExceptionPattern() {
        return new ConfigRoot.Mappings.Mapping.AllowRuleParameterNameException.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction.CookieName }
     * 
     */
    public ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction.CookieName createConfigRootGlobalResponseHeaderActionsGlobalResponseHeaderActionCookieName() {
        return new ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction.CookieName();
    }

    /**
     * Create an instance of {@link ConfigRoot.RoutesV6 }
     * 
     */
    public ConfigRoot.RoutesV6 createConfigRootRoutesV6() {
        return new ConfigRoot.RoutesV6();
    }

    /**
     * Create an instance of {@link ConfigRoot.GlobalRequestHeaderActions.GlobalRequestHeaderAction.HeaderName }
     * 
     */
    public ConfigRoot.GlobalRequestHeaderActions.GlobalRequestHeaderAction.HeaderName createConfigRootGlobalRequestHeaderActionsGlobalRequestHeaderActionHeaderName() {
        return new ConfigRoot.GlobalRequestHeaderActions.GlobalRequestHeaderAction.HeaderName();
    }

    /**
     * Create an instance of {@link ConfigRoot.BackendGroups }
     * 
     */
    public ConfigRoot.BackendGroups createConfigRootBackendGroups() {
        return new ConfigRoot.BackendGroups();
    }

    /**
     * Create an instance of {@link ConfigRoot.GlobalSettings.GlobalSetting.SessionRestrictionWhitelistIpPattern }
     * 
     */
    public ConfigRoot.GlobalSettings.GlobalSetting.SessionRestrictionWhitelistIpPattern createConfigRootGlobalSettingsGlobalSettingSessionRestrictionWhitelistIpPattern() {
        return new ConfigRoot.GlobalSettings.GlobalSetting.SessionRestrictionWhitelistIpPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Nodes.Node.PhysicalNetworkInterfaces }
     * 
     */
    public ConfigRoot.Nodes.Node.PhysicalNetworkInterfaces createConfigRootNodesNodePhysicalNetworkInterfaces() {
        return new ConfigRoot.Nodes.Node.PhysicalNetworkInterfaces();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.ContentTypePattern }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.ContentTypePattern createConfigRootDenyRulesDenyRuleContentTypePattern() {
        return new ConfigRoot.DenyRules.DenyRule.ContentTypePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsage() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleException() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException();
    }

    /**
     * Create an instance of {@link ConfigRoot.GlobalSettings.GlobalSetting.SyslogMessageFilterPattern }
     * 
     */
    public ConfigRoot.GlobalSettings.GlobalSetting.SyslogMessageFilterPattern createConfigRootGlobalSettingsGlobalSettingSyslogMessageFilterPattern() {
        return new ConfigRoot.GlobalSettings.GlobalSetting.SyslogMessageFilterPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.GeneralBackendContentRewrites.GeneralBackendContentRewrite }
     * 
     */
    public ConfigRoot.Mappings.Mapping.GeneralBackendContentRewrites.GeneralBackendContentRewrite createConfigRootMappingsMappingGeneralBackendContentRewritesGeneralBackendContentRewrite() {
        return new ConfigRoot.Mappings.Mapping.GeneralBackendContentRewrites.GeneralBackendContentRewrite();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage.RequestHeaderNamePattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage.RequestHeaderNamePattern createConfigRootMappingsMappingIcapRequestServiceBackendViewUsagesIcapRequestServiceBackendViewUsageRequestHeaderNamePattern() {
        return new ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage.RequestHeaderNamePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.VirtualHostIds }
     * 
     */
    public ConfigRoot.Mappings.Mapping.VirtualHostIds createConfigRootMappingsMappingVirtualHostIds() {
        return new ConfigRoot.Mappings.Mapping.VirtualHostIds();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.ContentTypePattern.Pattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.ContentTypePattern.Pattern createConfigRootMappingsMappingAllowRulesAllowRuleContentTypePatternPattern() {
        return new ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.ContentTypePattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.BackendErrorPageReplacements }
     * 
     */
    public ConfigRoot.Mappings.Mapping.BackendErrorPageReplacements createConfigRootMappingsMappingBackendErrorPageReplacements() {
        return new ConfigRoot.Mappings.Mapping.BackendErrorPageReplacements();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleUsages.DenyRuleUsage }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleUsages.DenyRuleUsage createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleUsagesDenyRuleUsage() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleUsages.DenyRuleUsage();
    }

    /**
     * Create an instance of {@link ConfigRoot.VirtualHosts.VirtualHost.PathRewrites.PathRewrite }
     * 
     */
    public ConfigRoot.VirtualHosts.VirtualHost.PathRewrites.PathRewrite createConfigRootVirtualHostsVirtualHostPathRewritesPathRewrite() {
        return new ConfigRoot.VirtualHosts.VirtualHost.PathRewrites.PathRewrite();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.IpPattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.IpPattern createConfigRootMappingsMappingAllowRulesAllowRuleIpPattern() {
        return new ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.IpPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules }
     * 
     */
    public ConfigRoot.DenyRules createConfigRootDenyRules() {
        return new ConfigRoot.DenyRules();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptions() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.GlobalRequestHeaderActionUsages.GlobalActionUsage }
     * 
     */
    public ConfigRoot.Mappings.Mapping.GlobalRequestHeaderActionUsages.GlobalActionUsage createConfigRootMappingsMappingGlobalRequestHeaderActionUsagesGlobalActionUsage() {
        return new ConfigRoot.Mappings.Mapping.GlobalRequestHeaderActionUsages.GlobalActionUsage();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.ParameterNamePattern }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.ParameterNamePattern createConfigRootDenyRulesDenyRuleParameterNamePattern() {
        return new ConfigRoot.DenyRules.DenyRule.ParameterNamePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HttpMethodPattern.Pattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HttpMethodPattern.Pattern createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleExceptionHttpMethodPatternPattern() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HttpMethodPattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Nodes.Node.BackendAddresses.BackendAddress }
     * 
     */
    public ConfigRoot.Nodes.Node.BackendAddresses.BackendAddress createConfigRootNodesNodeBackendAddressesBackendAddress() {
        return new ConfigRoot.Nodes.Node.BackendAddresses.BackendAddress();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.HttpHeaderValuePattern }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.HttpHeaderValuePattern createConfigRootDenyRulesDenyRuleHttpHeaderValuePattern() {
        return new ConfigRoot.DenyRules.DenyRule.HttpHeaderValuePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.SslVpnHosts }
     * 
     */
    public ConfigRoot.SslVpnHosts createConfigRootSslVpnHosts() {
        return new ConfigRoot.SslVpnHosts();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.HttpMethodPattern }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.HttpMethodPattern createConfigRootDenyRulesDenyRuleHttpMethodPattern() {
        return new ConfigRoot.DenyRules.DenyRule.HttpMethodPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.AllowRuleParameterNameException }
     * 
     */
    public ConfigRoot.Mappings.Mapping.AllowRuleParameterNameException createConfigRootMappingsMappingAllowRuleParameterNameException() {
        return new ConfigRoot.Mappings.Mapping.AllowRuleParameterNameException();
    }

    /**
     * Create an instance of {@link ConfigRoot.BackendGroups.BackendGroup.BackendFailureDetectionOutOfBandStatusPattern }
     * 
     */
    public ConfigRoot.BackendGroups.BackendGroup.BackendFailureDetectionOutOfBandStatusPattern createConfigRootBackendGroupsBackendGroupBackendFailureDetectionOutOfBandStatusPattern() {
        return new ConfigRoot.BackendGroups.BackendGroup.BackendFailureDetectionOutOfBandStatusPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HeaderValuePattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HeaderValuePattern createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleExceptionHeaderValuePattern() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HeaderValuePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.IcapServices }
     * 
     */
    public ConfigRoot.IcapServices createConfigRootIcapServices() {
        return new ConfigRoot.IcapServices();
    }

    /**
     * Create an instance of {@link ConfigRoot.BackendGroups.BackendGroup.BackendFailureDetectionOutOfBandContentPattern }
     * 
     */
    public ConfigRoot.BackendGroups.BackendGroup.BackendFailureDetectionOutOfBandContentPattern createConfigRootBackendGroupsBackendGroupBackendFailureDetectionOutOfBandContentPattern() {
        return new ConfigRoot.BackendGroups.BackendGroup.BackendFailureDetectionOutOfBandContentPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.PathPattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.PathPattern createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleExceptionPathPattern() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.PathPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.AllowRuleParameter.ParameterNamePattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.AllowRuleParameter.ParameterNamePattern createConfigRootMappingsMappingAllowRulesAllowRuleAllowRuleParametersAllowRuleParameterParameterNamePattern() {
        return new ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.AllowRuleParameter.ParameterNamePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HttpMethodPattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HttpMethodPattern createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleExceptionHttpMethodPattern() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HttpMethodPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.BackendGroups.BackendGroup.BackendFailureDetectionInBandContentTypePattern }
     * 
     */
    public ConfigRoot.BackendGroups.BackendGroup.BackendFailureDetectionInBandContentTypePattern createConfigRootBackendGroupsBackendGroupBackendFailureDetectionInBandContentTypePattern() {
        return new ConfigRoot.BackendGroups.BackendGroup.BackendFailureDetectionInBandContentTypePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.GlobalSettings.GlobalSetting.SessionRestrictionWhitelistIpPattern.Pattern }
     * 
     */
    public ConfigRoot.GlobalSettings.GlobalSetting.SessionRestrictionWhitelistIpPattern.Pattern createConfigRootGlobalSettingsGlobalSettingSessionRestrictionWhitelistIpPatternPattern() {
        return new ConfigRoot.GlobalSettings.GlobalSetting.SessionRestrictionWhitelistIpPattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.UrlEncryptionPathExceptionPatterns }
     * 
     */
    public ConfigRoot.Mappings.Mapping.UrlEncryptionPathExceptionPatterns createConfigRootMappingsMappingUrlEncryptionPathExceptionPatterns() {
        return new ConfigRoot.Mappings.Mapping.UrlEncryptionPathExceptionPatterns();
    }

    /**
     * Create an instance of {@link ConfigRoot.Nodes.Node.PhysicalNetworkInterfaces.PhysicalNetworkInterface }
     * 
     */
    public ConfigRoot.Nodes.Node.PhysicalNetworkInterfaces.PhysicalNetworkInterface createConfigRootNodesNodePhysicalNetworkInterfacesPhysicalNetworkInterface() {
        return new ConfigRoot.Nodes.Node.PhysicalNetworkInterfaces.PhysicalNetworkInterface();
    }

    /**
     * Create an instance of {@link ConfigRoot.Nodes.Node.ManagementAddresses }
     * 
     */
    public ConfigRoot.Nodes.Node.ManagementAddresses createConfigRootNodesNodeManagementAddresses() {
        return new ConfigRoot.Nodes.Node.ManagementAddresses();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages createConfigRootMappingsMappingDenyRuleGroupUsages() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.HttpHeaderNamePattern }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.HttpHeaderNamePattern createConfigRootDenyRulesDenyRuleHttpHeaderNamePattern() {
        return new ConfigRoot.DenyRules.DenyRule.HttpHeaderNamePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage.PathPattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage.PathPattern createConfigRootMappingsMappingIcapRequestServiceBackendViewUsagesIcapRequestServiceBackendViewUsagePathPattern() {
        return new ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage.PathPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.PathPattern.Pattern }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.PathPattern.Pattern createConfigRootDenyRulesDenyRulePathPatternPattern() {
        return new ConfigRoot.DenyRules.DenyRule.PathPattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.BackendErrorPageReplacements.BackendErrorPageReplacement }
     * 
     */
    public ConfigRoot.Mappings.Mapping.BackendErrorPageReplacements.BackendErrorPageReplacement createConfigRootMappingsMappingBackendErrorPageReplacementsBackendErrorPageReplacement() {
        return new ConfigRoot.Mappings.Mapping.BackendErrorPageReplacements.BackendErrorPageReplacement();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.GlobalResponseHeaderActionUsages.GlobalActionUsage }
     * 
     */
    public ConfigRoot.Mappings.Mapping.GlobalResponseHeaderActionUsages.GlobalActionUsage createConfigRootMappingsMappingGlobalResponseHeaderActionUsagesGlobalActionUsage() {
        return new ConfigRoot.Mappings.Mapping.GlobalResponseHeaderActionUsages.GlobalActionUsage();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.RequestHeaderActions.RequestHeaderAction.HeaderName }
     * 
     */
    public ConfigRoot.Mappings.Mapping.RequestHeaderActions.RequestHeaderAction.HeaderName createConfigRootMappingsMappingRequestHeaderActionsRequestHeaderActionHeaderName() {
        return new ConfigRoot.Mappings.Mapping.RequestHeaderActions.RequestHeaderAction.HeaderName();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.BackendHtmlContentRewrites }
     * 
     */
    public ConfigRoot.Mappings.Mapping.BackendHtmlContentRewrites createConfigRootMappingsMappingBackendHtmlContentRewrites() {
        return new ConfigRoot.Mappings.Mapping.BackendHtmlContentRewrites();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HeaderNamePattern.Pattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HeaderNamePattern.Pattern createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleExceptionHeaderNamePatternPattern() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HeaderNamePattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.RoutesV6 .RouteV6 }
     * 
     */
    public ConfigRoot.RoutesV6 .RouteV6 createConfigRootRoutesV6RouteV6() {
        return new ConfigRoot.RoutesV6 .RouteV6();
    }

    /**
     * Create an instance of {@link ConfigRoot.GlobalSettings }
     * 
     */
    public ConfigRoot.GlobalSettings createConfigRootGlobalSettings() {
        return new ConfigRoot.GlobalSettings();
    }

    /**
     * Create an instance of {@link ConfigRoot.BackendGroups.BackendGroup.BackendHosts }
     * 
     */
    public ConfigRoot.BackendGroups.BackendGroup.BackendHosts createConfigRootBackendGroupsBackendGroupBackendHosts() {
        return new ConfigRoot.BackendGroups.BackendGroup.BackendHosts();
    }

    /**
     * Create an instance of {@link ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction.DomainRewriteFrom }
     * 
     */
    public ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction.DomainRewriteFrom createConfigRootGlobalResponseHeaderActionsGlobalResponseHeaderActionDomainRewriteFrom() {
        return new ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction.DomainRewriteFrom();
    }

    /**
     * Create an instance of {@link ConfigRoot.GlobalResponseHeaderActions }
     * 
     */
    public ConfigRoot.GlobalResponseHeaderActions createConfigRootGlobalResponseHeaderActions() {
        return new ConfigRoot.GlobalResponseHeaderActions();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.AllowRules.AllowRule }
     * 
     */
    public ConfigRoot.Mappings.Mapping.AllowRules.AllowRule createConfigRootMappingsMappingAllowRulesAllowRule() {
        return new ConfigRoot.Mappings.Mapping.AllowRules.AllowRule();
    }

    /**
     * Create an instance of {@link ConfigRoot.VirtualHosts.VirtualHost.PathRewrites }
     * 
     */
    public ConfigRoot.VirtualHosts.VirtualHost.PathRewrites createConfigRootVirtualHostsVirtualHostPathRewrites() {
        return new ConfigRoot.VirtualHosts.VirtualHost.PathRewrites();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.ContentTypePattern.Pattern }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.ContentTypePattern.Pattern createConfigRootDenyRulesDenyRuleContentTypePatternPattern() {
        return new ConfigRoot.DenyRules.DenyRule.ContentTypePattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.VirtualHosts }
     * 
     */
    public ConfigRoot.VirtualHosts createConfigRootVirtualHosts() {
        return new ConfigRoot.VirtualHosts();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.BackendHttpRedirectLocationHeaderRewrites }
     * 
     */
    public ConfigRoot.Mappings.Mapping.BackendHttpRedirectLocationHeaderRewrites createConfigRootMappingsMappingBackendHttpRedirectLocationHeaderRewrites() {
        return new ConfigRoot.Mappings.Mapping.BackendHttpRedirectLocationHeaderRewrites();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.BackendHttpRedirectLocationHeaderRewrites.BackendHttpRedirectLocationHeaderRewrite }
     * 
     */
    public ConfigRoot.Mappings.Mapping.BackendHttpRedirectLocationHeaderRewrites.BackendHttpRedirectLocationHeaderRewrite createConfigRootMappingsMappingBackendHttpRedirectLocationHeaderRewritesBackendHttpRedirectLocationHeaderRewrite() {
        return new ConfigRoot.Mappings.Mapping.BackendHttpRedirectLocationHeaderRewrites.BackendHttpRedirectLocationHeaderRewrite();
    }

    /**
     * Create an instance of {@link ConfigRoot.BackendGroups.BackendGroup.BackendHosts.BackendHost }
     * 
     */
    public ConfigRoot.BackendGroups.BackendGroup.BackendHosts.BackendHost createConfigRootBackendGroupsBackendGroupBackendHostsBackendHost() {
        return new ConfigRoot.BackendGroups.BackendGroup.BackendHosts.BackendHost();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.HttpHeaderValuePattern.Pattern }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.HttpHeaderValuePattern.Pattern createConfigRootDenyRulesDenyRuleHttpHeaderValuePatternPattern() {
        return new ConfigRoot.DenyRules.DenyRule.HttpHeaderValuePattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ParameterNamePattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ParameterNamePattern createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleExceptionParameterNamePattern() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ParameterNamePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.IcapServices.IcapService }
     * 
     */
    public ConfigRoot.IcapServices.IcapService createConfigRootIcapServicesIcapService() {
        return new ConfigRoot.IcapServices.IcapService();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.AllowRuleParameter.ParameterValuePattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.AllowRuleParameter.ParameterValuePattern createConfigRootMappingsMappingAllowRulesAllowRuleAllowRuleParametersAllowRuleParameterParameterValuePattern() {
        return new ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.AllowRuleParameter.ParameterValuePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ParameterValuePattern.Pattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ParameterValuePattern.Pattern createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleExceptionParameterValuePatternPattern() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ParameterValuePattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.SslCertificates.SslCertificate.VirtualHostIds }
     * 
     */
    public ConfigRoot.SslCertificates.SslCertificate.VirtualHostIds createConfigRootSslCertificatesSslCertificateVirtualHostIds() {
        return new ConfigRoot.SslCertificates.SslCertificate.VirtualHostIds();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.IpPattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.IpPattern createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleExceptionIpPattern() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.IpPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.AllowRuleParameter }
     * 
     */
    public ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.AllowRuleParameter createConfigRootMappingsMappingAllowRulesAllowRuleAllowRuleParametersAllowRuleParameter() {
        return new ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.AllowRuleParameter();
    }

    /**
     * Create an instance of {@link ConfigRoot.Nodes.Node.ManagementAddresses.ManagementAddress }
     * 
     */
    public ConfigRoot.Nodes.Node.ManagementAddresses.ManagementAddress createConfigRootNodesNodeManagementAddressesManagementAddress() {
        return new ConfigRoot.Nodes.Node.ManagementAddresses.ManagementAddress();
    }

    /**
     * Create an instance of {@link ConfigRoot.IcapServices.IcapService.MappingIdsIcapReq }
     * 
     */
    public ConfigRoot.IcapServices.IcapService.MappingIdsIcapReq createConfigRootIcapServicesIcapServiceMappingIdsIcapReq() {
        return new ConfigRoot.IcapServices.IcapService.MappingIdsIcapReq();
    }

    /**
     * Create an instance of {@link ConfigRoot.BackendGroups.BackendGroup.MappingIds }
     * 
     */
    public ConfigRoot.BackendGroups.BackendGroup.MappingIds createConfigRootBackendGroupsBackendGroupMappingIds() {
        return new ConfigRoot.BackendGroups.BackendGroup.MappingIds();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.DenyRuleGroupIds }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.DenyRuleGroupIds createConfigRootDenyRulesDenyRuleDenyRuleGroupIds() {
        return new ConfigRoot.DenyRules.DenyRule.DenyRuleGroupIds();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping }
     * 
     */
    public ConfigRoot.Mappings.Mapping createConfigRootMappingsMapping() {
        return new ConfigRoot.Mappings.Mapping();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HeaderNamePattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HeaderNamePattern createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleExceptionHeaderNamePattern() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HeaderNamePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction.HeaderValue }
     * 
     */
    public ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction.HeaderValue createConfigRootGlobalResponseHeaderActionsGlobalResponseHeaderActionHeaderValue() {
        return new ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction.HeaderValue();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.RequestHeaderActions.RequestHeaderAction }
     * 
     */
    public ConfigRoot.Mappings.Mapping.RequestHeaderActions.RequestHeaderAction createConfigRootMappingsMappingRequestHeaderActionsRequestHeaderAction() {
        return new ConfigRoot.Mappings.Mapping.RequestHeaderActions.RequestHeaderAction();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.RequestHeaderActions }
     * 
     */
    public ConfigRoot.Mappings.Mapping.RequestHeaderActions createConfigRootMappingsMappingRequestHeaderActions() {
        return new ConfigRoot.Mappings.Mapping.RequestHeaderActions();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.AllowRuleParameter.ParameterValuePattern.Pattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.AllowRuleParameter.ParameterValuePattern.Pattern createConfigRootMappingsMappingAllowRulesAllowRuleAllowRuleParametersAllowRuleParameterParameterValuePatternPattern() {
        return new ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.AllowRuleParameter.ParameterValuePattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Nodes }
     * 
     */
    public ConfigRoot.Nodes createConfigRootNodes() {
        return new ConfigRoot.Nodes();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRuleGroups.DenyRuleGroup }
     * 
     */
    public ConfigRoot.DenyRuleGroups.DenyRuleGroup createConfigRootDenyRuleGroupsDenyRuleGroup() {
        return new ConfigRoot.DenyRuleGroups.DenyRuleGroup();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.HttpMethodPattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.HttpMethodPattern createConfigRootMappingsMappingAllowRulesAllowRuleHttpMethodPattern() {
        return new ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.HttpMethodPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.GeneralBackendContentRewrites }
     * 
     */
    public ConfigRoot.Mappings.Mapping.GeneralBackendContentRewrites createConfigRootMappingsMappingGeneralBackendContentRewrites() {
        return new ConfigRoot.Mappings.Mapping.GeneralBackendContentRewrites();
    }

    /**
     * Create an instance of {@link ConfigRoot.VirtualHosts.VirtualHost.MappingIds }
     * 
     */
    public ConfigRoot.VirtualHosts.VirtualHost.MappingIds createConfigRootVirtualHostsVirtualHostMappingIds() {
        return new ConfigRoot.VirtualHosts.VirtualHost.MappingIds();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.GlobalRequestHeaderActionUsages }
     * 
     */
    public ConfigRoot.Mappings.Mapping.GlobalRequestHeaderActionUsages createConfigRootMappingsMappingGlobalRequestHeaderActionUsages() {
        return new ConfigRoot.Mappings.Mapping.GlobalRequestHeaderActionUsages();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages }
     * 
     */
    public ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages createConfigRootMappingsMappingIcapRequestServiceBackendViewUsages() {
        return new ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages();
    }

    /**
     * Create an instance of {@link ConfigRoot.SslCertificates.SslCertificate }
     * 
     */
    public ConfigRoot.SslCertificates.SslCertificate createConfigRootSslCertificatesSslCertificate() {
        return new ConfigRoot.SslCertificates.SslCertificate();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.UrlEncryptionPathExceptionPatterns.UrlEncryptionPathExceptionPattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.UrlEncryptionPathExceptionPatterns.UrlEncryptionPathExceptionPattern createConfigRootMappingsMappingUrlEncryptionPathExceptionPatternsUrlEncryptionPathExceptionPattern() {
        return new ConfigRoot.Mappings.Mapping.UrlEncryptionPathExceptionPatterns.UrlEncryptionPathExceptionPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.GlobalResponseHeaderActionUsages }
     * 
     */
    public ConfigRoot.Mappings.Mapping.GlobalResponseHeaderActionUsages createConfigRootMappingsMappingGlobalResponseHeaderActionUsages() {
        return new ConfigRoot.Mappings.Mapping.GlobalResponseHeaderActionUsages();
    }

    /**
     * Create an instance of {@link ConfigRoot.VirtualHosts.VirtualHost }
     * 
     */
    public ConfigRoot.VirtualHosts.VirtualHost createConfigRootVirtualHostsVirtualHost() {
        return new ConfigRoot.VirtualHosts.VirtualHost();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.ParameterValuePattern.Pattern }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.ParameterValuePattern.Pattern createConfigRootDenyRulesDenyRuleParameterValuePatternPattern() {
        return new ConfigRoot.DenyRules.DenyRule.ParameterValuePattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.JsonContentTypePattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.JsonContentTypePattern createConfigRootMappingsMappingJsonContentTypePattern() {
        return new ConfigRoot.Mappings.Mapping.JsonContentTypePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.PathPattern.Pattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.PathPattern.Pattern createConfigRootMappingsMappingAllowRulesAllowRulePathPatternPattern() {
        return new ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.PathPattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.NotificationChannels }
     * 
     */
    public ConfigRoot.NotificationChannels createConfigRootNotificationChannels() {
        return new ConfigRoot.NotificationChannels();
    }

    /**
     * Create an instance of {@link ConfigRoot.Routes.Route }
     * 
     */
    public ConfigRoot.Routes.Route createConfigRootRoutesRoute() {
        return new ConfigRoot.Routes.Route();
    }

    /**
     * Create an instance of {@link ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction.HeaderName }
     * 
     */
    public ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction.HeaderName createConfigRootGlobalResponseHeaderActionsGlobalResponseHeaderActionHeaderName() {
        return new ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction.HeaderName();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.PathPattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.PathPattern createConfigRootMappingsMappingAllowRulesAllowRulePathPattern() {
        return new ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.PathPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage }
     * 
     */
    public ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage createConfigRootMappingsMappingIcapRequestServiceBackendViewUsagesIcapRequestServiceBackendViewUsage() {
        return new ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.PathPattern.Pattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.PathPattern.Pattern createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleExceptionPathPatternPattern() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.PathPattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ParameterValuePattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ParameterValuePattern createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleExceptionParameterValuePattern() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ParameterValuePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.PathPattern }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.PathPattern createConfigRootDenyRulesDenyRulePathPattern() {
        return new ConfigRoot.DenyRules.DenyRule.PathPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings }
     * 
     */
    public ConfigRoot.Mappings createConfigRootMappings() {
        return new ConfigRoot.Mappings();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule createConfigRootDenyRulesDenyRule() {
        return new ConfigRoot.DenyRules.DenyRule();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.RequestBodyStreamingContentTypePattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.RequestBodyStreamingContentTypePattern createConfigRootMappingsMappingRequestBodyStreamingContentTypePattern() {
        return new ConfigRoot.Mappings.Mapping.RequestBodyStreamingContentTypePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ParameterNamePattern.Pattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ParameterNamePattern.Pattern createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleExceptionParameterNamePatternPattern() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ParameterNamePattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage.HttpMethodPattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage.HttpMethodPattern createConfigRootMappingsMappingIcapRequestServiceBackendViewUsagesIcapRequestServiceBackendViewUsageHttpMethodPattern() {
        return new ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage.HttpMethodPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Nodes.Node.BackendAddresses }
     * 
     */
    public ConfigRoot.Nodes.Node.BackendAddresses createConfigRootNodesNodeBackendAddresses() {
        return new ConfigRoot.Nodes.Node.BackendAddresses();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.RequestBodyStreamingPathPattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.RequestBodyStreamingPathPattern createConfigRootMappingsMappingRequestBodyStreamingPathPattern() {
        return new ConfigRoot.Mappings.Mapping.RequestBodyStreamingPathPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.GlobalRequestHeaderActions.GlobalRequestHeaderAction }
     * 
     */
    public ConfigRoot.GlobalRequestHeaderActions.GlobalRequestHeaderAction createConfigRootGlobalRequestHeaderActionsGlobalRequestHeaderAction() {
        return new ConfigRoot.GlobalRequestHeaderActions.GlobalRequestHeaderAction();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleUsages }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleUsages createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleUsages() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleUsages();
    }

    /**
     * Create an instance of {@link ConfigRoot.GlobalRequestHeaderActions.GlobalRequestHeaderAction.HeaderValue }
     * 
     */
    public ConfigRoot.GlobalRequestHeaderActions.GlobalRequestHeaderAction.HeaderValue createConfigRootGlobalRequestHeaderActionsGlobalRequestHeaderActionHeaderValue() {
        return new ConfigRoot.GlobalRequestHeaderActions.GlobalRequestHeaderAction.HeaderValue();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.HttpMethodPattern.Pattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.HttpMethodPattern.Pattern createConfigRootMappingsMappingAllowRulesAllowRuleHttpMethodPatternPattern() {
        return new ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.HttpMethodPattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.GlobalRequestHeaderActions }
     * 
     */
    public ConfigRoot.GlobalRequestHeaderActions createConfigRootGlobalRequestHeaderActions() {
        return new ConfigRoot.GlobalRequestHeaderActions();
    }

    /**
     * Create an instance of {@link ConfigRoot.Routes }
     * 
     */
    public ConfigRoot.Routes createConfigRootRoutes() {
        return new ConfigRoot.Routes();
    }

    /**
     * Create an instance of {@link ConfigRoot.BackendGroups.BackendGroup.BackendFailureDetectionInBandContentPattern }
     * 
     */
    public ConfigRoot.BackendGroups.BackendGroup.BackendFailureDetectionInBandContentPattern createConfigRootBackendGroupsBackendGroupBackendFailureDetectionInBandContentPattern() {
        return new ConfigRoot.BackendGroups.BackendGroup.BackendFailureDetectionInBandContentPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.ParameterNamePattern.Pattern }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.ParameterNamePattern.Pattern createConfigRootDenyRulesDenyRuleParameterNamePatternPattern() {
        return new ConfigRoot.DenyRules.DenyRule.ParameterNamePattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.GlobalSettings.GlobalSetting }
     * 
     */
    public ConfigRoot.GlobalSettings.GlobalSetting createConfigRootGlobalSettingsGlobalSetting() {
        return new ConfigRoot.GlobalSettings.GlobalSetting();
    }

    /**
     * Create an instance of {@link ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction.PathRewriteFrom }
     * 
     */
    public ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction.PathRewriteFrom createConfigRootGlobalResponseHeaderActionsGlobalResponseHeaderActionPathRewriteFrom() {
        return new ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction.PathRewriteFrom();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.IpPattern.Pattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.IpPattern.Pattern createConfigRootMappingsMappingAllowRulesAllowRuleIpPatternPattern() {
        return new ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.IpPattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ContentTypePattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ContentTypePattern createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleExceptionContentTypePattern() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ContentTypePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters }
     * 
     */
    public ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters createConfigRootMappingsMappingAllowRulesAllowRuleAllowRuleParameters() {
        return new ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.ContentTypePattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.ContentTypePattern createConfigRootMappingsMappingAllowRulesAllowRuleContentTypePattern() {
        return new ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.ContentTypePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot }
     * 
     */
    public ConfigRoot createConfigRoot() {
        return new ConfigRoot();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.ParameterValuePattern }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.ParameterValuePattern createConfigRootDenyRulesDenyRuleParameterValuePattern() {
        return new ConfigRoot.DenyRules.DenyRule.ParameterValuePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.SecurityLevels }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.SecurityLevels createConfigRootDenyRulesDenyRuleSecurityLevels() {
        return new ConfigRoot.DenyRules.DenyRule.SecurityLevels();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.IpPattern.Pattern }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.IpPattern.Pattern createConfigRootDenyRulesDenyRuleIpPatternPattern() {
        return new ConfigRoot.DenyRules.DenyRule.IpPattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRuleGroups }
     * 
     */
    public ConfigRoot.DenyRuleGroups createConfigRootDenyRuleGroups() {
        return new ConfigRoot.DenyRuleGroups();
    }

    /**
     * Create an instance of {@link ConfigRoot.BackendGroups.BackendGroup }
     * 
     */
    public ConfigRoot.BackendGroups.BackendGroup createConfigRootBackendGroupsBackendGroup() {
        return new ConfigRoot.BackendGroups.BackendGroup();
    }

    /**
     * Create an instance of {@link ConfigRoot.SslCertificates }
     * 
     */
    public ConfigRoot.SslCertificates createConfigRootSslCertificates() {
        return new ConfigRoot.SslCertificates();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.HttpMethodPattern.Pattern }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.HttpMethodPattern.Pattern createConfigRootDenyRulesDenyRuleHttpMethodPatternPattern() {
        return new ConfigRoot.DenyRules.DenyRule.HttpMethodPattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage.RequestHeaderValuePattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage.RequestHeaderValuePattern createConfigRootMappingsMappingIcapRequestServiceBackendViewUsagesIcapRequestServiceBackendViewUsageRequestHeaderValuePattern() {
        return new ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage.RequestHeaderValuePattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.DenyRules.DenyRule.IpPattern }
     * 
     */
    public ConfigRoot.DenyRules.DenyRule.IpPattern createConfigRootDenyRulesDenyRuleIpPattern() {
        return new ConfigRoot.DenyRules.DenyRule.IpPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HeaderValuePattern.Pattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HeaderValuePattern.Pattern createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleExceptionHeaderValuePatternPattern() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.HeaderValuePattern.Pattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.RequestHeaderActions.RequestHeaderAction.HeaderValue }
     * 
     */
    public ConfigRoot.Mappings.Mapping.RequestHeaderActions.RequestHeaderAction.HeaderValue createConfigRootMappingsMappingRequestHeaderActionsRequestHeaderActionHeaderValue() {
        return new ConfigRoot.Mappings.Mapping.RequestHeaderActions.RequestHeaderAction.HeaderValue();
    }

    /**
     * Create an instance of {@link ConfigRoot.NotificationChannels.NotificationChannel }
     * 
     */
    public ConfigRoot.NotificationChannels.NotificationChannel createConfigRootNotificationChannelsNotificationChannel() {
        return new ConfigRoot.NotificationChannels.NotificationChannel();
    }

    /**
     * Create an instance of {@link ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction }
     * 
     */
    public ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction createConfigRootGlobalResponseHeaderActionsGlobalResponseHeaderAction() {
        return new ConfigRoot.GlobalResponseHeaderActions.GlobalResponseHeaderAction();
    }

    /**
     * Create an instance of {@link ConfigRoot.SslVpnHosts.SslVpnHost }
     * 
     */
    public ConfigRoot.SslVpnHosts.SslVpnHost createConfigRootSslVpnHostsSslVpnHost() {
        return new ConfigRoot.SslVpnHosts.SslVpnHost();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.RequestBodyStreamingHttpMethodPattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.RequestBodyStreamingHttpMethodPattern createConfigRootMappingsMappingRequestBodyStreamingHttpMethodPattern() {
        return new ConfigRoot.Mappings.Mapping.RequestBodyStreamingHttpMethodPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.BackendGroups.BackendGroup.BackendFailureDetectionInBandStatusPattern }
     * 
     */
    public ConfigRoot.BackendGroups.BackendGroup.BackendFailureDetectionInBandStatusPattern createConfigRootBackendGroupsBackendGroupBackendFailureDetectionInBandStatusPattern() {
        return new ConfigRoot.BackendGroups.BackendGroup.BackendFailureDetectionInBandStatusPattern();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.AllowRules }
     * 
     */
    public ConfigRoot.Mappings.Mapping.AllowRules createConfigRootMappingsMappingAllowRules() {
        return new ConfigRoot.Mappings.Mapping.AllowRules();
    }

    /**
     * Create an instance of {@link ConfigRoot.Nodes.Node }
     * 
     */
    public ConfigRoot.Nodes.Node createConfigRootNodesNode() {
        return new ConfigRoot.Nodes.Node();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.BackendHtmlContentRewrites.BackendHtmlContentRewrite }
     * 
     */
    public ConfigRoot.Mappings.Mapping.BackendHtmlContentRewrites.BackendHtmlContentRewrite createConfigRootMappingsMappingBackendHtmlContentRewritesBackendHtmlContentRewrite() {
        return new ConfigRoot.Mappings.Mapping.BackendHtmlContentRewrites.BackendHtmlContentRewrite();
    }

    /**
     * Create an instance of {@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ContentTypePattern.Pattern }
     * 
     */
    public ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ContentTypePattern.Pattern createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleExceptionContentTypePatternPattern() {
        return new ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.ContentTypePattern.Pattern();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IcapRequestServiceBackendViewUsage", scope = ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.class)
    public JAXBElement<ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage> createConfigRootMappingsMappingIcapRequestServiceBackendViewUsagesIcapRequestServiceBackendViewUsage(ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage value) {
        return new JAXBElement<ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage>(_ConfigRootMappingsMappingIcapRequestServiceBackendViewUsagesIcapRequestServiceBackendViewUsage_QNAME, ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.IcapRequestServiceBackendViewUsage.class, ConfigRoot.Mappings.Mapping.IcapRequestServiceBackendViewUsages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MappingId", scope = ConfigRoot.BackendGroups.BackendGroup.MappingIds.class)
    public JAXBElement<Short> createConfigRootBackendGroupsBackendGroupMappingIdsMappingId(Short value) {
        return new JAXBElement<Short>(_ConfigRootBackendGroupsBackendGroupMappingIdsMappingId_QNAME, Short.class, ConfigRoot.BackendGroups.BackendGroup.MappingIds.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DenyRuleException", scope = ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.class)
    public JAXBElement<ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException> createConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleException(ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException value) {
        return new JAXBElement<ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException>(_ConfigRootMappingsMappingDenyRuleGroupUsagesDenyRuleGroupUsageDenyRuleExceptionsDenyRuleException_QNAME, ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.DenyRuleException.class, ConfigRoot.Mappings.Mapping.DenyRuleGroupUsages.DenyRuleGroupUsage.DenyRuleExceptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.AllowRuleParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AllowRuleParameter", scope = ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.class)
    public JAXBElement<ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.AllowRuleParameter> createConfigRootMappingsMappingAllowRulesAllowRuleAllowRuleParametersAllowRuleParameter(ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.AllowRuleParameter value) {
        return new JAXBElement<ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.AllowRuleParameter>(_ConfigRootMappingsMappingAllowRulesAllowRuleAllowRuleParametersAllowRuleParameter_QNAME, ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.AllowRuleParameter.class, ConfigRoot.Mappings.Mapping.AllowRules.AllowRule.AllowRuleParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigRoot.Mappings.Mapping.BackendHttpRedirectLocationHeaderRewrites.BackendHttpRedirectLocationHeaderRewrite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BackendHttpRedirectLocationHeaderRewrite", scope = ConfigRoot.Mappings.Mapping.BackendHttpRedirectLocationHeaderRewrites.class)
    public JAXBElement<ConfigRoot.Mappings.Mapping.BackendHttpRedirectLocationHeaderRewrites.BackendHttpRedirectLocationHeaderRewrite> createConfigRootMappingsMappingBackendHttpRedirectLocationHeaderRewritesBackendHttpRedirectLocationHeaderRewrite(ConfigRoot.Mappings.Mapping.BackendHttpRedirectLocationHeaderRewrites.BackendHttpRedirectLocationHeaderRewrite value) {
        return new JAXBElement<ConfigRoot.Mappings.Mapping.BackendHttpRedirectLocationHeaderRewrites.BackendHttpRedirectLocationHeaderRewrite>(_ConfigRootMappingsMappingBackendHttpRedirectLocationHeaderRewritesBackendHttpRedirectLocationHeaderRewrite_QNAME, ConfigRoot.Mappings.Mapping.BackendHttpRedirectLocationHeaderRewrites.BackendHttpRedirectLocationHeaderRewrite.class, ConfigRoot.Mappings.Mapping.BackendHttpRedirectLocationHeaderRewrites.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VirtualHostId", scope = ConfigRoot.SslCertificates.SslCertificate.VirtualHostIds.class)
    public JAXBElement<Short> createConfigRootSslCertificatesSslCertificateVirtualHostIdsVirtualHostId(Short value) {
        return new JAXBElement<Short>(_ConfigRootSslCertificatesSslCertificateVirtualHostIdsVirtualHostId_QNAME, Short.class, ConfigRoot.SslCertificates.SslCertificate.VirtualHostIds.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigRoot.Mappings.Mapping.GeneralBackendContentRewrites.GeneralBackendContentRewrite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GeneralBackendContentRewrite", scope = ConfigRoot.Mappings.Mapping.GeneralBackendContentRewrites.class)
    public JAXBElement<ConfigRoot.Mappings.Mapping.GeneralBackendContentRewrites.GeneralBackendContentRewrite> createConfigRootMappingsMappingGeneralBackendContentRewritesGeneralBackendContentRewrite(ConfigRoot.Mappings.Mapping.GeneralBackendContentRewrites.GeneralBackendContentRewrite value) {
        return new JAXBElement<ConfigRoot.Mappings.Mapping.GeneralBackendContentRewrites.GeneralBackendContentRewrite>(_ConfigRootMappingsMappingGeneralBackendContentRewritesGeneralBackendContentRewrite_QNAME, ConfigRoot.Mappings.Mapping.GeneralBackendContentRewrites.GeneralBackendContentRewrite.class, ConfigRoot.Mappings.Mapping.GeneralBackendContentRewrites.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigRoot.Mappings.Mapping.BackendHtmlContentRewrites.BackendHtmlContentRewrite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BackendHtmlContentRewrite", scope = ConfigRoot.Mappings.Mapping.BackendHtmlContentRewrites.class)
    public JAXBElement<ConfigRoot.Mappings.Mapping.BackendHtmlContentRewrites.BackendHtmlContentRewrite> createConfigRootMappingsMappingBackendHtmlContentRewritesBackendHtmlContentRewrite(ConfigRoot.Mappings.Mapping.BackendHtmlContentRewrites.BackendHtmlContentRewrite value) {
        return new JAXBElement<ConfigRoot.Mappings.Mapping.BackendHtmlContentRewrites.BackendHtmlContentRewrite>(_ConfigRootMappingsMappingBackendHtmlContentRewritesBackendHtmlContentRewrite_QNAME, ConfigRoot.Mappings.Mapping.BackendHtmlContentRewrites.BackendHtmlContentRewrite.class, ConfigRoot.Mappings.Mapping.BackendHtmlContentRewrites.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigRoot.Mappings.Mapping.RequestHeaderActions.RequestHeaderAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RequestHeaderAction", scope = ConfigRoot.Mappings.Mapping.RequestHeaderActions.class)
    public JAXBElement<ConfigRoot.Mappings.Mapping.RequestHeaderActions.RequestHeaderAction> createConfigRootMappingsMappingRequestHeaderActionsRequestHeaderAction(ConfigRoot.Mappings.Mapping.RequestHeaderActions.RequestHeaderAction value) {
        return new JAXBElement<ConfigRoot.Mappings.Mapping.RequestHeaderActions.RequestHeaderAction>(_ConfigRootMappingsMappingRequestHeaderActionsRequestHeaderAction_QNAME, ConfigRoot.Mappings.Mapping.RequestHeaderActions.RequestHeaderAction.class, ConfigRoot.Mappings.Mapping.RequestHeaderActions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigRoot.Mappings.Mapping.BackendErrorPageReplacements.BackendErrorPageReplacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BackendErrorPageReplacement", scope = ConfigRoot.Mappings.Mapping.BackendErrorPageReplacements.class)
    public JAXBElement<ConfigRoot.Mappings.Mapping.BackendErrorPageReplacements.BackendErrorPageReplacement> createConfigRootMappingsMappingBackendErrorPageReplacementsBackendErrorPageReplacement(ConfigRoot.Mappings.Mapping.BackendErrorPageReplacements.BackendErrorPageReplacement value) {
        return new JAXBElement<ConfigRoot.Mappings.Mapping.BackendErrorPageReplacements.BackendErrorPageReplacement>(_ConfigRootMappingsMappingBackendErrorPageReplacementsBackendErrorPageReplacement_QNAME, ConfigRoot.Mappings.Mapping.BackendErrorPageReplacements.BackendErrorPageReplacement.class, ConfigRoot.Mappings.Mapping.BackendErrorPageReplacements.class, value);
    }

}
