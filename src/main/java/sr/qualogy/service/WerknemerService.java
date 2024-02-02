package sr.qualogy.service;

import jakarta.persistence.EntityManager;
import sr.qualogy.configuration.JPAConfiguration;
import sr.qualogy.entity.Werknemer;
import sr.qualogy.repository.WerknemerRepository;

import java.util.List;

public class WerknemerService {

    private final WerknemerRepository werknemerRepository;

    public WerknemerService() {
        this.werknemerRepository = new WerknemerRepository(JPAConfiguration.getEntityManager());
    }

    public List<Werknemer> getWerknemers(){
        return werknemerRepository.getWerknemers();
    }

    public Werknemer saveWerknemer(Werknemer werknemer) {
        return werknemerRepository.saveWerknemer(werknemer);
    }
}
