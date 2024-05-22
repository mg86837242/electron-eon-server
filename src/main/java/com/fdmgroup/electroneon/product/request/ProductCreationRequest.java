package com.fdmgroup.electroneon.product.request;

import com.fdmgroup.electroneon.product.Category;

public record ProductCreationRequest(
        String name,
        String description,
        Double price,
        Category category
) {
}
