package businesslogic;
/**
 * Define how the payment method MasterCard used to charge the customer.
 * @author Ashraf
 *
 */
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
	public boolean processPayment() {
		// TODO Auto-generated method stub
		return false;
	}

}
