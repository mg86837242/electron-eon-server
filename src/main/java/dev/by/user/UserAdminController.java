package dev.by.user;

import dev.by.user.dto.UserDTO;
import dev.by.user.request.UserCreationRequest;
import dev.by.user.request.UserUpdateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/admin/users")
public class UserAdminController {

    private final UserService userService;

    public UserAdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable UUID id) {
        UserDTO user = userService.getUserById(id);

        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<UserDTO> addUser(
            @RequestBody UserCreationRequest request
    ) {
        // Out of scope
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<User> updateUserById(
            @PathVariable UUID id,
            @RequestBody UserUpdateRequest request
    ) {
        userService.updateUserById(id, request);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable UUID id) {
        userService.deleteUserById(id);
    }
}
