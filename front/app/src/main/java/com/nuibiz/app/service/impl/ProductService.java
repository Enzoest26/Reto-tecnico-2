package com.nuibiz.app.service.impl;

import com.nuibiz.app.dto.Producto;
import com.nuibiz.app.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

    private final WebClient client;

    @Override
    public Flux<Producto> getAll() {
        return client.get().uri("/api/products")
                .retrieve()
                .bodyToFlux(Producto.class);
    }
}
