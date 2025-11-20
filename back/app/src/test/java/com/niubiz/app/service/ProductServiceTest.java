package com.niubiz.app.service;

import com.niubiz.app.model.Product;
import com.niubiz.app.service.impl.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Test
    @DisplayName("Returns all products")
    void testGetAllReturnsAllProducts() {
        // When
        Flux<Product> result = productService.getAll();

        // Then
        StepVerifier.create(result)
                .expectNextCount(3)
                .verifyComplete();
    }

    @Test
    @DisplayName("Returns all products with the correct productIds")
    void testReturnsProdcutsWithCorrectIds() {
        // When
        Flux<Product> result = productService.getAll();

        // Then
        StepVerifier.create(result)
                .expectNextMatches(product -> product.getProductId().equals(1L))
                .expectNextMatches(product -> product.getProductId().equals(2L))
                .expectNextMatches(product -> product.getProductId().equals(3L))
                .verifyComplete();
    }
}
