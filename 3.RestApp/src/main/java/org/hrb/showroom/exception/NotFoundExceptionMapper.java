package org.hrb.showroom.exception;

import org.hrb.showroom.model.ErrorPayload;

import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
		

// This is Generic exception which implements exceptionMapper interface
// @provider annotation helps to find this class to jax-rs service

@Provider
public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException>{

	@Override
	public Response toResponse(NotFoundException exception) {
		
		ErrorPayload errorPayload=new ErrorPayload(500,"Internal server error");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorPayload).build();
		
		
		
	}
	
	

}
