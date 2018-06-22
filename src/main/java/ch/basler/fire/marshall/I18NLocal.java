package ch.basler.fire.marshall;

import ch.basler.fire.git.FirefileRepo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Api(value = "firebook")
@Path("/locales")
public class I18NLocal {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @ApiOperation(value = "Returns a json containing all needed translations in a format used by formatjs.")
  public Response getFormatJsLocal() throws Exception {
    FirefileRepo repo = new FirefileRepo();
    String i18n = repo.getLocales();
    return Response.status(200).entity(i18n).build();
  }
}
