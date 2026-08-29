package com.sauravcodes.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {
    private PaymentService paymentService;
    public OrderService(@Qualifier("stripe") PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("Order created");
    }
    @PostConstruct
    public void init() {
        System.out.println("OrderService PostCostruct");
    }
    @PreDestroy
    public void cleanup() {
        System.out.println("OderService preDestroy");
    }

    public  void placeOrder() {
        paymentService.processPayment(10);
    }
    public void setPaymentService(PaymentService paymentService) {

        this.paymentService = paymentService;
    }
}
