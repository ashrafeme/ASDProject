package businesslogic;

import java.util.ArrayList;
import java.util.List;

public abstract class Payment {

	List<Observer> observerlist;
	private String cardNumber;



	public Payment() {
		observerlist = new ArrayList<>();
	}

	public void attachObserver(Observer observer) {
		if (!observerlist.contains(observer))
			observerlist.add(observer);
	}

	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		int i = observerlist.indexOf(observer);
		if (i >= 0)
			observerlist.remove(i);
	}

	public final boolean charge() {

		boolean result = false;

		validateCustomerInformation();
		validateBillingInformation();
		if (processPayment(cardNumber))
			if (notifyCustomer())
				result = true;
		return result;
	}
	
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public abstract void validateCustomerInformation();

	public abstract void validateBillingInformation();

	public abstract boolean processPayment(String cardNumber);

	public boolean notifyCustomer() {

		System.out.println("Notify Customer Using Oberver Pattern");
		for (Observer obs : observerlist) {
			obs.update();
		}
		return true;
	}// Observer pattern can add here
}
