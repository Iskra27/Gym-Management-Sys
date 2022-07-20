package repositories;

import entitiess.EquipmentEntity;
import entitiess.membershipEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Transactional
@Repository
public class MembershippRepository {
    @Autowired
    EntityManager entityManager;
    public void createMembership(membershipEntity membershipp){
        entityManager.persist(membershipp);
    }
    public void deleteMembership(membershipEntity membershipp){
        entityManager.remove(membershipp);
    }
    public List<membershipEntity> getallMemberships(){
        return entityManager.createQuery("Select membership.id,membership.membership,membership.count,membership.fee from membershipEntity membership ",membershipEntity.class).getResultList();
    }
}
