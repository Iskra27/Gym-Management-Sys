package converter;

import dto.TrainerDto;
import entitiess.TrainerEntity;

public class TrainerConverter {
    public static TrainerDto toDto(TrainerEntity trainerEntity){
        TrainerDto toReturn=new TrainerDto();
        toReturn.setId(trainerEntity.getId());
        toReturn.setFirstName(trainerEntity.getFirstName());
        toReturn.setLastName(trainerEntity.getLastName());
        return toReturn;
    }
    public static TrainerEntity toEntity(TrainerDto trainerDto){
        TrainerEntity toReturn=new TrainerEntity();
        toReturn.setId(trainerDto.getId());
        toReturn.setFirstName(trainerDto.getFirstName());
        toReturn.setLastName(trainerDto.getLastName());
        return toReturn;
    }
}
