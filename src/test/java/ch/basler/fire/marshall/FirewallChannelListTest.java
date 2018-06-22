package ch.basler.fire.marshall;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import ch.basler.fire.dom.Channel;
import ch.basler.fire.dom.Channels;

public class FirewallChannelListTest {

  @Test
  @Ignore
  public void testReadChannelList() throws Exception {
    FirewallChannels firewallChannels = new FirewallChannels();
    Channels channels = firewallChannels.getChannels();
    List<Channel> channelList = channels.getChannelList();
    assertTrue(channelList.size() > 1);
  }
}
