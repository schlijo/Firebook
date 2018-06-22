package ch.basler.fire.dom;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Channel {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
