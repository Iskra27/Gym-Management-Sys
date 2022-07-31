package services.implementation;

import dto.CheckInDto;
import entitiess.CheckInEntity;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.CheckInRepository;
import services.CheckInService;

public class CheckInServiceImpl implements CheckInService {
    @Autowired
    CheckInRepository checkInRepository;
    @Override
    public CheckInEntity addCheckIn(CheckInDto checkInDto) {
        return null;
    }

    @Override
    public CheckInEntity countCheckIn(Long id) {

        return null;
    }

    @Override
    public Integer getSum(Long id) {
        return checkInRepository.getsum(id);
    }

    @Override
    public void deleteCheckIn(CheckInEntity checkIn) {
        CheckInEntity check=checkInRepository.getCheckInByid(checkIn);

    }
}
