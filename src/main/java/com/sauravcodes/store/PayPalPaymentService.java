package com.sauravcodes.store;

import org.springframework.stereotype.Service;

public class PayPalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal");
        System.out.println("Amount " + amount);
    }
}
