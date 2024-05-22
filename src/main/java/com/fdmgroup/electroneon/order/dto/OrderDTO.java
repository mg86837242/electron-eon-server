package com.fdmgroup.electroneon.order.dto;

import com.fdmgroup.electroneon.user.dto.UserDTO;

import java.time.LocalDateTime;
import java.util.UUID;

public record OrderDTO(
        UUID id,
        UserDTO user,
        String street,
        String city,
        LocalDateTime createdAt
) {
}
