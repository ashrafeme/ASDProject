package businesslogic;

public interface IFactoryPayment {

	public Payment createPayment(PaymentMethod payType);
}
