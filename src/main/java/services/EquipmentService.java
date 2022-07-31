package services;

import dto.EquipmentDto;
import entitiess.EquipmentEntity;

import java.util.List;

public interface EquipmentService {
    List<EquipmentEntity> getallEquipments();
    EquipmentEntity addEquipment(EquipmentDto equipmentDto);
    void deleteEquipment(long id);
}
