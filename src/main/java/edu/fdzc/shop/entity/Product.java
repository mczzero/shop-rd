package edu.fdzc.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends AbstractEntity{
    /**
     *  商品名称
     */
    private String productName;
    /**
     *  分类id
     */
    private String categoryId;
    /**
     * 产品名称
     */
    private String categoryName;
    /**
     * 描述
     */
    private String description;
    /**
     * 详情
     */
    private String detail;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 库存量
     */
    private Long stockCount;
}
