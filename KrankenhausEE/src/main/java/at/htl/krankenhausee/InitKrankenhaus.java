package at.htl.krankenhausee;


import at.htl.krankenhausee.entity.Mitarbeiter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Destroyed;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class InitKrankenhaus {

    @PersistenceContext
    EntityManager em;

    public void init(@Observes @Initialized(ApplicationScoped.class) Object init) {
        System.out.println("***** it works  ********");

        Mitarbeiter worker = new Mitarbeiter("Markus","Müller",22);
        em.persist(worker);
    }

    public void tearDown(@Observes @Destroyed(ApplicationScoped.class) Object init) {

    }
}
