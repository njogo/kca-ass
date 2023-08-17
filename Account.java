public class Account
{
	// declare the variables
	
	// write our methods
	
	int accountNo;
	String accountName;
	double balance;
	
 	public Account () 
	{
		
	}

// public Account (int no, String name, double bal) 
// {
// 	accountNo = no;
// 	accountName = name;
// 	balance = bal;
// }
	
public void save(double amount)   
{
	balance = balance + amount;
}
	


public double withdraw(double amount)
{
	if (balance - amount < 0) 
	{
	System. out. println("Insufficient Funds");
	
	} 
	else 
	{
	balance = balance - amount;
	}
	
	return balance;
	
}
		
}
