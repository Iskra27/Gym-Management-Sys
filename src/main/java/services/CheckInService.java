package services;

import dto.CheckInDto;
import entitiess.CheckInEntity;

public interface CheckInService {
    CheckInEntity addCheckIn(CheckInDto checkInDto);
    CheckInEntity countCheckIn(Long id);
    Integer getSum(Long id);
    void deleteCheckIn(CheckInEntity checkIn)
}
