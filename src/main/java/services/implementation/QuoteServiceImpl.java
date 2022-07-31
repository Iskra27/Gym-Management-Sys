package services.implementation;

import converter.MotivationConverter;
import dto.MotivationDto;
import entitiess.MotivationEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.MotivationRepository;
import services.QuoteService;

import java.util.List;

public class QuoteServiceImpl implements QuoteService {
    public static final Logger logger= LoggerFactory.getLogger(QuoteServiceImpl.class);
    @Autowired
    MotivationRepository motivationRepository;



    public MotivationEntity addmotivationquote(MotivationDto motivation) {

        MotivationEntity motivationn= MotivationConverter.toEntity(motivation);
        motivationRepository.addMotivation(motivationn);
        return null;
    }
    @Override
    public List<MotivationEntity> getallMotivationQuote(MotivationDto motivationDto) {
        return motivationRepository.getallMotivation(motivationDto);
    }
}
