package businesslogic;

public class Visa extends Payment {

	@Override
	public void validateCustomerInformation() {
		System.out.println("Visa is Validating Customer Information");

	}

	@Override
	public void validateBillingInformation() {
		System.out.println("Visa is Validating Billing Information");

	}

	@Override
	public boolean processPayment() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
