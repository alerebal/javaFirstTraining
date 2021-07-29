package OOP;

public class TestingUser implements IUser {

	private String testing = "testando";
	
	TestingUser() {
		System.out.println("constructo of Testing");
	}
	
	@Override
	public void userGreeting() {
		// TODO Auto-generated method stub
		System.out.println("testing");
	}

	@Override
	public String userPinga() {
		// TODO Auto-generated method stub
		return "from Testing";
	}
	
}
