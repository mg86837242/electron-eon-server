package com.fdmgroup.electroneon.user.dto;

import com.fdmgroup.electroneon.user.Role;

import java.util.UUID;

public record UserDTO(
        UUID id,
        String email,
        String firstName,
        String lastName,
        Role role
) {
}
