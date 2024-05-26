package dev.by.cart.request;

import java.util.UUID;

public record CartCreationCustomerRequest(
        UUID productId,
        Integer quantity
) {
}
