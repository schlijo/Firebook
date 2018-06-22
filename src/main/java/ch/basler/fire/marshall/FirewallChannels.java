package ch.basler.fire.marshall;

import java.net.URI;
import java.util.Collections;
import java.util.Comparator;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import ch.basler.fire.dom.Channel;
import ch.basler.fire.dom.Channels;
import ch.basler.fire.jaxb.ConfigRoot;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "firebook")
@Path("/firewallchannels")
public class FirewallChannels {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @ApiOperation(value = "List all channels from the firewall configuration file (alec-full.xml)")
  public Channels getChannels() throws Exception {
    Channels channels = new Channels();
    ConfigRoot configRoot = new AirlogConfigFileMarshaller().parseAlecFullFile();
    for (ConfigRoot.Mappings.Mapping currentMapping : configRoot.getMappings().getMapping()) {
      Channel channel = new Channel();
      channel.setName(currentMapping.getName());
      channels.getChannelList().add(channel);
    }
    Collections.sort(channels.getChannelList(), new Comparator<Channel>() {
      @Override
      public int compare(Channel o1, Channel o2) {
        return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
      }
    });
    return channels;
  }

  static Source[] toStreamSources(@NotNull final URI stream) {
    return new Source[] {new StreamSource(stream.toString())};
  }

}
