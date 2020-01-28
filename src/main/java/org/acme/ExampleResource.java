package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.smallrye.reactive.messaging.annotations.Channel;
import io.smallrye.reactive.messaging.annotations.Emitter;

@Path("/hello")
@ApplicationScoped
public class ExampleResource {

	private final static Logger LOG = LoggerFactory.getLogger(ExampleResource.class);
	
	@Inject 
    @Channel("hello") 
    Emitter<String> ownerCreatedChannel;
	
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response hello(ExampleModel example) {
    	ownerCreatedChannel.send(example.msg);
        return Response.status(202).build();
    }
    
    @Incoming("hello-incoming")
    public void consumer(String msg) {
    	LOG.info("Message {} has been consumed.", msg);
    }
}