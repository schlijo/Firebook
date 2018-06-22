package ch.basler.fire.marshall;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import ch.basler.fire.dom.EnvironmentSetting;

public class FirewallSettingTest {

  @Test
  @Ignore
  public void testEnvironmentTest() throws Exception {
    FirewallSetting firewallSetting = new FirewallSetting();
    EnvironmentSetting environmentSetting = firewallSetting.getEnvironmentSetting();
    assertEquals("", environmentSetting.getEntryPath());
  }

}
