package org.roklabs.strategy_pattern.payment;

import java.util.Scanner;

public class PaypalPayment implements IPayment {
    private String emailAddress;
    private String password;

    @Override
    public void takePaymentDetails() {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("Enter your email address: ");
            this.setEmailAddress(scanner.nextLine());

            System.out.println("Enter your password: ");
            this.setPassword(scanner.nextLine());

        } catch (Exception e) {
            System.out.println("Something went wrong while taking input ... ");
            System.out.println(e);
        }
    }

    @Override
    public boolean verifyPaymentDetails() {
        if (this.getEmailAddress().length() > 0 && this.getPassword().length() > 0) {
            return true;
        }

        return false;
    }

    @Override
    public void pay(float amount) {
        System.out.println("An amount of $" + amount + " has been paid by email adddress: " + this.getEmailAddress());
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    private void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    private String getPassword() {
        return this.password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

}
