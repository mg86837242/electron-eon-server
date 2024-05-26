package dev.by.cart.dto;

import dev.by.cart.Cart;
import dev.by.product.dto.ProductDTOMapper;
import dev.by.user.dto.UserDTOMapper;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class CartDTOMapper implements Function<Cart, CartDTO> {

    private final UserDTOMapper userDTOMapper;
    private final ProductDTOMapper productDTOMapper;

    public CartDTOMapper(
            UserDTOMapper userDTOMapper,
            ProductDTOMapper productDTOMapper
    ) {
        this.userDTOMapper = userDTOMapper;
        this.productDTOMapper = productDTOMapper;
    }

    @Override
    public CartDTO apply(Cart cart) {
        return new CartDTO(
                cart.getId(),
                userDTOMapper.apply(cart.getUser()),
                productDTOMapper.apply(cart.getProduct()),
                cart.getQuantity()
        );
    }
}
