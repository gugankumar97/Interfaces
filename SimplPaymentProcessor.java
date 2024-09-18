package Interfaces;

public class SimplPaymentProcessor implements PaymentProcessor, PaymentValidator {
	

	@Override
	public void processPayment(PaymentData payment) {
		
		System.out.println("Inside Simple Payment Processor");
		/* String secureToken = ChaseApi.requestSecureTokenForApp();
		 * initPaymentPage(secureToken, payment.getPaymentAmount);
		 * ...
		 */	
	}

	@Override
	public boolean validatePayment(PaymentData payment) {
		// code to validate payment goes here
		return true;
	}

	@Override
	public void processing() {
		// TODO Auto-generated method stub
		
	}

}
