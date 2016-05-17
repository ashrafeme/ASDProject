package businesslogic;

public class Email implements Observer {

	@Override
	public void update() {
		System.out.println("Update Customer By Sending Email");
	}

}
