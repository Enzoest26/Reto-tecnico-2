package com.niubiz.app.service.impl;

import com.niubiz.app.model.Product;
import com.niubiz.app.service.IProductService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService implements IProductService {

    public static final List<Product> DATA = Arrays.asList(
            new Product(1L, "Title 01"),
            new Product(2L, "Title 02"),
            new Product(3L, "Title 03")
    );

    @Override
    public Flux<Product> getAll() {
        return Flux.fromIterable(DATA);
    }
}
