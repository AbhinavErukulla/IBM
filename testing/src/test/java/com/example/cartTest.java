package com.example;


import java.util.List;

import org.junit.Test;

class cartTest {

    @Test
    void testAddProduct() {
        Cart cart = new Cart();
        Product product = new Product("Laptop", 999.99);
        cart.addProduct(product);
        assertEquals(1, cart.getProducts().size());
        assertEquals(999.99, cart.getTotal());
    }

    @Test
    void testRemoveProduct() {
        Cart cart = new Cart();
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 499.99);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.removeProduct(product1);
        assertEquals(1, cart.getProducts().size());
        assertEquals(499.99, cart.getTotal());
    }
}