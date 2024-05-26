package dev.by.cart.dao;

import dev.by.cart.Cart;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CartDao {

    Optional<Cart> selectCartById(UUID cartId);

    List<Cart> selectCartsByUserId(UUID userId);

    boolean existsCartById(UUID cartId);

    void insertCart(Cart cart);

    void updateCart(Cart update);

    void incrementCartQty(UUID cartId);

    void decrementCartQty(UUID cartId);

    void deleteCartById(UUID cartId);
}