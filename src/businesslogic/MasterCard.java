package businesslogic;

public class MasterCard extends Payment {

	@Override
	public void validateCustomerInformation() {
		System.out.println("MasterCard is Validating Customer Information");

	}

	@Override
	public void validateBillingInformation() {
		System.out.println("MasterCard is Validating Billing Information");

	}

	@Override
	public boolean processPayment(String cardNumber) {
		System.out.println("MasterCard is processing.......");
		return true;
	}

}
