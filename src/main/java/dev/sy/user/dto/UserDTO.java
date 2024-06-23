package dev.sy.user.dto;

import dev.sy.user.Role;

import java.util.UUID;

public record UserDTO(
        UUID id,
        String email,
        String firstName,
        String lastName,
        Role role
) {
}
