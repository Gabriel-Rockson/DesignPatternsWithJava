package org.roklabs.strategy_pattern.payment;

import java.util.Scanner;

public class CreditCardPayment implements IPayment {
    private String ccName;
    private String ccNumber;
    private String ccCVV;
    private String ccAddress;

    @Override
    public void takePaymentDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name on the credit card: ");
        this.setCCName(scanner.nextLine());

        System.out.println("Enter your credit card number: ");
        this.setCCNumber(scanner.nextLine());

        System.out.println("Enter the cvv of the credit card: ");
        this.setCCCVV(scanner.nextLine());

        System.out.println("Enter the address attached to the credit card: ");
        this.setCCAddress(scanner.nextLine());

        scanner.close();
    }

    @Override
    public boolean verifyPaymentDetails() {
        if (this.getCCName().length() < 3) {
            return false;
        }

        if (this.getCCAddress().length() < 1) {
            return false;
        }

        if (this.getCCNumber().length() < 5) {
            return false;
        }

        if (this.getCCCVV().length() != 3) {
            return false;
        }

        return true;
    }

    @Override
    public void pay(float amount) {
        System.out.println("Amount of $" + amount + " is paid for by using Credit Card.");

        System.out.println("Credit card details");
        System.out.println("Name: " + this.getCCName());
        System.out.println("Address: " + this.getCCAddress());
        System.out.println("CC Number: " + this.getCCNumber());
    }

    public String getCCName() {
        return this.ccName;
    }

    public String getCCNumber() {
        return this.ccNumber;
    }

    public String getCCCVV() {
        return this.ccCVV;
    }

    public String getCCAddress() {
        return this.ccAddress;
    }

    private void setCCName(String ccName) {
        this.ccName = ccName;
    }

    private void setCCNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    private void setCCAddress(String ccAddress) {
        this.ccAddress = ccAddress;
    }

    private void setCCCVV(String ccCVV) {
        this.ccCVV = ccCVV;
    }
}
