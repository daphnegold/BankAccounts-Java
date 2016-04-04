package Bank;

import java.util.Date;

public class Account {
	
	public static final int FEE = 0;
	public static final int MIN_BAL = 0;
	
	Integer id;
	Integer balance;
	Date openDate = null;
	
	public Account(int id, int initialBalance, Date openDate) {
	    this.id = id;
	    this.balance = initialBalance;
	    this.openDate = openDate;
	}
	
}
