package com.openwebinars.springbootjersey;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.springframework.stereotype.Component;

@Component
@Path("/message")
@Produces("application/json")
public class EndPoint {
	
	@Context
	private UriInfo uriInfo;	
	
	@GET
	public Message returnMessage(@QueryParam("msg") String msg) {
		
		if (msg == null)
			return new Message();
		else
			return new Message(msg);
	}
	
	
	@POST
	public Response submitMessage(Message message) {
		
		URI location = uriInfo.getAbsolutePathBuilder().build();
		
		return Response.created(location).build();
	}

}
