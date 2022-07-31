package services;

import dto.MotivationDto;
import entitiess.MotivationEntity;

import java.util.List;

public interface QuoteService {
    List<MotivationEntity> getallMotivationQuote(MotivationDto motivationDto);
    MotivationEntity addmotivationquote(MotivationDto motivation);


}
