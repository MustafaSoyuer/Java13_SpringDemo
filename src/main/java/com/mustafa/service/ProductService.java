package com.mustafa.service;

import com.mustafa.entity.Product;
import com.mustafa.repository.ProductRepository;
import com.mustafa.utility.IService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService implements IService<Product, Long> {

//    @Autowired
    private final ProductRepository productRepository;

    public Optional<Product> findByProductName(String productName){
        return productRepository.findByProductName(productName);
    }

    public List<Product> findAllByProductNameContainingIgnoreCase(String productName){
        return productRepository.findAllByProductNameContainingIgnoreCase(productName);
    }

    public List<Product> findAllByProductPriceBetween(Double start, Double end){
        return productRepository.findAllByProductPriceBetween(start,end);
    }

    public List<Product> findAllByProductPriceGreaterThan(Double price){
        return productRepository.findAllByProductPriceGreaterThan(price);
    }

    public List<Product> findAllByProductUnitInStockGreaterThan(Integer stock){
        return productRepository.findAllByProductUnitInStockGreaterThan(stock);
    }

    public List<Product> findAllByProductPriceGreaterThanEqual(Double price){
        return productRepository.findAllByProductPriceGreaterThanEqual(price);
    }

    public Integer countByProductCategory(String category){
        return productRepository.countByProductCategory(category);
    }

    public Long countByProductNameIgnoreCase(String name){
        return productRepository.countByProductNameIgnoreCase(name);
    }

    public Boolean existsByProductNameIgnoreCase(String name){
        return productRepository.existsByProductNameIgnoreCase(name);
    }

    public List<Product> findByProductCategoryIsNull(){
        return productRepository.findByProductCategoryIsNull();
    }

    public List<Product> findByProductCategoryStartingWithIgnoreCase(String name){
        return productRepository.findByProductCategoryStartingWithIgnoreCase(name);
    }



    @Override
    public Product save(Product product) {
        return productRepository.save(Product.builder()
                        .productName(product.getProductName())
                        .productCategory(product.getProductCategory())
                        .productPrice(product.getProductPrice())
                        .productUnitInStock(product.getProductUnitInStock())
                        .productDescription(product.getProductDescription())
                .build());
    }

    @Override
    public Product update(Product product) {
        Optional<Product> product1 = productRepository.findById(product.getId());

        if(product1.isEmpty()){
            //exception fırlatıyorum.
        }
        return productRepository.save(product);
    }

    @Override
    public Iterable<Product> saveAll(Iterable<Product> entities) {
        return null;
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }


    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public boolean existById(Long aLong) {
        return false;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findByColumnAndValue(String columnName, Object value) {
        return null;
    }


    @Override
    public List<Product> findAllEntity(Product entity) {
        return null;
    }


}
