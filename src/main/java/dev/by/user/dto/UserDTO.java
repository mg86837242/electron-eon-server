package dev.by.user.dto;

import dev.by.user.Role;

import java.util.UUID;

public record UserDTO(
        UUID id,
        String email,
        String firstName,
        String lastName,
        Role role
) {
}
