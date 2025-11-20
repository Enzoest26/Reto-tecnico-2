package com.nuibiz.app.controller;

import com.nuibiz.app.dto.Producto;
import com.nuibiz.app.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final IProductService productService;

    @GetMapping
    public Flux<Producto> getAll() {
        return productService.getAll();
    }
}
