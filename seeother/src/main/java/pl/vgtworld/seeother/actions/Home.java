package pl.vgtworld.seeother.actions;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/home")
public class Home {
	
	@GET
	public String getHome() {
		return "<h1>Home</h1>"
			+ "<a href=\"redirect-fixed\">go to other</a>";
	}
	
}
