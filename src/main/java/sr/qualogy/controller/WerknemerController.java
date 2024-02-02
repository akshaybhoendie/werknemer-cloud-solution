package sr.qualogy.controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import sr.qualogy.configuration.JPAConfiguration;
import sr.qualogy.entity.Werknemer;
import sr.qualogy.service.WerknemerService;

import java.util.List;

@Path("/werknemer")
public class WerknemerController {

    private final WerknemerService werknemerService;

    public WerknemerController() {
        this.werknemerService = new WerknemerService();
    }

    @Path("/hello")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String helloWorld(){
        return "Hello World";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Werknemer> getWerknemers(){
        return werknemerService.getWerknemers();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveWerknemer(Werknemer werknemer) {
        werknemer = werknemerService.saveWerknemer(werknemer);
        return Response.ok(werknemer, MediaType.APPLICATION_JSON_TYPE).build();
    }
}
