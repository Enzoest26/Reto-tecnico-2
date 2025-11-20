package com.nuibiz.app.service;

import com.nuibiz.app.dto.ProductDto;
import reactor.core.publisher.Flux;

public interface IProductService {

    Flux<ProductDto> getAll();
}
