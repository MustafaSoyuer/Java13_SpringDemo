package com.mustafa.repository;

import com.mustafa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {
    //Ürün ismine göre ürünü bulunuz.
    Optional<Product> findByProductName(String productName);
    Optional<Product> findByProductNameIgnoreCase(String productName);

    //Ürün isminin içerdiği harf veya kelimeye göre ürünü bulunuz.
    List<Product> findAllByProductNameContainingIgnoreCase(String productName);

    //Belirli fiyat aralığındaki ürünleri listeleyiniz.
    List<Product> findAllByProductPriceBetween(Double start, Double end);

    /**
     *                              ÖDEV
     */

    // 1. Girilen fiyatın üstündeki ürünleri listeleyiniz.
    List<Product> findAllByProductPriceGreaterThan(Double price);

    // 2. Belirli bir stok adedinin üzerindeki ürünleri listeleyiniz.
    List<Product> findAllByProductUnitInStockGreaterThan(Integer stock);

    // 3. Belirli bir fiyata eşit ve bu fiyatın üstündeki ürünleri listeleyiniz.
    List<Product> findAllByProductPriceGreaterThanEqual(Double price);

    // 4. Bir kategoriye ait kaç adet ürün olduğunu listeleyiniz.
    Integer countByProductCategory(String category);

    //5.  Bir üründen kaç tane olduğunu listeleyiniz.
    Long countByProductNameIgnoreCase(String name);
    //long countById(Long id);   String yerine id vererek

    //6.  Girilen kategorinin varlığını kontrol ediniz. (true,false)
    Boolean existsByProductNameIgnoreCase(String name);

    //7. Kategorisi 'null' olan ürünleri listeleyiniz.
    List<Product> findByProductCategoryIsNull();

    //8.  Baş harfi girilen kategoriye ait ürünleri listeleyiniz.
    List<Product> findByProductCategoryStartingWithIgnoreCase(String name);









}
