package org.roklabs.strategy_pattern.payment;

public interface IPayment {
    void takePaymentDetails();

    boolean verifyPaymentDetails();

    void pay(float amount);
}
