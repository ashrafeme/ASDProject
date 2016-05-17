package businesslogic;

public class Paypal extends Payment {

	@Override
	public void validateCustomerInformation() {
		System.out.println("Paypal is Validating Customer Information");

	}

	@Override
	public void validateBillingInformation() {
		System.out.println("Paypal is Validating Billing Information");

	}

	@Override
	public boolean processPayment() {
		System.out.println("Paypal is processing.......");
		return true;
	}

	

}
