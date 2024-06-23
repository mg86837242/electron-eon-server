package dev.sy.user.request;

public record UserCreationRequest(
        String email,
        String password,
        String firstName,
        String lastName
) {
}
