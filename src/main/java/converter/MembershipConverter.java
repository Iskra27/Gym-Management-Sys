package converter;

import dto.MembershipDto;
import entitiess.membershipEntity;

public class MembershipConverter {
    public static MembershipDto toDto(membershipEntity membership){
        MembershipDto toReturn=new MembershipDto();
        toReturn.setId(membership.getId());
        toReturn.setMembership(membership.getMembership());
        toReturn.setCount(membership.getCount());
        toReturn.setFee(membership.getFee());
        return toReturn;

    }
    public static membershipEntity toEntity(MembershipDto membershipDto){
        membershipEntity toReturn=new membershipEntity();
        toReturn.setId(membershipDto.getId());
        toReturn.setMembership(membershipDto.getMembership());
        toReturn.setCount(membershipDto.getCount());
        toReturn.setFee(membershipDto.getFee());
        return toReturn;
    }
}
