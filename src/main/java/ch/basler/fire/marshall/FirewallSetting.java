package ch.basler.fire.marshall;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import ch.basler.fire.dom.EnvironmentSetting;
import ch.basler.fire.jaxb.ConfigRoot;
import ch.basler.fire.jaxb.ConfigRoot.VirtualHosts.VirtualHost;

@Path("/environmentsetting")
public class FirewallSetting {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public EnvironmentSetting getEnvironmentSetting() throws Exception {
    // "test"
    String environment = "test";
    ConfigRoot configRoot = new AirlogConfigFileMarshaller().parseAlecFullFile();
    EnvironmentSetting environmentSetting = new EnvironmentSetting();
    List<VirtualHost> virtualHost = configRoot.getVirtualHosts().getVirtualHost();
    for (VirtualHost host : virtualHost) {
      if ("".equals(host.getHostName())) {
        environmentSetting.setEntryPath(host.getHostName());
        environmentSetting.setVirtuallHost("virtuallHost");
      }
    }
    return environmentSetting;
  }

  static Source[] toStreamSources(@NotNull final URI stream) {
    return new Source[] {new StreamSource(stream.toString())};
  }
}
