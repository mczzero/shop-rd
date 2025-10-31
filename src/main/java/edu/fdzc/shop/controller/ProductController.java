package edu.fdzc.shop.controller;

import edu.fdzc.shop.dto.ProductDto;
import edu.fdzc.shop.entity.Product;
import edu.fdzc.shop.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @Resource
    private ProductService productService;

    @GetMapping("/detail/{productId}")
    public Product detail(@PathVariable("productId") String productId){
        return productService.getProductById(productId);
    }

    @DeleteMapping("/delete/{productId}")
    public boolean delete(@PathVariable("productId") String productId){
        return productService.delete(productId);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody ProductDto productDto){
        return productService.saveProduct(productDto);
    }

    @PutMapping("/update")
    public boolean update(@RequestBody ProductDto productDto){
        return productService.update(productDto);
    }

}
