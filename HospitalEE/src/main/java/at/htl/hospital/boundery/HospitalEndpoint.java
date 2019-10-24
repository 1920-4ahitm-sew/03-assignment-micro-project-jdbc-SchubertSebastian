package at.htl.hospital.boundery;

import at.htl.hospital.entity.Worker;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("/")
public class HospitalEndpoint {

    @PersistenceContext
    EntityManager em;

    @PostConstruct
    public void init(){
        System.err.println("++++++ Endpoint created ++++++");
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Worker getWorker(@PathParam("id") long id) {

        return em.find(Worker.class,id);

    }

}
