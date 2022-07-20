package converter;


import dto.MembershipInfoDto;
import entitiess.MembershipInfoEntity;

public class MembershipInfoConverter {
    public static MembershipInfoDto toDto(MembershipInfoEntity membershipInfoEntity){
        MembershipInfoDto toReturn=new MembershipInfoDto();
        toReturn.setId(membershipInfoEntity.getId());
        toReturn.setDescription(membershipInfoEntity.getDescription());
        toReturn.setStartDate(membershipInfoEntity.getStartDate());
        toReturn.setEndDate(membershipInfoEntity.getEndDate());
        return toReturn;
    }
    public static MembershipInfoEntity toEntity(MembershipInfoDto membershipInfoDto){
        MembershipInfoEntity toReturn=new MembershipInfoEntity();
        toReturn.setId(membershipInfoDto.getId());
        toReturn.setDescription(membershipInfoDto.getDescription());
        toReturn.setStartDate(membershipInfoDto.getStartDate());
        toReturn.setEndDate(membershipInfoDto.getEndDate());
        return toReturn;
    }
}
