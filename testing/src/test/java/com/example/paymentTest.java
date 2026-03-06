package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class paymentTest {

    @Test
    void testProcessPayment() {
        Payment payment = new Payment();
        assertTrue(payment.processPayment(100.00));
        assertFalse(payment.processPayment(-1.00));
    }
}