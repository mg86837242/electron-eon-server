package dev.sy.cart.request;

import java.util.UUID;

public record CartCreationCustomerRequest(
        UUID productId,
        Integer quantity
) {
}
