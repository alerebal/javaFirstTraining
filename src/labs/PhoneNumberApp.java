package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// This will read a text file and will retrieve phone number

		String filename = "/home/alerebal/java/files/phoneNumber.txt";
		String wrongFile = "/home/alerebal/java/files/wrongNumber.txt";
		File file = new File(filename);
		File wile = new File(wrongFile);
		String phoneNum = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(wile));
			phoneNum = br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: File not found");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: Could not read file");
			e.printStackTrace();
		}
		
		// Valid phone number
			// 10 digits long
			// Area code cannot start in 0 or 9
			// There can be 911 in the phone
		try {
			if(phoneNum.length() != 10) {
				throw new TenDigitsException(phoneNum);
			} 
			if(phoneNum.substring(0, 1).equals("0") || phoneNum.substring(0, 1).equals("9")) {
				throw new AreaCodeException(phoneNum);
			}
			System.out.println(phoneNum);
			}
			catch (TenDigitsException e) {
				System.out.println("ERROR: Phone number is not 10 digits");
				System.out.println(e.toString());
			}
			catch (AreaCodeException e) {
				System.out.println("ERROR: Phone number has invalid area code");
				System.out.println(e.toString());
			}
		}
}

class TenDigitsException extends Exception {
	String num;
	TenDigitsException(String num) {
		this.num = num;
	}
	public String toString() {
		return "TenDigitsExcepton: " + num;
	}
}

class AreaCodeException extends Exception {
	String num;
	AreaCodeException(String num) {
		this.num = num;
	}
	public String toString() {
		return "AreaCodeException: " + num;
	}
}



