package dev.by.cart.dto;

import dev.by.product.dto.ProductDTO;
import dev.by.user.dto.UserDTO;

import java.util.UUID;

public record CartDTO(
        UUID id,
        UserDTO user,
        ProductDTO product,
        Integer quantity
) {
}
