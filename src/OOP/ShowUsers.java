package OOP;

public class ShowUsers {

	public static void main(String[] args) {
		Person user1 = new Person();
		user1.setDni(444444);
		user1.setName("jole");
		System.out.println(user1.getName());
		user1.userGreeting();
		System.out.println(user1.userPinga());
		
		TestingUser test1 = new TestingUser();
		test1.userGreeting();
		System.out.println(test1.userPinga());
	}

}
