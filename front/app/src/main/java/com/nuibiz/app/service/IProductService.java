package com.nuibiz.app.service;

import com.nuibiz.app.dto.Producto;
import reactor.core.publisher.Flux;

public interface IProductService {

    Flux<Producto> getAll();
}
