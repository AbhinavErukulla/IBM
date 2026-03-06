package com.example;

import java.util.ArrayList;
import java.util.List;

public class cart {
    private List<product> products = new ArrayList<>();

    public void addProduct(product product) {
        products.add(product);
    }

    public void removeProduct(product product) {
        products.remove(product);
    }

    // public double getTotal() {
    //     return products.stream().mapToDouble(product::getPrice).sum();
    // }
    // public double getTotal() {return products.stream().mapToDouble(p -> p.getPrice()).sum();
    // }

    public List<product> getProducts() {
        return products;
    }
}