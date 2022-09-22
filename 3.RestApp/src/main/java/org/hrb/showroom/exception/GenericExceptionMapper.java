package org.hrb.showroom.exception;

import org.hrb.showroom.model.ErrorPayload;


import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
		

// This is Generic exception which implements exceptionMapper interface
// @provider annotation helps to find this class to jax-rs service

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable exception) {
		
		ErrorPayload errorPayload=new ErrorPayload(500,"Internal server error");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorPayload).build();
		
		
		
	}
	
	

}
