package businesslogic;

public class FactoryPayment implements IFactoryPayment {

	private static IFactoryPayment instance = new FactoryPayment();

	public static IFactoryPayment getInstance() {
		return instance;
	}

	private FactoryPayment() {}

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
