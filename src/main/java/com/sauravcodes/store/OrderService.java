package com.sauravcodes.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentService;
    public OrderService(@Qualifier("stripe") PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("Order created");
    }
    public  void placeOrder() {
        paymentService.processPayment(10);
    }
    public void setPaymentService(PaymentService paymentService) {

        this.paymentService = paymentService;
    }
}
