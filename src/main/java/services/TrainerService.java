package services;

import dto.TrainerDto;
import entitiess.TrainerEntity;

import java.util.List;

public interface TrainerService {
    List<TrainerEntity> getallTrainers();
    TrainerEntity addTrainer(TrainerDto trainerDto);
    void deleteTrainer(Long id);
}
