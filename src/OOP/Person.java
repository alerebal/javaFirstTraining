package OOP;

public class Person implements IUser{
	private String name;
	private int dni;
	
	Person() {
//		System.out.println("Name " + name + "DNI: " + dni);
		System.out.println("New user created." );
	}
	
	Person(String name) {
		System.out.println("nuevo " + name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	// Interface setting
	public void userGreeting() {
		System.out.println("Hello puto");
	}
	
	public String userPinga() {
		return "String from Interface";
	}
	
	
}
