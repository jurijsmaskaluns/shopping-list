package com.javaguru.shoppinglist.service.validation;

import com.javaguru.shoppinglist.domain.ProductEntity;
import com.javaguru.shoppinglist.dto.ProductDto;

public interface ProductValidationRule {
    void validate(ProductDto productDto);

    default void checkNotNull(ProductDto productDto) {
        if (productDto == null) {
            throw new IllegalArgumentException("Product must be not null.");
        }
    }
}
