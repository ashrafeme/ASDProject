package businesslogic;

public class Paypal extends Payment {

	private String email;

	public Paypal() {

	}

	public Paypal(String email, double amount) {
		super(amount);
		this.setEmail(email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
System.out.println("Paypal is processing amount(" + getAmount() + ".......");
		
		return true;
	}

}
