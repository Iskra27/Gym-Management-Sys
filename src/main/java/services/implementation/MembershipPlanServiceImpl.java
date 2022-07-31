package services.implementation;

import converter.MembershipConverter;
import dto.MembershipDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import entitiess.membershipEntity;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.MembershippRepository;
import services.MembershipService;

import java.util.List;

public class MembershipPlanServiceImpl implements MembershipService {

    @Autowired
    MembershippRepository membershippRepository;

    private static final Logger logger= LoggerFactory.getLogger(MembershipPlanServiceImpl.class);
    @Override
    public List<membershipEntity> getallMemerships() {
        return membershippRepository.getallMemberships();
    }

    @Override
    public membershipEntity addMembership(MembershipDto membershipDto) {
        if (membershipDto!=null){
            membershipEntity addmembership= MembershipConverter.toEntity(membershipDto);
            membershippRepository.createMembership(addmembership);
            return addmembership;
        }else{
            logger.warn("Something went wrong,could not register!");
        }

        return null;
    }


    @Override
    public void deleteMembership(long id) {

            membershippRepository.deleteMembership(id);
    }
}
