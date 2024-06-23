package dev.sy.orderproduct.request;

import java.util.UUID;

public record OrderProductCreationRequest(
        UUID orderId,
        UUID productId,
        Integer quantity
) {
}
