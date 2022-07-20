package converter;

import dto.MotivationDto;
import entitiess.MotivationEntity;

public class MotivationConverter {
    public static MotivationDto toDto(MotivationEntity motivationEntity){
        MotivationDto toReturn=new MotivationDto();
        toReturn.setId(motivationEntity.getId());
        toReturn.setMotivationQuote(motivationEntity.getMotivationQuote());
        toReturn.setCreatedBy(motivationEntity.getCreatedBy());
        return toReturn;
    }
public static MotivationEntity toEntity(MotivationDto motivationDto){
        MotivationEntity toReturn=new MotivationEntity();
    toReturn.setId(motivationDto.getId());
    toReturn.setMotivationQuote(motivationDto.getMotivationQuote());
    toReturn.setCreatedBy(motivationDto.getCreatedBy());
    return toReturn;
}
}
