package com.niubiz.app.controller;

import com.niubiz.app.model.Product;
import com.niubiz.app.service.IProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

import static org.mockito.Mockito.when;

@WebFluxTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @MockitoBean
    private IProductService productService;

    @Test
    @DisplayName("Return all products")
    void getAll() {
        // Given
        when(productService.getAll()).thenReturn(Flux.just(
                new Product(1L, "Title 01"),
                new Product(2L, "Title 02")
        ));

        // When / Then
        webTestClient.get()
                .uri("/api/products")
                .exchange()
                .expectStatus().isOk()
                .expectBodyList(Product.class)
                .hasSize(2)
                ;
    }
}
