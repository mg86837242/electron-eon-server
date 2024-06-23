package dev.sy.product.dto;

import dev.sy.product.Category;

import java.util.UUID;

public record ProductDTO(
        UUID id,
        String name,
        String description,
        Double price,
        Category category
) {
}
