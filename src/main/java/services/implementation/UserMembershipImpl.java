package services.implementation;

import converter.MembershipInfoConverter;
import dto.MembershipInfoDto;
import entitiess.MembershipInfoEntity;
import exceptions.UserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.MembershipInfoRepository;
import services.UserMembershipService;

import java.util.List;

public class UserMembershipImpl implements UserMembershipService {
    @Autowired
    MembershipInfoRepository membershipInfoRepository;
    private static final Logger logger = LoggerFactory.getLogger(UserMembershipImpl.class);
    @Override
    public MembershipInfoEntity addUserMemb(MembershipInfoDto membership) {
        logger.info("Adding new membership");
        if (membership!=null){
            MembershipInfoEntity membtoadd= MembershipInfoConverter.toEntity(membership);
            membershipInfoRepository.addMemebrship(membtoadd);
            logger.info("Membership added");
            return membtoadd;
        }else{
            logger.info("Registration not allowed");
            throw new UserException("Your membership ends on "+membership.getEndDate());
        }
    }

    @Override
    public List<MembershipInfoEntity> findDatesByid(Long id) {
        return membershipInfoRepository.getdatesbyId(id);
    }

    @Override
    public void deleteUserMemb(Long id) {
        if(id!=null) {
            membershipInfoRepository.deletemembership(id);
        }else{
            logger.warn("This deletion can not happen!");
            throw new UserException("Membership of user with id "+id+" does not exist!");
        }


    }
}
