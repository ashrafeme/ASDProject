package businesslogic;

/**
 * Define how the payment method MasterCard used to charge the customer.
 * 
 * @author Ashraf
 *
 */
public class MasterCard extends Payment {

	private String cardNumber;
	
	public MasterCard() {
		
	}
	public MasterCard(String cardNumber, double amount) {
		super(amount);
		this.cardNumber = cardNumber;
		
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

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
