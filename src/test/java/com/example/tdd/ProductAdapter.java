package com.example.tdd;

class ProductAdapter implements ProductPort {
    private final ProductRepository productRepository;

    ProductAdapter(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }
}
