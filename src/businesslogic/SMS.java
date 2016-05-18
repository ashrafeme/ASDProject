package businesslogic;
/**
 * 
 * @author Ashraf
 * SMS Object Receive Updates from the Observer to notify the Customer.
 * by sending SMS to that customer
 */
public class SMS implements Observer {
	
	@Override
	public void update() {
		System.out.println("Update Customer by Sending SMS");
	}

}
