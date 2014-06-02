package pl.vgtworld.seeother.actions;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/redirect")
public class Redirect {
	
	@GET
	public Response doRedirect() {
		return Response.seeOther(URI.create("other")).build();
	}
}
