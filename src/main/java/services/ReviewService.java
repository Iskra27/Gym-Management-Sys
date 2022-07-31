package services;

import dto.ReviewDto;
import entitiess.ReviewEntity;

import java.util.List;

public interface ReviewService {
    List<ReviewEntity> getAllReviews();
    void addReview(ReviewDto reviewDto);
    void softDelete(Long id);

}
