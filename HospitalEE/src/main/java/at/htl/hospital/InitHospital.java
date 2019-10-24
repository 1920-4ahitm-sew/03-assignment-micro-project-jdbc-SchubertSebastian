package at.htl.hospital;

import at.htl.hospital.entity.Worker;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Destroyed;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class InitHospital {

    @PersistenceContext
    EntityManager em;

    public void init(@Observes @Initialized(ApplicationScoped.class) Object init) {
        System.out.println("***** it works *****");

        Worker worker = new Worker("Mark", "Bauer", 20);
        em.persist(worker);
        Worker worker2 = new Worker("Markus", "Bauer", 20);
        em.persist(worker2);


    }

    public void tearDown(@Observes @Destroyed(ApplicationScoped.class) Object init) {
        // when app is undeployed
    }
}
