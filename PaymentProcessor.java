package Interfaces;

public interface PaymentProcessor extends PaymentValidator,Processor  {


	int RETRY_ATTEPMPTS = 3;  // The fiels or variable assign will be in Public Static Final

	void processPayment(PaymentData payment);
	
	default void someDefaultMethod() {
		System.out.println("This is the default method");
	}

	static void someStaticMethod() {
		System.out.println("This is the static method in Payment processor interface");
	}

	void processing();
}
