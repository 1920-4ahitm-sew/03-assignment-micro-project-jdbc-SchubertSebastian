package at.htl.krankenhausee.boundery;

import at.htl.krankenhausee.entity.Mitarbeiter;

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
public class KrankenhausEndpoint {

    @PersistenceContext
    EntityManager em;

    @PostConstruct
    public void init(){
        System.err.println("++++++ Endpoint createt ++++++");
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Mitarbeiter getWorker(@PathParam("id") long id) {
        return em.find(Mitarbeiter.class,id);
    }

}
