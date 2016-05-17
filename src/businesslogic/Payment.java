package businesslogic;

public abstract class Payment {

	public final boolean charge() {

		boolean result = false;

		validateCustomerInformation();
		validateBillingInformation();
		if (processPayment())
			if (notifyCustomer())
				result = true;
		return result;
	}

	public abstract void validateCustomerInformation();

	public abstract void validateBillingInformation();

	public abstract boolean processPayment();

	public  boolean notifyCustomer(){
		
		System.out.println("Notify Customer Using Oberver Pattern");
		
		return true;}// Observer pattern can add here
}
