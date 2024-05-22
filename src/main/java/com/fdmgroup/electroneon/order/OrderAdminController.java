package com.fdmgroup.electroneon.order;

import com.fdmgroup.electroneon.order.dto.OrderDTO;
import com.fdmgroup.electroneon.order.dto.OrderWithProductsDTO;
import com.fdmgroup.electroneon.order.request.OrderCreationRequest;
import com.fdmgroup.electroneon.order.request.OrderUpdateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/admin/orders")
public class OrderAdminController {

    private final OrderService orderService;

    public OrderAdminController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<OrderDTO> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderWithProductsDTO> getOrderById(@PathVariable UUID id) {
        OrderWithProductsDTO order = orderService.getOrderById(id);

        return ResponseEntity.ok(order);
    }

    @GetMapping("/by-user-id/{userId}")
    public List<OrderDTO> getOrdersByUserId(@PathVariable UUID userId) {
        return orderService.getOrdersByUserId(userId);
    }

    @PostMapping
    public ResponseEntity<OrderWithProductsDTO> addOrder(
            @RequestBody OrderCreationRequest request
    ) {
        // Out of scope
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Order> updateOrderById(
            @PathVariable UUID id,
            @RequestBody OrderUpdateRequest request
    ) {
        orderService.updateOrderById(id, request);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public void deleteOrderById(@PathVariable UUID id) {
        orderService.deleteOrderById(id);
    }
}
