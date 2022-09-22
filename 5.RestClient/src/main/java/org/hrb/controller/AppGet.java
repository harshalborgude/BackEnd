package org.hrb.controller;

//1) Building a simple GET rest client using ClientBuilder

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation.Builder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/*

// client URI : http://localhost:8080/RestApp/showroom/brands
// own URI    : http://localhost:8080/RestClient/JAXRS/App

// This client will make api call to another application using client
// Response in Response format is not readable so converted into String format and that we can use 
@Path("/App")
public class AppGet {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/")
	public String myApp() {
		
		// Using this we are building a client which is able to make api request to another service
		Client client=ClientBuilder.newClient();
		
		// This is return in Response format which is non readable 
		//Response response=   client.target("http://localhost:8080/RestApp/showroom/brands").request().get();
		
		// This will return response in String format
		//String response=   client.target("http://localhost:8080/RestApp/showroom/brands").request(MediaType.APPLICATION_JSON).get(String.class);
		WebTarget baseBrandUrl=   client.target("http://localhost:8080/RestApp/showroom/brands");
		//WebTarget brandUrl= baseBrandUrl.path("3");
		WebTarget brandUrl= baseBrandUrl.path("{brandId}");
		
		String   response = brandUrl
				.resolveTemplate("brandId", "3")
				.request(MediaType.APPLICATION_JSON)
				.get(String.class);
		
		return response;
	}
	
	
}

*/







