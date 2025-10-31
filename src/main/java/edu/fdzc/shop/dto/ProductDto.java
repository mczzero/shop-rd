package edu.fdzc.shop.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    /**
     * 商品名id
     */
    private String id;
    /**
     * 分类id
     */
    private String categoryId;
    /**
     * 分类名称
     */
    private String categoryName;
    /**
     * 产品名称
     */
    private String productName;
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
     * 库存
     */
    private Long stockCount;
}
