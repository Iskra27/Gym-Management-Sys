package converter;

import dto.EquipmentDto;
import entitiess.EquipmentEntity;

public class EquipmentConverter {
    public static EquipmentDto toDto(EquipmentEntity equipmentEntity){
        EquipmentDto ToReturn=new EquipmentDto();
        ToReturn.setId(equipmentEntity.getId());
        ToReturn.setToolName(equipmentEntity.getToolName());
        ToReturn.setPsc(equipmentEntity.getPsc());
        return ToReturn;
    }
    public static EquipmentEntity ToEquipment(EquipmentDto equipmentDto){
        EquipmentEntity toReturn=new EquipmentEntity();
        toReturn.setId(equipmentDto.getId());
        toReturn.setToolName(equipmentDto.getToolName());
        toReturn.setPsc(equipmentDto.getPsc());
        return toReturn;
    }

}
