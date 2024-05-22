package com.fdmgroup.electroneon.cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CartRepository extends JpaRepository<Cart, UUID> {

    List<Cart> findByUserId(UUID userId);

    @Query("SELECT c FROM Cart c WHERE c.user.email = :email")
    List<Cart> findByEmail(String email);

    @Query("SELECT c FROM Cart c WHERE c.user.email = :email AND c.product.id" +
            " = :productId")
    Optional<Cart> findByEmailAndProductId(
            String email,
            UUID productId
    );

    boolean existsById(@NonNull UUID cartId);

    @Modifying(clearAutomatically = true)
    @Query("UPDATE Cart c SET c.quantity = c.quantity + 1 WHERE c.id = :cartId")
    void incrementQtyById(
            @Param(value = "cartId") UUID cartId
    );

    @Modifying(clearAutomatically = true)
    @Query("UPDATE Cart c SET c.quantity = CASE WHEN c.quantity > 0 THEN " +
            "c.quantity - 1 ELSE 0 END WHERE c.id = :cartId")
    void decrementQtyById(
            @Param(value = "cartId") UUID cartId
    );

    void deleteByUserId(UUID userId);

    @Modifying(clearAutomatically = true)
    @Query("DELETE FROM Cart c WHERE c.user.email = :email")
    void deleteByEmail(String email);

}
