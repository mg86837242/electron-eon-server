package dev.by.user.request;

import dev.by.user.Role;

public record UserUpdateRequest(
        String email,
        String password,
        String firstName,
        String lastName,
        Role role
) {
}
