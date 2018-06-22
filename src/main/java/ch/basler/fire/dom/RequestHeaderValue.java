package ch.basler.fire.dom;

public class RequestHeaderValue {
  private String patternString;
  private String ignoreCase;
  private String invertPattern;

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
