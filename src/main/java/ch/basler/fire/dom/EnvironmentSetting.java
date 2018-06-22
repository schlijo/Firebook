package ch.basler.fire.dom;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EnvironmentSetting {
  String entryPath;
  String virtuallHost;

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

}
