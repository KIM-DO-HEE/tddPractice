package com.example.tdd;

class ProductSerivce {
    private final ProductServiceTest productServiceTest;
    private final ProductPort productPort;

    public void addProduct(final ProductServiceTest.AddProductRequest request) {
//            throw new UnsupportedOperationException("Unsupportd AddProductRequest");
        final Product product = new Product(request.getName(), request.getPrice(), request.getDiscountPolicy());

        productServiceTest.productRepository.save(product);
    }

    public ProductSerivce(ProductServiceTest productServiceTest, final ProductPort productPort) {
        this.productServiceTest = productServiceTest;
        this.productPort = productPort;
    }

}
