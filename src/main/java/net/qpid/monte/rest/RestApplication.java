package net.qpid.monte.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import net.qpid.monte.bot.helloworld.HelloWorldEndpoint;

@ApplicationPath("/rest/api")
public class RestApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(HelloWorldEndpoint.class);
		return super.getClasses();
	}
}
