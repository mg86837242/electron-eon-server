package com.fdmgroup.electroneon.order.dto;

import com.fdmgroup.electroneon.order.Order;
import com.fdmgroup.electroneon.user.dto.UserDTOMapper;
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
