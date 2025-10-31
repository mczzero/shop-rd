package edu.fdzc.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Review extends AbstractEntity{

    /**
     * 商品ID
     */
    private String productId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 评论内容
     */
    private String content;
}
