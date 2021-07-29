package recursion;

public class ReversalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("poronga"));
	}
	
	public static String reverseString(String input) {
		if(input.equals("")) {
			return "";
		}
		return reverseString(input.substring(1)) + input.charAt(0);
	}

}
