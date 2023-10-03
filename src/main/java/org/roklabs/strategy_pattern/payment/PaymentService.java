package org.roklabs.strategy_pattern.payment;

public class PaymentService {
    private IPayment paymentMethod;

    public PaymentService(IPayment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processOrderPayment(float amount) {
        this.paymentMethod.takePaymentDetails();

        if (this.paymentMethod.verifyPaymentDetails()) {
            this.paymentMethod.pay(amount);
        } else {
            System.out.println("Invalid payment details ...");
        }
    }

    public IPayment getPaymentMethod() {
        return this.paymentMethod;
    }
}
