package edu.fdzc.shop.controller;

import edu.fdzc.shop.dto.ReviewDto;
import edu.fdzc.shop.service.ReviewService;
import org.springframework.web.bind.annotation.*;
import edu.fdzc.shop.utils.JwtUtils;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/api/review")
public class ReviewController {
    @Resource
    private ReviewService reviewService;

    /**
     * 添加评论
     * @param reviewDto
     * @param token
     * @return
     */
    @PostMapping("/add")
    public boolean add(@RequestBody ReviewDto reviewDto,@RequestParam String token){
        //logger.debug("")
        return reviewService.saveReview(reviewDto, JwtUtils.getUserId(token));
    }

    /**
     * 查看评论列表
     * @param productId
     * @return
     */
    @GetMapping("/list/{product}")
    public List<ReviewDto> list(@PathVariable("productId") String productId){
        return reviewService.list(productId);
    }

    /**
     * 删除评论
     * @param reviewId
     * @return
     */
    @DeleteMapping("")
    public Boolean delete(@RequestParam("reviewId") String reviewId){
        return reviewService.delete(reviewId);
    }

}
