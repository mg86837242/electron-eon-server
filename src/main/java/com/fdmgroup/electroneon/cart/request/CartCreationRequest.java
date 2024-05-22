package com.fdmgroup.electroneon.cart.request;

import java.util.UUID;

public record CartCreationRequest(
        UUID userId,
        UUID productId,
        Integer quantity
) {
}
