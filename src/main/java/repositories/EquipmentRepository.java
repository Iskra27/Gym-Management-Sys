package repositories;

import entitiess.EquipmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Transactional
@Repository
public class EquipmentRepository {
    @Autowired
    private EntityManager entityManager;
    private void addEquipment( EquipmentEntity equipment){entityManager.persist(equipment);
    }
private List<EquipmentEntity> getallEquipments(){
        return entityManager.createQuery("Select equipment from EquipmentEntity equipment", EquipmentEntity.class).getResultList();}
//Nuk duhet te punoje

public void deleteEquipment(EquipmentEntity equipment){
        entityManager.remove(equipment);}
}


