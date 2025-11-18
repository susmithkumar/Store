package com.codebysusmith.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {
   public  static void main(String[] args) {
       var orderService = new OrderService(new PayPalPaymentServices());
       orderService.placeOrder();
   }
}
