package net.sahet.app12factor.service;


import lombok.extern.slf4j.Slf4j;
import net.sahet.app12factor.web.dto.Product;
import net.sahet.app12factor.web.dto.RateRequest;
import net.sahet.app12factor.web.dto.RateResponse;
import net.sahet.app12factor.exception.RateNotFoundException;
import net.sahet.app12factor.exception.RequestValidationException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class RateService {


    public RateResponse getRates(RateRequest request) {
        RateResponse rateResponse = new RateResponse();

        if (request == null || request.getProduct() == null)
            throw new RequestValidationException("Illegal Request, product name is required");

        int amount = request.getAmount() == 0 ? 1 : request.getAmount();
        final List<Product> products = getProducts().stream().filter(product -> request.getProduct().equals(product.getName()))
                .limit(amount).collect(Collectors.toList());
        rateResponse.setProducts(products);

        if (products.isEmpty()) {
            throw new RateNotFoundException("No such product with this name: " + request.getProduct());
        }
        return rateResponse;
    }

    private List<Product> getProducts() {
        List<Product> products = new ArrayList<>();

        Product.ProductBuilder builder = Product.builder();
        Product product = builder.name("Adidas").rate(1).build();
        products.add(product);

        product = builder.name("Nike").rate(2).build();
        products.add(product);

        product = builder.name("Adidas").rate(11).build();
        products.add(product);

        product = builder.name("Nike").rate(22).build();
        products.add(product);

        product = builder.name("Puma").rate(3).build();
        products.add(product);

        product = builder.name("Nike").rate(222).build();
        products.add(product);

        product = builder.name("Adidas").rate(111).build();
        products.add(product);

        product = builder.name("Nike").rate(2222).build();
        products.add(product);

        product = builder.name("Puma").rate(33).build();
        products.add(product);
        return products;
    }
}

