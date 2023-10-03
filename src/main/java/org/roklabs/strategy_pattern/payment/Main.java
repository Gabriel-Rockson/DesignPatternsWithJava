package org.roklabs.strategy_pattern.payment;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();

        PaymentService paymentService = new PaymentService(creditCardPayment);

        paymentService.processOrderPayment(500);
    }
}
