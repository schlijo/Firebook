package ch.basler.fire.dom;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class GeneralBackendContentRewrite {

  private String name;
  private List<String> value;
  private String rewriteFrom;
  private String rewriteTo;
  private String ignoreCase;

  public String getRewriteFrom() {
    return rewriteFrom;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getValue() {
    return value;
  }

  public void setValue(String value) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(value);
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
}
