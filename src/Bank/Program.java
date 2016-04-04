package Bank;

import java.util.Date;

public class Program {

	public static void main(String[] args) {
		Account a = new Account(2, 100, new Date());
		System.out.println(a.id);
		System.out.println(a.balance);
		System.out.println(a.openDate);
	}

}
