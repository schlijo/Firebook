package ch.basler.fire.dom;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BackendHtmlContentRewrite {
  protected String rewriteFrom;
  protected String rewriteTo;
  protected String ignoreCase;
  protected String enabled;
  protected String uris;
  protected String events;
  protected String embedded;

  public String getRewriteFrom() {
    return rewriteFrom;
  }

  public void setRewriteFrom(String rewriteFrom) {
    this.rewriteFrom = rewriteFrom;
  }

  public String getRewriteTo() {
    return rewriteTo;
  }

  public void setRewriteTo(String rewriteTo) {
    this.rewriteTo = rewriteTo;
  }

  public String getIgnoreCase() {
    return ignoreCase;
  }

  public void setIgnoreCase(String ignoreCase) {
    this.ignoreCase = ignoreCase;
  }

  public String getEnabled() {
    return enabled;
  }

  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }

  public String getUris() {
    return uris;
  }

  public void setUris(String uris) {
    this.uris = uris;
  }

  public String getEvents() {
    return events;
  }

  public void setEvents(String events) {
    this.events = events;
  }

  public String getEmbedded() {
    return embedded;
  }

  public void setEmbedded(String embedded) {
    this.embedded = embedded;
  }
}
