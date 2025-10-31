package edu.fdzc.shop.service;


import edu.fdzc.shop.dao.ReviewMapper;
import edu.fdzc.shop.dto.ReviewDto;
import edu.fdzc.shop.entity.Review;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ReviewService {

    @Autowired
    private ReviewMapper reviewMapper;

    /**
     * 添加评论
     * @param reviewDto
     * @param userId
     * @return
     */

    public boolean saveReview(ReviewDto reviewDto, String userId) {
        Review review =new Review();
        BeanUtils.copyProperties(review,review);
        review.setUserId(UUID.randomUUID().toString());
        review.setUserId(userId);
        return   reviewMapper.insert(review)>0;
    }

    /**
     * 查看评论列表
     * @param productId
     * @return
     */

    public List<ReviewDto> list(String productId) {
        List<Review> reviewList =  reviewMapper.findByProductId(productId);
        return reviewList.stream()
                .map(ReviewService::convertDto)
                .collect(Collectors.toList());
    }

    /**
     * 删除评论
     * @param reviewId
     * @return
     */

    public Boolean delete(String reviewId) { return reviewMapper.deleteById(reviewId)>0;}

    public static  ReviewDto convertDto(Review review){
        if(review != null){
            ReviewDto reviewDto = new ReviewDto();
            BeanUtils.copyProperties(review,reviewDto);
            return reviewDto;
        }
        return null;
    }

}
