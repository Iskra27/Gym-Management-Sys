package repositories;

import entitiess.MembershipInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;


@Transactional
@Repository
public class MembershipRepository {
    @Autowired
    EntityManager entityManager;
    public void addMemebrship(MembershipInfoEntity memebership){
        entityManager.persist(memebership);

    }
    public List<MembershipInfoEntity>getallMemberships(MembershipInfoEntity memebership){
        return entityManager.createQuery("Select membership.id,membership.description,membership.StartDate,membership.EndDate from MembershipInfoEntity membership",MembershipInfoEntity.class).getResultList();
    }
    public void deletemembership(MembershipInfoEntity memebership){
        entityManager.remove(memebership);
    }
    public List<MembershipInfoEntity> getdatesbyId(MembershipInfoEntity memebership){
        return entityManager.createQuery("Select membership.StartDate,membership.EndDate from MembershipInfoEntity membership where membership.id=?1",MembershipInfoEntity.class).getResultList();
    }
}
