package com.fdmgroup.electroneon.user.request;

public record UserRegistrationRequest(
        String email,
        String password,
        String firstName,
        String lastName
) {
}
