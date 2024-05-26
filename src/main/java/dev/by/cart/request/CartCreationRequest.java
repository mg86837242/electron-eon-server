package dev.by.cart.request;

import java.util.UUID;

public record CartCreationRequest(
        UUID userId,
        UUID productId,
        Integer quantity
) {
}
