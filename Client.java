package Interfaces;

public class Client {

	private PaymentProcessor paymentProcessor;

	public void checkout(PaymentData payment) {
		// ... some methods calls goes here
		paymentProcessor.processPayment(payment);
		
		//PaymentProcessor.someStaticMethod(); // demo of static method invocation
		
		
	}

	public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}
}
