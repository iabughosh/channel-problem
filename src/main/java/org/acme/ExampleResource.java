package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/hello")
@ApplicationScoped
public class ExampleResource {

	private final static Logger LOG = LoggerFactory.getLogger(ExampleResource.class);
	
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response hello(ExampleModel example) {
        return Response.status(204, "Nice!!!").build();
    }
}