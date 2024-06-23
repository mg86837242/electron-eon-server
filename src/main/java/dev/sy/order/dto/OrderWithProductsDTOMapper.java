package dev.sy.order.dto;

import dev.sy.order.Order;
import dev.sy.orderproduct.OrderProduct;
import dev.sy.user.dto.UserDTOMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

@Service
public class OrderWithProductsDTOMapper implements BiFunction<Order, List<OrderProduct>, OrderWithProductsDTO> {

    private final UserDTOMapper userDTOMapper;
    private final NestedOrderProductWithNoOrderDTOMapper nestedOrderProductWithNoOrderDTOMapper;

    public OrderWithProductsDTOMapper(
            UserDTOMapper userDTOMapper,
            NestedOrderProductWithNoOrderDTOMapper nestedOrderProductWithNoOrderDTOMapper
    ) {
        this.userDTOMapper = userDTOMapper;
        this.nestedOrderProductWithNoOrderDTOMapper = nestedOrderProductWithNoOrderDTOMapper;
    }

    @Override
    public OrderWithProductsDTO apply(
            Order order,
            List<OrderProduct> orderProducts
    ) {
        return new OrderWithProductsDTO(
                order.getId(),
                userDTOMapper.apply(order.getUser()),
                order.getStreet(),
                order.getCity(),
                order.getCreatedAt(),
                orderProducts
                        .stream()
                        .map(nestedOrderProductWithNoOrderDTOMapper)
                        .collect(Collectors.toList())
        );
    }
}
