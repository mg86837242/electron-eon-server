package dev.sy.order.dto;

import dev.sy.user.dto.UserDTO;

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
