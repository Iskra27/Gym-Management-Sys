package repositories;

import entitiess.MotivationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Transactional
@Repository
public class MotivationRepository {
    @Autowired
    EntityManager entityManager;
    public List<MotivationEntity> getallMotivation(MotivationEntity motivation){
        return entityManager.createQuery("Select motivation.MotivationQuote from MotivationEntity motivation order by random() LIMIT 1 ",MotivationEntity.class).getResultList();
    }//rregullo kte gabimin
    public void addMotivation(MotivationEntity motivation){
        entityManager.persist(motivation);
    }

}
