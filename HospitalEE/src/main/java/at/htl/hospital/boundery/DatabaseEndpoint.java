package at.htl.hospital.boundery;

import at.htl.hospital.entity.Worker;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("")
public class DatabaseEndpoint {
    @PersistenceContext
    EntityManager em;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response showWorker() {
        Worker w = em.find(Worker.class, 1L);
        return Response.ok(w).build();
    }
}
