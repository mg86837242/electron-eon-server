package dev.by.orderproduct.dto;

import dev.by.order.dto.OrderDTO;
import dev.by.product.dto.ProductDTO;

import java.util.UUID;

public record OrderProductDTO(
        UUID id,
        OrderDTO order,
        ProductDTO product,
        Integer quantity
) {
}
