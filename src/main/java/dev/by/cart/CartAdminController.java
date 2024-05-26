package dev.by.cart;

import dev.by.cart.dto.CartDTO;
import dev.by.cart.request.CartCreationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/admin/carts")
public class CartAdminController {

    private final CartService cartService;

    public CartAdminController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("by-user-id/{userId}")
    public List<CartDTO> getCartsByUserId(@PathVariable UUID userId) {
        return cartService.getCartsByUserId(userId);
    }

    @PostMapping
    public ResponseEntity<CartDTO> addCart(
            @RequestBody CartCreationRequest request
    ) {
        // Out of scope
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/by-user-id/{userId}")
    public void deleteCartsByUserId(@PathVariable UUID userId) {
        cartService.deleteCartByUserId(userId);
    }
}
