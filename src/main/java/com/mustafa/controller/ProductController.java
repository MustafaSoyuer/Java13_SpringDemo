package com.mustafa.controller;

import com.mustafa.entity.Product;
import com.mustafa.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/save")
    public Product save(Product product){
        return productService.save(product);
    }

    @GetMapping("/find-all")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/find-by-id")
    public Optional<Product> findById(Long id){
        return productService.findById(id);
    }

    @GetMapping("/update")
    public Product update(Product product){
        return productService.update(product);
    }

    @GetMapping("/find-by-product-name")
    private Optional<Product> findByProductName(String productName){
        return productService.findByProductName(productName);
    }

    @GetMapping("/find-all-by-product-name-containing-ignore-case")
    public List<Product> findAllByProductNameContainingIgnoreCase(String productName){
        return productService.findAllByProductNameContainingIgnoreCase(productName);
    }

    @GetMapping("/find-all-by-product-price-between")
    public List<Product> findAllByProductPriceBetween(Double start, Double end){
        return productService.findAllByProductPriceBetween(start,end);
    }

    @GetMapping("/find-all-by-product-price-greater-than")
    public List<Product> findAllByProductPriceGreaterThan(Double price){
        return productService.findAllByProductPriceGreaterThan(price);
    }

    @GetMapping("/find-all-by-product-unit-in-stock-greater-than")
    public List<Product> findAllByProductUnitInStockGreaterThan(Integer stock){
        return productService.findAllByProductUnitInStockGreaterThan(stock);
    }

    @GetMapping("/find-all-by-product-price-equals-and-greater-than")
    public List<Product> findAllByProductPriceGreaterThanEqual(Double price){
        return productService.findAllByProductPriceGreaterThanEqual(price);
    }

    @GetMapping("/count-by-product-category")
    public Integer countByProductCategory(String category){
        return productService.countByProductCategory(category);
    }

    @GetMapping("/count-by-product-name")
    public Long countByProductNameIgnoreCase(String name){
        return productService.countByProductNameIgnoreCase(name);
    }

    @GetMapping("/exists-by-product-name")
    public Boolean existsByProductNameIgnoreCase(String name){
        return productService.existsByProductNameIgnoreCase(name);
    }

    @GetMapping("/find-by-product-category-is-null")
    public List<Product> findByProductCategoryIsNull(){
        return productService.findByProductCategoryIsNull();
    }

    @GetMapping("/find-by-product-category-starting-with")
    public List<Product> findByProductCategoryStartingWithIgnoreCase(String name){
        return productService.findByProductCategoryStartingWithIgnoreCase(name);
    }


}
