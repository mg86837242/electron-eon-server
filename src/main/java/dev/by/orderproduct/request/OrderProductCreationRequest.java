package dev.by.orderproduct.request;

import java.util.UUID;

public record OrderProductCreationRequest(
        UUID orderId,
        UUID productId,
        Integer quantity
) {
}
