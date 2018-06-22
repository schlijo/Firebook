package ch.basler.fire.dom;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Channels {
  private List<Channel> channelList;

  public Channels() {
    super();
    this.channelList = new ArrayList<Channel>();
  }

  public List<Channel> getChannelList() {
    return channelList;
  }

  public void setChannelList(List<Channel> channelList) {
    this.channelList = channelList;
  }

}
