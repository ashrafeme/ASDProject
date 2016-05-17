package businesslogic;

public class SMS implements Observer {

	@Override
	public void update() {
		System.out.println("Update Customer by Sending SMS");
	}

}
