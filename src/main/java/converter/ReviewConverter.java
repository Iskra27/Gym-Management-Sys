package converter;

import dto.ReviewDto;
import entitiess.ReviewEntity;

public class ReviewConverter {
    public static ReviewDto toDto(ReviewEntity reviewEntity){
        ReviewDto toReturn=new ReviewDto();
        toReturn.setId(reviewEntity.getId());
        toReturn.setReviewInfo(reviewEntity.getReviewInfo());
        toReturn.setCreatedBy(reviewEntity.getCreatedBy());
        toReturn.setCreatedBy(reviewEntity.getCreatedBy());
        return toReturn;
    }
    public static ReviewEntity toEntity(ReviewDto reviewDto){
        ReviewEntity toReturn=new ReviewEntity();
        toReturn.setId(reviewDto.getId());
        toReturn.setReviewInfo(reviewDto.getReviewInfo());
        toReturn.setCreatedBy(reviewDto.getCreatedBy());
        toReturn.setValid(reviewDto.isValid());
        return toReturn;
    }
}
