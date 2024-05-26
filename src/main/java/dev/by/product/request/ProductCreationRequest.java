package dev.by.product.request;

import dev.by.product.Category;

public record ProductCreationRequest(
        String name,
        String description,
        Double price,
        Category category
) {
}
