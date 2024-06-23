package dev.sy.order.dto;

import dev.sy.order.Order;
import dev.sy.user.dto.UserDTOMapper;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class OrderDTOMapper implements Function<Order, OrderDTO> {

    private final UserDTOMapper userDTOMapper;

    public OrderDTOMapper(UserDTOMapper userDTOMapper) {
        this.userDTOMapper = userDTOMapper;
    }

    @Override
    public OrderDTO apply(Order order) {
        return new OrderDTO(
                order.getId(),
                userDTOMapper.apply(order.getUser()),
                order.getStreet(),
                order.getCity(),
                order.getCreatedAt()
        );
    }
}
