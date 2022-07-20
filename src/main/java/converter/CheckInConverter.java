package converter;

import dto.CheckInDto;
import entitiess.CheckInEntity;

public class CheckInConverter {
    public static CheckInDto toDto(CheckInEntity checkInEntity){
        CheckInDto toReturn=new CheckInDto();
        toReturn.setId(checkInEntity.getId());
        toReturn.setTimes(checkInEntity.getTimes());
        return toReturn;

    }
    public static CheckInEntity toEntity(CheckInDto checkInDto){
        CheckInEntity toReturn=new CheckInEntity();
        toReturn.setId(checkInDto.getId());
        toReturn.setTimes(checkInDto.getTimes());
        return toReturn;
    }
}
