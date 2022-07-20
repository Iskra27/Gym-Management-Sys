package converter;

import dto.RoleDto;
import entitiess.RoleEntity;

public class RoleCoverter {
    public static RoleDto toDto(RoleEntity roleEntity){
        RoleDto toReturn=new RoleDto();
        toReturn.setId(roleEntity.getId());
        toReturn.setRole(roleEntity.getRole());
        return toReturn;
    }
    public static RoleEntity toEntity(RoleDto roleDto){
        RoleEntity toReturn=new RoleEntity();
        toReturn.setId(roleDto.getId());
        toReturn.setRole(roleDto.getRole());
        return toReturn;
    }
}
