package dev.sy.user.request;

public record UserRegistrationRequest(
        String email,
        String password,
        String firstName,
        String lastName
) {
}
