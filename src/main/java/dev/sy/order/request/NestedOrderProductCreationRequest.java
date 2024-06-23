package dev.sy.order.request;

import java.util.UUID;

public record NestedOrderProductCreationRequest(
        UUID productId,
        Integer quantity
) {
}
