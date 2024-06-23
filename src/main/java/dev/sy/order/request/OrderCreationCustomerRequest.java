package dev.sy.order.request;

import java.util.List;

public record OrderCreationCustomerRequest(
        String street,
        String city,
        List<NestedOrderProductCreationRequest> orderProducts
) {
}
