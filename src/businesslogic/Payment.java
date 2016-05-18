package businesslogic;

import java.util.ArrayList;
import java.util.List;

/**
 * Template Method Pattern define the payment processing algorithm also this
 * class use the observer pattern to notify the customer
 * 
 * @author Ashraf
 *
 */
public abstract class Payment {

	List<Observer> observerlist;
	
	private double amount;

	private String cardNumber;
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public Payment() {
		observerlist = new ArrayList<>();
	}
	
	public Payment(double amount,String cardNumber) {
		this();
		this.amount = amount;
		this.cardNumber = cardNumber;
	}


	/**
	 * Attach new Observer object to get the notification about the payment.
	 * 
	 * @param observer
	 *            is class has interest to got notify when payment happening.
	 */
	public void attachObserver(Observer observer) {
		if (!observerlist.contains(observer))
			observerlist.add(observer);
	}

	/**
	 * Remove the observer object from the interesting list.
	 * 
	 * @param observer
	 */
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		int i = observerlist.indexOf(observer);
		if (i >= 0)
			observerlist.remove(i);
	}

	/**
	 * start the process of charging the customer.
	 * 
	 * @return true if the charge happened successfully or not
	 */
	public final boolean charge() {

		boolean result = false;

		validateCustomerInformation();
		validateBillingInformation();
		if (processPayment())
			if (notifyCustomer())
				result = true;
		return result;
	}
	

	/**
	 * Validate the Customer Data before starting the payment Process. this
	 * method defined to let the subclass to over take it and define how the
	 * validation done.
	 */

	public abstract void validateCustomerInformation();

	/**
	 * validate the bill information before starting the payment process.
	 */
	public abstract void validateBillingInformation();



	/**
	 * the processing payment happen here if and the subclass to do this
	 * processing depend on the payment method.
	 * 
	 * @return true if it is success and false if not.
	 */
	public abstract boolean processPayment();

	/**
	 * Notify the interested observer that the payment is happened
	 * @return true if it is success and false if not.
	 */
	public boolean notifyCustomer() {

		System.out.println("Notify Customer Using Oberver Pattern");
		for (Observer obs : observerlist) {
			obs.update();
		}
		return true;
	}

	
}
