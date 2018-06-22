package ch.basler.fire.marshall;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Ignore;
import org.junit.Test;

import ch.basler.fire.dom.ChannelStack;

public class FirewallChannelStackTest {

  @Test
  @Ignore
  public void testReadChannelStack() throws Exception {
    FirewallChannelStack firewallChannel = new FirewallChannelStack();
    ChannelStack channelStack = firewallChannel.getChannelStackForChannel("");
    assertEquals("//", channelStack.getChannelSetting().getEntryPath());
    assertThat(channelStack.getChannelSetting().getVirtuallHost(), is(""));
    assertThat(channelStack.getChannelSetting().getBackendEndpoint(), is(""));
  }

}
