package edu.fdzc.shop.service;

import edu.fdzc.shop.dao.ProductMapper;
import edu.fdzc.shop.dto.CategoryDto;
import edu.fdzc.shop.dto.ProductDto;
import edu.fdzc.shop.entity.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private CategoryService categoryService;

    /**
     * 保存商品
     * @param productDto
     * @return
     */
    public boolean saveProduct(ProductDto productDto) {
        Product product = new Product();
        BeanUtils.copyProperties(product, product);
        product.setId(UUID.randomUUID().toString());
        return productMapper.insert(product) > 0;
    }

    /**
     * 搜素商品
     * @param productDto
     * @return
     */
    public List<ProductDto> search(ProductDto productDto) {
        Product product =new Product();
        BeanUtils.copyProperties(productDto, product);
        List<Product> productList=productMapper.filter(product);
        return productList.stream()
                .map(ProductService::convertDto)
                .collect(Collectors.toList());
    }

    /**
     * 根据商品id删除
     * @param productId
     * @return
     */
    public Product getProductById(String productId) {
        Product product = productMapper.findById(productId);
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        CategoryDto categoryDto = categoryService.getCategory(product.getCategoryId());
        productDto.setCategoryName(categoryDto.getCategoryName());
        return product;
    }

    /**
     * 更新商品
     * @param productDto
     * @return
     */
    public boolean update(ProductDto productDto) {
        Product product =new Product();
        BeanUtils.copyProperties(productDto, product);
        product.setUpdateTime(new Date());
        return productMapper.update(product) > 0;
    }

    /**
     * 删除商品
     * @param productId
     * @return
     */
    public boolean delete(String productId) { return productMapper.delete(productId) > 0;}
    public static ProductDto convertDto(Product product) {
        if (product == null) {
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(product, productDto);
            return productDto;
        }
        return null;
    }
}
