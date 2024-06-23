package dev.sy.cart.dto;

import dev.sy.product.dto.ProductDTO;
import dev.sy.user.dto.UserDTO;

import java.util.UUID;

public record CartDTO(
        UUID id,
        UserDTO user,
        ProductDTO product,
        Integer quantity
) {
}
