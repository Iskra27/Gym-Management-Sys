package services.implementation;

import converter.TrainerConverter;
import dto.TrainerDto;
import entitiess.TrainerEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.TrainerRepository;
import services.TrainerService;

import java.util.List;

public class TrainerServiceImpl implements TrainerService {
    @Autowired
    TrainerRepository trainerRepository;
    private static final Logger logger= LoggerFactory.getLogger(TrainerServiceImpl.class);
    @Override
    public List<TrainerEntity> getallTrainers() {

        return trainerRepository.getallTrainers();
    }

    @Override
    public TrainerEntity addTrainer(TrainerDto trainer) {
        if(trainer!=null){
            TrainerEntity trainerEntity= TrainerConverter.toEntity(trainer);
            trainerRepository.addTrainer(trainerEntity);
            return trainerEntity;
        }else{
            logger.warn("An error has occurred");
        }
        return  null;
    }

    @Override
    public void deleteTrainer(Long id) {
        trainerRepository.deleteTrainer(id);

    }
}
