public class CreateAccount
{

		
		public static void main(String[] args) 
		
		{
			
		// Account njeriAccount = new Account(121,"Eunice Njeri", 100.0 );
		
		Account group1 = new Account(); // creates an object of the class Account
		
		group1.accountNo = 134;
		group1.accountName = "Wilson" ;
		group1.balance = 100;
		
		group1.save(10000) ;
		group1.withdraw(1000) ;
		
		
		System.out.println("A/c no: " + group1.accountNo +
		" A/c name: " + group1.accountName + " Balance: "
		+ group1.balance);
		}
	}
	