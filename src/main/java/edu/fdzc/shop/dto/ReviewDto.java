package edu.fdzc.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDto {
    /**
     * 评论ID
     */
    private String id;
    /**
     * 商品ID
     */
    private String productId;
    /**
     * 评论内容
     */
    private String content;
}
