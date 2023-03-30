package com.example.tdd;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
class ProductSerivce {
    private final ProductPort productPort;

    public ProductSerivce(final ProductPort productPort) {
        this.productPort = productPort;
    }

    @Transactional
    public void addProduct(final AddProductRequest request) {
        final Product product = new Product(request.getName(), request.getPrice(), request.getDiscountPolicy());
        productPort.save(product);
    }

}
