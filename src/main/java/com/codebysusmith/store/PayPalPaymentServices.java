package com.codebysusmith.store;

public class PayPalPaymentServices implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal");
        System.out.println("Payment: " + amount + "$");
    }
}
