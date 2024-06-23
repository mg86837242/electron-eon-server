package dev.sy.order.dto;

import dev.sy.product.dto.ProductDTO;

import java.util.UUID;

public record NestedOrderProductWithNoOrderDTO(
        UUID id,
        ProductDTO product,
        Integer quantity
) {
}
