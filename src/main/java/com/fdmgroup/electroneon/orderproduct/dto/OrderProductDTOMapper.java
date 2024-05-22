package com.fdmgroup.electroneon.orderproduct.dto;

import com.fdmgroup.electroneon.order.dto.OrderDTOMapper;
import com.fdmgroup.electroneon.orderproduct.OrderProduct;
import com.fdmgroup.electroneon.product.dto.ProductDTOMapper;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class OrderProductDTOMapper implements Function<OrderProduct, OrderProductDTO> {

    private final OrderDTOMapper orderDTOMapper;
    private final ProductDTOMapper productDTOMapper;

    public OrderProductDTOMapper(
            OrderDTOMapper orderDTOMapper,
            ProductDTOMapper productDTOMapper
    ) {
        this.orderDTOMapper = orderDTOMapper;
        this.productDTOMapper = productDTOMapper;
    }

    @Override
    public OrderProductDTO apply(OrderProduct orderProduct) {
        return new OrderProductDTO(
                orderProduct.getId(),
                orderDTOMapper.apply(orderProduct.getOrder()),
                productDTOMapper.apply(orderProduct.getProduct()),
                orderProduct.getQuantity()
        );
    }
}
