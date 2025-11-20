package com.niubiz.app.service;

import com.niubiz.app.model.Product;
import com.niubiz.app.service.impl.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class ProductServiceTest {

    private final ProductService productService = new ProductService();

    @Test
    @DisplayName("Test getAll() returns all products")
    void testGetAllReturnsAllProducts() {
        // When
        Flux<Product> result = productService.getAll();

        // Then
        StepVerifier.create(result)
                .expectNextCount(3)
                .verifyComplete();
    }
}
