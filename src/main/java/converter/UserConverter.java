package converter;

import dto.UserDto;
import entitiess.UserEntity;

public class UserConverter {
    public static UserDto toDto(UserEntity entity) {
        UserDto toReturn = new UserDto();
        toReturn.setId(entity.getId());
        toReturn.setFirstName(entity.getFirstName());
        toReturn.setLastName(entity.getLastName());
        toReturn.setGender(entity.getGender());
        toReturn.setRole(entity.getRole());
        toReturn.setAge(entity.getAge());
        toReturn.setMembershipId(entity.getMembershipId());
        toReturn.setTrainer((int) entity.getTrainer());
        return toReturn;
    }
    public static UserEntity toEntity(UserDto dto){
        UserEntity toReturn=new UserEntity();
        toReturn.setId(dto.getId());
        toReturn.setFirstName(dto.getFirstName());
        toReturn.setLastName(dto.getLastName());
        toReturn.setRole(dto.getRole());
        toReturn.setAge(dto.getAge());
        toReturn.setMembershipId(dto.getMembershipId());
        toReturn.setTrainer(dto.getTrainer());
        return  toReturn;
    }

}
