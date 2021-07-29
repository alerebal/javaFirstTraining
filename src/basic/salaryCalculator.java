package basic;

public class salaryCalculator {
	public static void main(String[] args) {
		String career;
		career = "Web developer";
		
		int weeks = 50;
		int hours = 40;
		double rate = 35;
		
		double salary = hours * weeks * rate;
		
		System.out.println("my salary is " + salary + " as " + career);
	}
}
