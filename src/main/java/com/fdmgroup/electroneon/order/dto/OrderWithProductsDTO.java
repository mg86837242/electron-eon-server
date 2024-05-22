package com.fdmgroup.electroneon.order.dto;

import com.fdmgroup.electroneon.user.dto.UserDTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record OrderWithProductsDTO(
        UUID id,
        UserDTO user,
        String street,
        String city,
        LocalDateTime createdAt,
        List<NestedOrderProductWithNoOrderDTO> orderProducts
) {
    // NB Don't use "Records style" to generate getters if this is a regular
    // class, or else Spring will run into a bug: "Could not find acceptable
    // representation": https://stackoverflow.com/questions/46990169/could-not-find-acceptable-representation
}