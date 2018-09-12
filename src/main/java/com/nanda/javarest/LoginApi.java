package com.nanda.javarest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class LoginApi {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getNameValue() {
		return "Nanda";
	}
	
}
