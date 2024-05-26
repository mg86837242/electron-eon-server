package dev.by.order.dto;

import dev.by.product.dto.ProductDTO;

import java.util.UUID;

public record NestedOrderProductWithNoOrderDTO(
        UUID id,
        ProductDTO product,
        Integer quantity
) {
}
