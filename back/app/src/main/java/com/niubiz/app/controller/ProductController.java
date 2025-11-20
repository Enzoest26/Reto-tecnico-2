package com.niubiz.app.controller;

import com.niubiz.app.model.Product;
import com.niubiz.app.service.IProductService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final IProductService productService;

    @GetMapping
    @Operation(summary = "Get all", description = "Retrieve a list of all products")
    public Flux<Product> getAll() {
        return productService.getAll();
    }

}
