package edu.fdzc.shop.controller;

import edu.fdzc.shop.dto.CategoryDto;
import edu.fdzc.shop.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    @GetMapping("/detail/{cid}")
    public CategoryDto detail(@PathVariable("cid") String categoryId) {
        return categoryService.getCategory(categoryId);
    }

    @DeleteMapping("/delete/{cid}")
    public CategoryDto delete(@RequestParam("cid") String categoryId) {
        return categoryService.getCategory(categoryId);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody CategoryDto categoryDto) {
        return categoryService.saveCategory(categoryDto);
    }

    @PutMapping("/update")
    public boolean update(@RequestBody CategoryDto categoryDto) {
        return categoryService.updateCategory(categoryDto);
    }
}
