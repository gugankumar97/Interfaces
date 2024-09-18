package Interfaces;

public class PayPalPaymentProcessor implements PaymentProcessor {

	@Override
	public void processPayment(PaymentData payment) {
		
		System.out.println("Inside PayPal Payment Processor");
		/* PayPalForm paymentForm = PayPalApi.getPaymentFormByAppId(APP_ID);
		 * fillPaymentForm(paymentForm, payment);
		 * paymentForm.submit();
		 * ...
		 */
		
	}

	@Override
	public boolean validatePayment(PaymentData payment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void processing() {
		// TODO Auto-generated method stub
		
	}
}
