package com.codebysusmith.store;

public class StipePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Payment: " + amount + "$");
    }
}
