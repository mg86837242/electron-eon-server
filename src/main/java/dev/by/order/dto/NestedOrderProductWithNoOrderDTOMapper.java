package dev.by.order.dto;

import dev.by.orderproduct.OrderProduct;
import dev.by.product.dto.ProductDTOMapper;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class NestedOrderProductWithNoOrderDTOMapper implements Function<OrderProduct, NestedOrderProductWithNoOrderDTO> {

    private final ProductDTOMapper productDTOMapper;

    public NestedOrderProductWithNoOrderDTOMapper(
            ProductDTOMapper productDTOMapper
    ) {
        this.productDTOMapper = productDTOMapper;
    }

    @Override
    public NestedOrderProductWithNoOrderDTO apply(OrderProduct orderProduct) {
        return new NestedOrderProductWithNoOrderDTO(
                orderProduct.getId(),
                productDTOMapper.apply(orderProduct.getProduct()),
                orderProduct.getQuantity()
        );
    }
}