package ch.basler.fire.dom;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AllowRuleParameterNameException {

  protected String name;
  protected String active;
  protected String pattern;
  private String value;

  public String getName() {
    return name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }

  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }
}
