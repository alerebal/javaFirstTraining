package basic;

public class functionsBasic {
	public static void main(String[] args) {
		string();
		sum(3, 7);
		System.out.println(mult(3, 5));
	}
	
	static void string() {
		System.out.println("un string");
	}
	
	static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	static int mult(int a, int b) {
		sum(a, b);
		return a * b;
	}
}

