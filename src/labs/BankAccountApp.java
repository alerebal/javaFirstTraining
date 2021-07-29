package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("45619898L", 1500);
		
		acc1.setName("Alejandro");
		System.out.println(acc1.toString());
	}

}

class BankAccount implements IInterest {
	// Properties of bank account
	private static int ID = 1000; // Internal ID , belongs to the class, because it must be unique
	private String accountNumber; // ID + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "005400657"; 
	private String name;
	private String SSN;
	private double balance;
	
	// Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
		System.out.println(toString());
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account Number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making deposit: " + amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}

	@Override
	public void accruel() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override 
	public String toString() {
		return "[Name: " + name + "]\n[Account number: " + accountNumber + "]\n[Routing number: " + routingNumber + "]\n" + "[Balance: " + balance + "]"; 
	}
}


