package org.hrb.showroom.resources;
/*
 * 1) @HeaderParam, cookieParam,UriInfo, absolutePath , @Context
 * 2) WebException handling
 * 3) exception with response object
 * 4) Generic exception 
 */


import javax.servlet.ServletContext;

import org.hrb.showroom.model.ErrorPayload;

import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

// as produces is common for all methods so added in class level
// to get the headers and other parts from the request.
@Path("/")
public class Demo {

	// If we dont know the name of the context then then using this Context
	// annotation we can extract the information
	// Context represents entire environment
	// UriInfo is a interface which is available to us and we can extract info from
	// that object.

	/*
	 * @Context private UriInfo uriInfo;
	 * 
	 * @Context private ServletContext servletContext;
	 */

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String usefullAnnotations(@HeaderParam("HeaderValue") String header, @CookieParam("_xsrf") String xsrf) {

		
		return "hello jax-rs";
		//return "HeaderValue:" + header + " ,Cookie xsrf :" + xsrf;

	}

	
	// to get all the headers available in api request.
	
	@GET
	@Path("demo")
	@Produces({MediaType.TEXT_PLAIN,MediaType.APPLICATION_JSON})
	//public String contextDemo(@Context HttpHeaders header) throws Exception {
	public String contextDemo(@HeaderParam("Content-Type")String header) throws Exception {
		
		//ErrorPayload errorPayload=new ErrorPayload(404,"The value of custom header not found!");
		//Response response = Response.status(404).entity(errorPayload).build();
		
		
		if(header==null) {
			//throw new WebApplicationException(response);
			// this will fetch our generic exception
			// if we threw NotFoundException this custom exception then it will work bt if any we threw then genericException will throw.
			throw new NotFoundException();
		}
		
		
		return "value of custom header :"+header;
		//return header.getRequestHeaders().keySet().toString();
		//return "Absolute Path: "+uriInfo.getAbsolutePath().toString();

	}

}
