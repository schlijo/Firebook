package ch.basler.fire.dom;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class ChannelStack {
  private ChannelSetting channelSetting;
//  private ChannelSetting intChannelSetting;
//  private ChannelSetting accChannelSetting;
//  private ChannelSetting prodChannelSetting;
  private List<String> displayOrder;
  public ChannelSetting getChannelSetting() {
    return channelSetting;
  }
  public void setChannelSetting(ChannelSetting channelSetting) {
    this.channelSetting = channelSetting;
  }
//  public ChannelSetting getIntChannelSetting() {
//    return intChannelSetting;
//  }
//  public void setIntChannelSetting(ChannelSetting intChannelSetting) {
//    this.intChannelSetting = intChannelSetting;
//  }
//  public ChannelSetting getAccChannelSetting() {
//    return accChannelSetting;
//  }
//  public void setAccChannelSetting(ChannelSetting accChannelSetting) {
//    this.accChannelSetting = accChannelSetting;
//  }
//  public ChannelSetting getProdChannelSetting() {
//    return prodChannelSetting;
//  }
//  public void setProdChannelSetting(ChannelSetting prodChannelSetting) {
//    this.prodChannelSetting = prodChannelSetting;
//  }

  public List<String> getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(List<String> displayOrder) {
    this.displayOrder = displayOrder;
  }
}
