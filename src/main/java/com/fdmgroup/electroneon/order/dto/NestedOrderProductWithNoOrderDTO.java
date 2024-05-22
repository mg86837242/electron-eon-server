package com.fdmgroup.electroneon.order.dto;

import com.fdmgroup.electroneon.product.dto.ProductDTO;

import java.util.UUID;

public record NestedOrderProductWithNoOrderDTO(
        UUID id,
        ProductDTO product,
        Integer quantity
) {
}
