package dev.by.product.dto;

import dev.by.product.Category;

import java.util.UUID;

public record ProductDTO(
        UUID id,
        String name,
        String description,
        Double price,
        Category category
) {
}
