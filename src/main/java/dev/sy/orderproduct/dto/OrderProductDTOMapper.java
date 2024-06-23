package dev.sy.orderproduct.dto;

import dev.sy.order.dto.OrderDTOMapper;
import dev.sy.orderproduct.OrderProduct;
import dev.sy.product.dto.ProductDTOMapper;
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
