package businesslogic;

/**
 * Factory Method Pattern to get the customer payment method Paypal,Mastercard
 * or visa and here we use singleton pattern to get the factorypayment object .
 * 
 * @author Ashraf
 */
public class FactoryPayment implements IFactoryPayment {

	private static IFactoryPayment instance = new FactoryPayment();

	/**
	 * Create and get Object of FactoryPayment to use it in create payment object
	 * @return Object of the FactoryPayment
	 */
	public static IFactoryPayment getInstance() {
		return instance;
	}

	private FactoryPayment() {
	}

	@Override
	public Payment createPayment(PaymentMethod payType) {
		Payment result = null;
		switch (payType) {
		case PAYPAL:
			result = new Paypal();
			break;
		case MASTERCARD:
			result = new MasterCard();
			break;
		case VISACARD:
			result = new Visa();
			break;
		}
		return result;
	}

}
