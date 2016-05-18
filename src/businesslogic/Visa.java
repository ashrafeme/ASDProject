package businesslogic;

public class Visa extends Payment {

	private String cardNumber;

	public Visa() {

	}

	public Visa(String cardNumber, double amount) {
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
		System.out.println("Visa is Validating Customer Information");

	}

	@Override
	public void validateBillingInformation() {
		System.out.println("Visa is Validating Billing Information");

	}

	@Override
	public boolean processPayment() {
System.out.println("visa is processing amount(" + getAmount() + ".......");
		
		return true;
	}

}
