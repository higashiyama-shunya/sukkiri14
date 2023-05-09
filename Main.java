package sukkiri14;

public class Main {

	public static void main(String[] args) {
		BankAccount a=new BankAccount();
		a.accountNumber=" 4649 ";
		a.balance=1592;
		System.out.println(a);
		
		boolean bool=a.equals(a.accountNumber);
		System.out.println(bool);
	}

}
