package businesslogic;

public class Paypal extends Payment {

	

	public Paypal() {

	}

	public Paypal(String email, double amount) {
		super(amount, email);
	}

	

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
		System.out.println("Paypal is processing amount(" + getAmount() + ").......");

		return true;
	}

}
