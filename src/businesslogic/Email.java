package businesslogic;
/**
 * 
 * @author Ashraf
 * Email Object Receive Updates from the Observer to notify the Customer.
 * by sending Email to that customer
 */
public class Email implements Observer {

	
	@Override
	public void update() {
		System.out.println("Update Customer By Sending Email");
	}

}
