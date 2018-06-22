package ch.basler.fire.dom;

import ch.basler.firebook.jaxb.ConfigRoot;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class ChannelSetting {
  private List<RequestHeaderAction> requestHeaderActions;
  private List<BackendHttpRedirectLocationHeaderRewrite> backendHttpRedirectLocationHeaderRewrites;
  private String entryPath;
  private String virtuallHost;
  private String threatHandling;
  private String operationalMode;
  private String credentialsPropagationType;
  private String credentialsPropagationMandatory;
  private String controlApi;
  private String envCookies;
  private String maintenancePage;
  private String outputCompression;
  private String sessionHandling;
  private String loadBalancingCookie;
  private String sslClientCertAuthentication;
  private String ntlmPassthrough;
  private String authenticationFlow;
  private String authorizedRoles;
  private String deniedAccessUrl;
  private String deniedAccessUrlMode;
  private short backendTimeout;
  private short minSessionIdleTimeout;
  private String backendLogoutUrl;
  private String entryPathIgnoreCase;
  private short backendGroupId;
  private String backendPath;
  private String requestFrequencyFilter;
  private short requestFrequencyFilterMaxRequestsPerInterval;
  private byte requestFrequencyFilterInterval;
  private String backendHttpRedirectLocationHeaderRewriteComment;
  private String backendHttpRedirectLocationHeaderRewriteMode;
  private String name;
  private String backendEndpoint;
  private String includePortalHeaders;
  private String encryptedCookiePrefix;
  private String passthroughCookiePrefix;
  private int requestBodySizeLimit;
  private short maxPathLength;
  private int maxNumberOfParameters;
  private short maxParameterNameLength;
  private int maxParameterValueLength;
  private List<GeneralBackendContentRewrite> generalBackendContentRewrite;
  private List<BackendHtmlContentRewrite> backendHtmlContentRewrites;
  private List<AllowRule> allowRules;
  private AllowRuleParameterNameException allowRuleParameterNameException;
  private String latestCommitDate;
  //  private ConfigRoot.Mappings.Mapping.AllowRuleParameterNameException allowRuleParameterNameException;

  public String getName() {
    return name;
  }

  public String getNtlmPassthrough() {
    return ntlmPassthrough;
  }

  public void setNtlmPassthrough(String ntlmPassthrough) {
    this.ntlmPassthrough = ntlmPassthrough;
  }

  public String getThreatHandling() {
    return threatHandling;
  }

  public String getOperationalMode() {
    return operationalMode;
  }

  public String getCredentialsPropagationType() {
    return credentialsPropagationType;
  }

  public String getCredentialsPropagationMandatory() {
    return credentialsPropagationMandatory;
  }

  public String getControlApi() {
    return controlApi;
  }

  public String getEnvCookies() {
    return envCookies;
  }

  public String getMaintenancePage() {
    return maintenancePage;
  }

  public String getOutputCompression() {
    return outputCompression;
  }

  public String getSessionHandling() {
    return sessionHandling;
  }

  public String getLoadBalancingCookie() {
    return loadBalancingCookie;
  }

  public String getSslClientCertAuthentication() {
    return sslClientCertAuthentication;
  }

  public String getAuthenticationFlow() {
    return authenticationFlow;
  }

  public String getAuthorizedRoles() {
    return authorizedRoles;
  }

  public String getDeniedAccessUrl() {
    return deniedAccessUrl;
  }

  public String getDeniedAccessUrlMode() {
    return deniedAccessUrlMode;
  }

  public short getBackendTimeout() {
    return backendTimeout;
  }

  public short getMinSessionIdleTimeout() {
    return minSessionIdleTimeout;
  }

  public String getBackendLogoutUrl() {
    return backendLogoutUrl;
  }

  public String getEntryPathIgnoreCase() {
    return entryPathIgnoreCase;
  }

  public short getBackendGroupId() {
    return backendGroupId;
  }

  public String getBackendPath() {
    return backendPath;
  }

  public String getRequestFrequencyFilter() {
    return requestFrequencyFilter;
  }

  public short getRequestFrequencyFilterMaxRequestsPerInterval() {
    return requestFrequencyFilterMaxRequestsPerInterval;
  }

  public byte getRequestFrequencyFilterInterval() {
    return requestFrequencyFilterInterval;
  }

  public String getBackendHttpRedirectLocationHeaderRewriteComment() {
    return backendHttpRedirectLocationHeaderRewriteComment;
  }

  public String getBackendHttpRedirectLocationHeaderRewriteMode() {
    return backendHttpRedirectLocationHeaderRewriteMode;
  }

  public String getVirtuallHost() {
    return virtuallHost;
  }

  public void setVirtuallHost(String virtuallHost) {
    this.virtuallHost = virtuallHost;
  }

  public String getEntryPath() {
    return entryPath;
  }

  public void setEntryPath(String entryPath) {
    this.entryPath = entryPath;
  }

  public void setThreatHandling(String threatHandling) {
    this.threatHandling = threatHandling;
  }

  public void setOperationalMode(String operationalMode) {
    this.operationalMode = operationalMode;
  }

  public void setCredentialsPropagationType(String credentialsPropagationType) {
    this.credentialsPropagationType = credentialsPropagationType;
  }

  public void setCredentialsPropagationMandatory(String credentialsPropagationMandatory) {
    this.credentialsPropagationMandatory = credentialsPropagationMandatory;
  }

  public void setControlApi(String controlApi) {
    this.controlApi = controlApi;
  }

  public void setEnvCookies(String envCookies) {
    this.envCookies = envCookies;
  }

  public void setMaintenancePage(String maintenancePage) {
    this.maintenancePage = maintenancePage;
  }

  public void setOutputCompression(String outputCompression) {
    this.outputCompression = outputCompression;
  }

  public void setSessionHandling(String sessionHandling) {
    this.sessionHandling = sessionHandling;
  }

  public void setLoadBalancingCookie(String loadBalancingCookie) {
    this.loadBalancingCookie = loadBalancingCookie;
  }

  public void setSslClientCertAuthentication(String sslClientCertAuthentication) {
    this.sslClientCertAuthentication = sslClientCertAuthentication;
  }

  public void setNTLMPassthrough(String ntlmPassthrough) {
    this.ntlmPassthrough = ntlmPassthrough;
  }

  public void setAuthenticationFlow(String authenticationFlow) {
    this.authenticationFlow = authenticationFlow;
  }

  public void setAuthorizedRoles(String authorizedRoles) {
    this.authorizedRoles = authorizedRoles;
  }

  public void setDeniedAccessUrl(String deniedAccessUrl) {
    this.deniedAccessUrl = deniedAccessUrl;
  }

  public void setDeniedAccessUrlMode(String deniedAccessUrlMode) {
    this.deniedAccessUrlMode = deniedAccessUrlMode;
  }

  public void setBackendTimeout(short s) {
    this.backendTimeout = s;
  }

  public void setMinSessionIdleTimeout(short s) {
    this.minSessionIdleTimeout = s;
  }

  public void setBackendLogoutUrl(String backendLogoutUrl) {
    this.backendLogoutUrl = backendLogoutUrl;
  }

  public void setEntryPathIgnoreCase(String entryPathIgnoreCase) {
    this.entryPathIgnoreCase = entryPathIgnoreCase;
  }

  public void setBackendGroupId(short backendGroupId) {
    this.backendGroupId = backendGroupId;
  }

  public void setBackendPath(String backendPath) {
    this.backendPath = backendPath;
  }

  public void setRequestFrequencyFilter(String requestFrequencyFilter) {
    this.requestFrequencyFilter = requestFrequencyFilter;
  }

  public void setRequestFrequencyFilterMaxRequestsPerInterval(short requestFrequencyFilterMaxRequestsPerInterval) {
    this.requestFrequencyFilterMaxRequestsPerInterval = requestFrequencyFilterMaxRequestsPerInterval;
  }

  public void setRequestFrequencyFilterInterval(byte requestFrequencyFilterInterval) {
    this.requestFrequencyFilterInterval = requestFrequencyFilterInterval;
  }

  public void setBackendHttpRedirectLocationHeaderRewriteComment(String backendHttpRedirectLocationHeaderRewriteComment) {
    this.backendHttpRedirectLocationHeaderRewriteComment = backendHttpRedirectLocationHeaderRewriteComment;
  }

  public void setBackendHttpRedirectLocationHeaderRewriteMode(String backendHttpRedirectLocationHeaderRewriteMode) {
    this.backendHttpRedirectLocationHeaderRewriteMode = backendHttpRedirectLocationHeaderRewriteMode;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBackendEndpoint() {
    return backendEndpoint;
  }

  public void setBackendEndpoint(String backendEndpoint) {
    this.backendEndpoint = backendEndpoint;
  }

  public void setIncludePortalHeaders(String includePortalHeaders) {
    this.includePortalHeaders = includePortalHeaders;
  }

  public String getIncludePortalHeaders() {
    return includePortalHeaders;
  }

  public void setEncryptedCookiePrefix(String encryptedCookiePrefix) {
    this.encryptedCookiePrefix = encryptedCookiePrefix;
  }

  public String getEncryptedCookiePrefix() {
    return encryptedCookiePrefix;
  }

  public void setPassthroughCookiePrefix(String passthroughCookiePrefix) {
    this.passthroughCookiePrefix = passthroughCookiePrefix;
  }

  public String getPassthroughCookiePrefix() {
    return passthroughCookiePrefix;
  }

  public void setRequestBodySizeLimit(int requestBodySizeLimit) {
    this.requestBodySizeLimit = requestBodySizeLimit;
  }

  public int getRequestBodySizeLimit() {
    return requestBodySizeLimit;
  }

  public void setMaxPathLength(short maxPathLength) {
    this.maxPathLength = maxPathLength;
  }

  public short getMaxPathLength() {
    return maxPathLength;
  }

  public void setMaxNumberOfParameters(int maxNumberOfParameters) {
    this.maxNumberOfParameters = maxNumberOfParameters;
  }

  public int getMaxNumberOfParameters() {
    return maxNumberOfParameters;
  }

  public void setMaxParameterNameLength(short maxParameterNameLength) {
    this.maxParameterNameLength = maxParameterNameLength;
  }

  public short getMaxParameterNameLength() {
    return maxParameterNameLength;
  }

  public void setMaxParameterValueLength(int maxParameterValueLength) {
    this.maxParameterValueLength = maxParameterValueLength;
  }

  public List<RequestHeaderAction> getRequestHeaderActions() {
    return requestHeaderActions;
  }

  public void setRequestHeaderAction(RequestHeaderAction blub) {
    if (this.requestHeaderActions == null) {
      this.requestHeaderActions = new ArrayList<>();
    }
    this.requestHeaderActions.add(blub);
  }

  public List<BackendHttpRedirectLocationHeaderRewrite> getBackendHttpRedirectLocationHeaderRewrites() {
    return backendHttpRedirectLocationHeaderRewrites;
  }

  public void setBackendHttpRedirectLocationHeaderRewrites(BackendHttpRedirectLocationHeaderRewrite backendHttpRedirectLocationHeaderRewrite) {
    if (this.backendHttpRedirectLocationHeaderRewrites == null) {
      this.backendHttpRedirectLocationHeaderRewrites = new ArrayList<>();
    }
    this.backendHttpRedirectLocationHeaderRewrites.add(backendHttpRedirectLocationHeaderRewrite);
    this.backendHttpRedirectLocationHeaderRewrites = backendHttpRedirectLocationHeaderRewrites;
  }

  public List<GeneralBackendContentRewrite> getGeneralBackendContentRewrite() {
    return generalBackendContentRewrite;
  }

  public void setGeneralBackendContentRewrite(GeneralBackendContentRewrite generalBackendContentRewrite) {
    if (this.generalBackendContentRewrite == null) {
      this.generalBackendContentRewrite = new ArrayList<>();
    }
    this.generalBackendContentRewrite.add(generalBackendContentRewrite);
  }

  public List<BackendHtmlContentRewrite> getBackendHtmlContentRewrites() {
    return backendHtmlContentRewrites;
  }

  public void setBackendHtmlContentRewrites(BackendHtmlContentRewrite backendHtmlContentRewrites) {
    if (this.backendHtmlContentRewrites == null) {
      this.backendHtmlContentRewrites = new ArrayList<>();
    }
    this.backendHtmlContentRewrites.add(backendHtmlContentRewrites);
  }

  public List<AllowRule> getAllowRules() {
    return allowRules;
  }

  public void setAllowRules(AllowRule allowRules) {
    if (this.allowRules == null) {
      this.allowRules = new ArrayList<>();
    }
    this.allowRules.add(allowRules);
  }

  public int getMaxParameterValueLength() {
    return maxParameterValueLength;
  }

  public AllowRuleParameterNameException getAllowRuleParameterNameException() {
    return allowRuleParameterNameException;
  }

  public void setAllowRuleParameterNameException(AllowRuleParameterNameException allowRuleParameterNameException) {
    this.allowRuleParameterNameException = allowRuleParameterNameException;
  }

  public String getLatestCommitDate() {
    return latestCommitDate;
  }

  public void setLatestCommitDate(String latestCommitDate) {
    this.latestCommitDate = latestCommitDate;
  }

  //  public void setAllowRuleParameterNameException(ConfigRoot.Mappings.Mapping.AllowRuleParameterNameException allowRuleParameterNameException) {
  //    this.allowRuleParameterNameException = allowRuleParameterNameException;
  //  }
  //
  //  public ConfigRoot.Mappings.Mapping.AllowRuleParameterNameException getAllowRuleParameterNameException() {
  //    return allowRuleParameterNameException;
  //  }
}
