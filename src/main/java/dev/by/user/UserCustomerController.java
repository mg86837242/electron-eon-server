package dev.by.user;

import dev.by.user.dto.UserDTO;
import dev.by.user.request.UserUpdateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer/users")
public class UserCustomerController {

    private final UserService userService;

    public UserCustomerController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/current-user")
    public ResponseEntity<UserDTO> getCurrUser(Authentication authn) {
        UserDTO user = userService.getUserByAuthn(authn);

        return ResponseEntity.ok(user);
    }

    @PatchMapping("/current-user")
    public ResponseEntity<User> updateCurrUser(
            Authentication authn,
            @RequestBody UserUpdateRequest request
    ) {
        userService.updateUserByAuthn(authn, request);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/current-user")
    public void deleteCurrUser(
            Authentication authn
    ) {
        userService.deleteUserByAuthn(authn);
    }
}