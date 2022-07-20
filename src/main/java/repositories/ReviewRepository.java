package repositories;

import entitiess.ReviewEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Transactional
@Repository
public class ReviewRepository {
    @Autowired
    private EntityManager entityManager;
    public void addReveiw(ReviewEntity entity) {
        entityManager.persist(entity);
    }

    public List<ReviewEntity> gettruereviews(){
        return entityManager.createQuery("Select review.id,review.ReviewInfo from ReviewEntity review where review.valid=true",ReviewEntity.class).getResultList();}
    public List<ReviewEntity> reviewsbyId(){
        return entityManager.createQuery("Select review.id,review.ReviewInfo from ReviewEntity review  where review.id=?1",ReviewEntity.class).getResultList();}
    public void updateReview(ReviewEntity review) {
        entityManager.merge(review);
    }
    public void softDeleteReview(ReviewEntity review) {
        review.setValid(Boolean.FALSE);
        updateReview(review);
    }

        public List<ReviewEntity> getAllR(){
            return entityManager.createQuery("Select review.id,review.ReviewInfo from ReviewEntity review where review.valid=true",ReviewEntity.class).getResultList();}

}
