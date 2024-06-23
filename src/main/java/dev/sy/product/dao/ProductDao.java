package dev.sy.product.dao;

import dev.sy.product.Category;
import dev.sy.product.Product;

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
