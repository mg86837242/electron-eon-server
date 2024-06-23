package dev.sy.product.request;

import dev.sy.product.Category;

public record ProductCreationRequest(
        String name,
        String description,
        Double price,
        Category category
) {
}
