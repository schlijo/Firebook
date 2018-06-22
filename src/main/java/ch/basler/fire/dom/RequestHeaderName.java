package ch.basler.fire.dom;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestHeaderName {
  protected String patternString;
  protected String ignoreCase;
  protected String invertPattern;

  public String getPatternString() {
    return patternString;
  }

  public void setPatternString(String patternString) {
    this.patternString = patternString;
  }

  public String getIgnoreCase() {
    return ignoreCase;
  }

  public void setIgnoreCase(String ignoreCase) {
    this.ignoreCase = ignoreCase;
  }

  public String getInvertPattern() {
    return invertPattern;
  }

  public void setInvertPattern(String invertPattern) {
    this.invertPattern = invertPattern;
  }
}
