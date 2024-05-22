package com.fdmgroup.electroneon.cart.dto;

import com.fdmgroup.electroneon.product.dto.ProductDTO;
import com.fdmgroup.electroneon.user.dto.UserDTO;

import java.util.UUID;

public record CartDTO(
        UUID id,
        UserDTO user,
        ProductDTO product,
        Integer quantity
) {
}
