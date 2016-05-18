package businesslogic;
/**
 * Define abstraction to get the payment method using Factory Method Pattern
 * @author Ashraf
 *
 */
public interface IFactoryPayment {

	/**
	 * Create payment method using factory method pattern.
	 * @param payType Enum Define the available type of payments.
	 * @return Object of the payment that customer will use to pay.
	 */
	public Payment createPayment(PaymentMethod payType);
}
