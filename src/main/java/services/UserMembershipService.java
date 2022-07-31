package services;

import dto.MembershipInfoDto;
import entitiess.MembershipInfoEntity;

import java.util.List;

public interface UserMembershipService {
    MembershipInfoEntity addUserMemb(MembershipInfoDto membership);


    List<MembershipInfoEntity> findDatesByid(Long id);
    void deleteUserMemb(Long id);
}
