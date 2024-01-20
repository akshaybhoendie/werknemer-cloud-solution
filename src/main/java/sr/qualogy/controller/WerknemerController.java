package sr.qualogy.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/werknemer")
public class WerknemerController {

    @Path("/hello")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String helloWorld(){
        return "Hello World";
    }
}
