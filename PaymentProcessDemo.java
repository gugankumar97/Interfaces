package Interfaces;

import java.math.BigDecimal;
import java.util.Scanner;

public class PaymentProcessDemo {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the payment processor Type : ( PayPal or Simpl )");
		String processorType = sc.next();
		
		Client client = new Client();
		
		if(processorType.trim() .equals("PayPal")) {
			client.setPaymentProcessor(new PayPalPaymentProcessor());	
		}else if(processorType.trim() .equals("Simpl")) {
			client.setPaymentProcessor(new SimplPaymentProcessor());	
		}else
		{
			System.out.println(" Enter the valid payment processor Type ");
		}
		
		PaymentData pData = new PaymentData();
		
		pData.setUserId(001);
		pData.setCurrency("INR");
		pData.setPaymentAmount(new BigDecimal(1000.00));
		
		if (processorType.trim() .equals("PayPal") || processorType.trim() .equals("Simpl")){
			client.checkout(pData);
			
		}

	}

}
