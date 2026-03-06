package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class productTest {

    @Test
    void testProductCreation() {
        Product product = new Product("Laptop", 999.99);
        assertEquals("Laptop", product.getName());
        assertEquals(999.99, product.getPrice());
    }
}