package repositories;

import entitiess.CheckInEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Transactional
@Repository
public class CheckInRepository {
    @Autowired
    EntityManager entityManager;
    public void addCheckIn(CheckInEntity checkIn){
        entityManager.persist(checkIn);
    }
    public void deleteCheckIn(CheckInEntity checkIn){
        entityManager.remove(checkIn);

    }
    public List<CheckInEntity> getCheckInByid(Long checkIn){
        return entityManager.createQuery("Select checkin from CheckInEntity checkin where checkin.id=?1",CheckInEntity.class).getResultList();
    }
    public Integer getsum(long id){
        return entityManager.createQuery("Select sum() from check_in where id=?1",CheckInEntity.class);
    }
}
