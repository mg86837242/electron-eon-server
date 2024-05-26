package dev.by.user.request;

public record UserRegistrationRequest(
        String email,
        String password,
        String firstName,
        String lastName
) {
}
