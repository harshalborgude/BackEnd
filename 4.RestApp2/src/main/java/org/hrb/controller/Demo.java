package org.hrb.controller;

import jakarta.inject.Singleton;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.MediaType;

// 1) Custom message body writer
// 2) Singleton object
// 3) @QueryParam -> this is taken as parameter,@PathParam -> this will be taken as a URI path only.
// http://localhost:8080/RestApp2/JAXRS/value/myname?x=test


// URI : http://localhost:8080/RestApp2/JAXRS/getMyApp
// per request new object of demo is created and after response it will die.and with that variables also will die.default to server multiple users
// @Singleton will make object to stay in memory for longer period of time.and will serve users multiple time till server restart.x
// so there is two types of objects singleton which stays or another which gets destroyed after serving request

@Path("/")
@Singleton
public class Demo {

	// This is class level vars now
	//@QueryParam("x") String x,
	//@PathParam("demo")String demo
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getMyApp")
	public Name myApp() {
		
		return new Name("john","Doe");
	}
	
	private int x=0; 
	
	@GET
	@Path("/app")
	@Produces(MediaType.TEXT_PLAIN)
	public String demo() {
		
		return "The value of x :"+(++x);
	}
	
	@GET
	@Path("/value/{demo}")
	@Produces(MediaType.TEXT_PLAIN)
	public String value(@QueryParam("x") String x,@PathParam("demo")String demo) {
		
		return "The value of x :"+(x)+"demo :"+demo;
	}
	
}
