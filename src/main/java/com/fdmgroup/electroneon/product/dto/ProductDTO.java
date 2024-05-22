package com.fdmgroup.electroneon.product.dto;

import com.fdmgroup.electroneon.product.Category;

import java.util.UUID;

public record ProductDTO(
        UUID id,
        String name,
        String description,
        Double price,
        Category category
) {
}
