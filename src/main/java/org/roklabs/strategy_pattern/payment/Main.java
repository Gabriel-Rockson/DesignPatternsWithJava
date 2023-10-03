package org.roklabs.strategy_pattern.payment;

import java.util.Scanner;

public class Main {
    private static int paymentOption;

    private static void takePaymentOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your option: ");
        System.out.println("1. Paypal");
        System.out.println("2. Credit Card");

        setPaymentOption(Integer.parseInt(scanner.nextLine()));
        // System.out.println("Something went wrong while taking input ...");
        // System.out.println(e);
    }

    public static void main(String[] args) {

        takePaymentOption();

        if (getPaymentOption() == 2) {
            CreditCardPayment creditCardPayment = new CreditCardPayment();

            PaymentService paymentService = new PaymentService(creditCardPayment);

            paymentService.processOrderPayment(500);
        } else if (getPaymentOption() == 1) {
            PaypalPayment paypalPayment = new PaypalPayment();

            PaymentService paymentService = new PaymentService(paypalPayment);

            paymentService.processOrderPayment(500);
        }
    }

    private static void setPaymentOption(int optionNumber) {
        paymentOption = optionNumber;
    }

    private static int getPaymentOption() {
        return paymentOption;
    }

}
