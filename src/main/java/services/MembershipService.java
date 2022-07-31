package services;

import dto.MembershipDto;
import dto.MembershipInfoDto;
import entitiess.MembershipInfoEntity;
import entitiess.membershipEntity;

import java.util.List;

public interface MembershipService {
    List<membershipEntity>getallMemerships();
    membershipEntity addMembership(MembershipDto membershipDto);
    void deleteMembership(long id);

}
