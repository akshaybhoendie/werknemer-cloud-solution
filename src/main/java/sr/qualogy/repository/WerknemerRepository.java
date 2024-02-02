package sr.qualogy.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import sr.qualogy.entity.Werknemer;

import java.util.List;

public class WerknemerRepository {

    private EntityManager entityManager;

    public WerknemerRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Werknemer saveWerknemer(Werknemer werknemer){
        entityManager.getTransaction().begin();
        entityManager.persist(werknemer);
        entityManager.getTransaction().commit();

        return werknemer;
    }

    public List<Werknemer> getWerknemers() {
        String sql = "select w from Werknemer w";
        TypedQuery<Werknemer> typedQuery = entityManager.createQuery(sql, Werknemer.class);
        List<Werknemer> werknemers = typedQuery.getResultList();

        return werknemers;
    }
}
