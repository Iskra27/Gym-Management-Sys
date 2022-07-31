package repositories;

import dto.MotivationDto;
import entitiess.MotivationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Transactional
@Repository
public class MotivationRepository {
    private static final String MOTIVATION_QUOTE = "Select motivation.MotivationQuote from MotivationEntity motivation order by RAND() LIMIT 1 ";
    @Autowired
    EntityManager entityManager;
    public List<MotivationEntity> getallMotivation(MotivationDto motivation){
        return (List<MotivationEntity>) entityManager.createNamedQuery(MOTIVATION_QUOTE, MotivationEntity.class);
    }
    public void addMotivation(MotivationEntity motivation){
        entityManager.persist(motivation);
    }

}
