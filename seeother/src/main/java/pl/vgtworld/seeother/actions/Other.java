package pl.vgtworld.seeother.actions;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/other")
public class Other {
	
	@GET
	public String getOther() {
		return "<h1>Other</h1>"
			+ "<a href=\"home\">go to home</a>";
	}
}
