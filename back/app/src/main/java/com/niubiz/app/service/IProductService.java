package com.niubiz.app.service;

import com.niubiz.app.model.Product;
import reactor.core.publisher.Flux;


public interface IProductService {

    Flux<Product> getAll();
}
