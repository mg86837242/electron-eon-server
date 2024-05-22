package com.fdmgroup.electroneon.user.request;

import com.fdmgroup.electroneon.user.Role;

public record UserUpdateRequest(
        String email,
        String password,
        String firstName,
        String lastName,
        Role role
) {
}
