package dev.sy.user.request;

import dev.sy.user.Role;

public record UserUpdateRequest(
        String email,
        String password,
        String firstName,
        String lastName,
        Role role
) {
}
