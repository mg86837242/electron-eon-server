package com.fdmgroup.electroneon.product.dao;

import com.fdmgroup.electroneon.product.Category;
import com.fdmgroup.electroneon.product.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductDao {

    List<Product> selectAllProducts();

    Optional<Product> selectProductById(UUID productId);

    List<Product> selectProductsByCategory(Category category);

    boolean existsProductById(UUID productId);

    void insertProduct(Product product);

    void updateProduct(Product update);

    void deleteProductById(UUID productId);
}
