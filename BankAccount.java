 class BankAccount {
	  private double balance = 0.0;
	  
	  void deposit(double amount) {
		  if (amount > 0) {
			  balance += amount;
			  System.out.println("Deposited: " + amount);
			  
		  } else {
			  System.out.println("Invalid deposite amount. " );
		  }
		  
	  }
	  
	 void withdraw(double amount) {
		 if (amount > 0 && amount <= balance) {
			 balance -= amount;
			 System.out.println("Withdraw: " + amount);
		 }
		  else {
			  System.out.println("Invalid deposite amount. ");
			  
		 }
	 }
	 
	 void checkBalance() {
		 System.out.println("Current balance: " + balance);
		 
	 }
	 
	 public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.checkBalance(); 
        account.deposit(1000);  
        account.checkBalance(); 
        account.withdraw(500);  
        account.checkBalance(); 
        account.withdraw(600);
	 }
	 
  } 
		 
			  
		
