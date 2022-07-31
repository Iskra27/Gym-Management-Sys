package services.implementation;

import converter.ReviewConverter;
import dto.ReviewDto;
import entitiess.ReviewEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.ReviewRepository;
import services.ReviewService;

import java.util.List;

public class ReviewServiceImpl implements ReviewService {
    private static final Logger logger = LoggerFactory.getLogger(ReviewServiceImpl.class);
    @Autowired
    ReviewRepository reviewRepository;
    @Override
    public List<ReviewEntity> getAllReviews() {
        return reviewRepository.getAllR();
    }

    @Override
    public void addReview(ReviewDto reviewDto) {
        if(reviewDto!=null){
            ReviewEntity review= ReviewConverter.toEntity(reviewDto);
            reviewRepository.addReveiw(review);
            return review;
        }

    }

    @Override
    public void softDelete(Long id) {
        ReviewEntity review=reviewRepository.reviewsbyId(id);
        reviewRepository.softDeleteReview(review);
    }


}
