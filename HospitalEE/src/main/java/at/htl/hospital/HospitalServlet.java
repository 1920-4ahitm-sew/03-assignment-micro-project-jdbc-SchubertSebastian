package at.htl.hospital;

import at.htl.hospital.entity.Worker;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("servlet")
public class HospitalServlet extends HttpServlet{
    @PersistenceContext
    EntityManager em;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        TypedQuery<Worker> query = em.createNamedQuery("Worker.findall", Worker.class);
        List<Worker> workers = query.getResultList();
        resp.getWriter().printf("" + workers);
    }
}
