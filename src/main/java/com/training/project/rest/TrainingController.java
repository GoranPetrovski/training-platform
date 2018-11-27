package com.training.project.rest;

import com.training.project.models.Training;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.*;

@Path("/training")
public class TrainingController {

    @GET
    @Produces(TEXT_PLAIN)
    public Response getTraining(){
        return Response.status(200).entity("hello").build();
    }

    @GET
    @Path("/ex")
    @Produces(APPLICATION_JSON)
    public Response getTrainings(){
        Training t = new Training();
        t.setName("11");
        return Response.status(200).entity(t).build();
    }
}
