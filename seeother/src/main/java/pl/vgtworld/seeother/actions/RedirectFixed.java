package pl.vgtworld.seeother.actions;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("redirect-fixed")
public class RedirectFixed {
	
	@Context
	private UriInfo uriInfo;
	
	@GET
	public Response doRedirect() {
		URI uri = uriInfo.getBaseUriBuilder().replacePath("other").build();
		return Response.seeOther(uri).build();
	}
}
