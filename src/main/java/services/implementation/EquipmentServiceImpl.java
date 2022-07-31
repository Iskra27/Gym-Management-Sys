package services.implementation;

import converter.EquipmentConverter;
import dto.EquipmentDto;
import entitiess.EquipmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.EquipmentRepository;
import services.EquipmentService;

import java.util.List;

public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    EquipmentRepository equipmentRepository;
    @Override
    public List<EquipmentEntity> getallEquipments() {
        return equipmentRepository.getallEquipments();
    }

    @Override
    public EquipmentEntity addEquipment(EquipmentDto equipmentDto) {
       if (equipmentDto !=null){
          EquipmentEntity equipment= EquipmentConverter.ToEntity(equipmentDto);
          equipmentRepository.addEquipment(equipment);
          return equipment;
       }

    }

    @Override
    public void deleteEquipment(long id) {
        equipmentRepository.deleteEquipment(id);
    }
}
