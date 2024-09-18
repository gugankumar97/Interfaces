package Interfaces;

public interface PaymentValidator {

	boolean validatePayment(PaymentData payment);

	void processing();

//	default void someDefaultMethod() {
//		System.out.println("This is another default method");
//	}
	
}
