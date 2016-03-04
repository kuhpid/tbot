package net.qpid.monte.bot.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("helloWorld")
public class HelloWorldEndpoint {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String helloWorld() {
		return "hello world";
	}
}