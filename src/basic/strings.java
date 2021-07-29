package basic;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String bookTitle = "la pinga del mono";
		if(bookTitle.contains("pinga")) {
			System.out.println("si contiene");
		}
		String firstName = "Alejandro";
		if(firstName.equalsIgnoreCase("aleJandro")) {
			System.out.println(firstName.length());
		}
		
		System.out.println(firstName.substring(firstName.length() -4));
	}

}
