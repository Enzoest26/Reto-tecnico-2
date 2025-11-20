package com.nuibiz.app.service.impl;

import com.nuibiz.app.dto.ProductDto;
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
    public Flux<ProductDto> getAll() {
        return client.get().uri("/products")
                .retrieve()
                .bodyToFlux(ProductDto.class);
    }
}
