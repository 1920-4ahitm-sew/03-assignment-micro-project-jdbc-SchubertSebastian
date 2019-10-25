package at.htl.hospital;


import at.htl.hospital.entity.Worker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class HospitalTest {


    static EntityManager em;

    @BeforeAll
    private static void init() {
        em = Persistence.createEntityManagerFactory("myPU")
                .createEntityManager();
    }

    @Test
    public void testWorkerInsert() {
        TypedQuery<Worker> query = em.createNamedQuery("Worker.find", Worker.class).setParameter(1, 1);
        Worker worker = query.getSingleResult();
        assertThat(worker.getVname(), is("Mark"));

    }



}
