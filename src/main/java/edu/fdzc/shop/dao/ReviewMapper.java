package edu.fdzc.shop.dao;

import edu.fdzc.shop.entity.Review;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewMapper {

    /**
     * 新增评论
     * @param review
     * @return
     */
    int insert(Review review);

    /**
     * 通过商品ID查询评论，用于查看评论列表
     * @param productId
     * @return
     */

    List<Review> findByProductId(String productId);

    /**
     * 通过评论ID删除评论信息
     * @param reviewId
     * @return
     */
    int deleteById(String reviewId);
}
