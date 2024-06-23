package dev.sy.orderproduct.dto;

import dev.sy.order.dto.OrderDTO;
import dev.sy.product.dto.ProductDTO;

import java.util.UUID;

public record OrderProductDTO(
        UUID id,
        OrderDTO order,
        ProductDTO product,
        Integer quantity
) {
}
