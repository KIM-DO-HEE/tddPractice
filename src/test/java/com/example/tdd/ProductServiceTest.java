package com.example.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

public class ProductServiceTest {


    @Autowired
    private ProductSerivce productSerivce;

    @Test
    void 상품등록(){
        final AddProductRequest request = 상품등록요청_생성();

        productSerivce.addProduct(request);
    }

    private static AddProductRequest 상품등록요청_생성(){
        final String name = "상품명";
        final int price = 1000;
        final DiscountPolicy discountPolicy = DiscountPolicy.NONE;

        return new AddProductRequest(name, price, discountPolicy);
    }
}
