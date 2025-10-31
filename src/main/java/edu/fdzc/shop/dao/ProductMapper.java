package edu.fdzc.shop.dao;

import edu.fdzc.shop.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    int  insert(Product product);
    List<Product> filter(Product product);
    Product findById(String id);
    int update(Product product);
    int  delete(String productId);
}
