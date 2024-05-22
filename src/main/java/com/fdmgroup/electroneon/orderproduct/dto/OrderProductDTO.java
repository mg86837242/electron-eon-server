package com.fdmgroup.electroneon.orderproduct.dto;

import com.fdmgroup.electroneon.order.dto.OrderDTO;
import com.fdmgroup.electroneon.product.dto.ProductDTO;

import java.util.UUID;

public record OrderProductDTO(
        UUID id,
        OrderDTO order,
        ProductDTO product,
        Integer quantity
) {
}
