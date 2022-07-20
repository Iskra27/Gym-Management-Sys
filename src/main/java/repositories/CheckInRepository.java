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
    //get checkin byid
    //deletecheckin
    //addcheckin
    public void addCheckIn(CheckInEntity checkIn){
        entityManager.persist(checkIn);
    }
    public void deleteCheckIn(CheckInEntity checkIn){
        entityManager.remove(checkIn);

    }
    public List<CheckInEntity> getCheckInByid(CheckInEntity checkIn){
        return entityManager.createQuery("Select checkIn from CheckInEntity checkin where checkin.id=?1",CheckInEntity.class).getResultList();
    }
}
