package dataStructures;

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet = {"a", "b", "c", "d", "e", "f"};
		
		for(int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
		
		System.out.println("\n\nFor each method");
		
		for (String letter: alphabet) {
			System.out.print(letter + " ");
		}
		
		System.out.println("\n\nDouble Arrays");
		
		String[][] users = {
				{"Ale", "Rebaldería", "ale@ale.com", "54354545"},
				{"Ana", "Huwa", "ana@ana.com", "84738374"},
				{"Azul", "RebaHuwa", "azul@azul.com", "889888"}
		};
		
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("Number of users: " + numOfUsers);
		System.out.println("Number of fields: " + numOfFields);
		
		// Traverse the double array
		
		for(String[] user: users) {
			System.out.print("[ ");
			for(String field: user) {
				
				System.out.print(field + " - ");
			}
			System.out.println("]");
		}
		
		// Old way
//		for(int i = 0; i < users.length; i++) {
//			System.out.print("[ ");
//			for(int j = 0; j < users[i].length; j++) {
//				if(users[i].length - 1 == j) {
//					System.out.print(users[i][j] + " ");
//				} else {
//					System.out.print(users[i][j] + " - ");
//				}
//			}
//			System.out.println("]");
//		}
		
	}

}
