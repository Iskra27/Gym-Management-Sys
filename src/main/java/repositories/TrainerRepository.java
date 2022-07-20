package repositories;

import entitiess.TrainerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Transactional
@Repository
public class TrainerRepository {
    @Autowired
    EntityManager entityManager;

    public void addTrainer(TrainerEntity trainer){
        entityManager.persist(trainer);
    }
    public void deleteTrainer(TrainerEntity trainer){
        entityManager.remove(trainer);
    }
    public void updateTrainer(TrainerEntity trainer) {
        entityManager.merge(trainer);
    }
    public List<TrainerEntity> getallTrainers(TrainerEntity trainer){
        return entityManager.createQuery("Select trainer.id,trainer.firstName,trainer.lastName from TrainerEntity trainer",TrainerEntity.class).getResultList();
    }
}
