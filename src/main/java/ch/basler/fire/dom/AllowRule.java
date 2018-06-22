package ch.basler.fire.dom;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AllowRule {
  private String name;
  private String pathPattern;
  private String httpMethodPattern;
  private String contentTypePattern;
  private String ipPattern;
  private String active;
  private String logOnly;
  private String value;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getPathPattern() {
    return pathPattern;
  }

  public void setPathPattern(String pathPattern) {
    this.pathPattern = pathPattern;
  }

  public String getHttpMethodPattern() {
    return httpMethodPattern;
  }

  public void setHttpMethodPattern(String httpMethodPattern) {
    this.httpMethodPattern = httpMethodPattern;
  }

  public String getContentTypePattern() {
    return contentTypePattern;
  }

  public void setContentTypePattern(String contentTypePattern) {
    this.contentTypePattern = contentTypePattern;
  }

  public String getIpPattern() {
    return ipPattern;
  }

  public void setIpPattern(String ipPattern) {
    this.ipPattern = ipPattern;
  }

  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }

  public String getLogOnly() {
    return logOnly;
  }

  public void setLogOnly(String logOnly) {
    this.logOnly = logOnly;
  }
}
