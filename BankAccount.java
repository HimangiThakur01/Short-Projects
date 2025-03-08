/*class LightBulb {
  private boolean isOn = false;
  
   public void switchOn() {
     if (!isOn) {
	    isOn = true;
		System.out.println("Lightbulb is now ON.");
	} else {
	     System.out.println("Lightbulb is already ON.");
    }
	
  }
  
  void switchOff() {
   if (isOn) {
     isOn = false; 
     System.out.println("Lightbulb is now OFF.");
   } else {
        System.out.println("Lightbulb is already OFF.");
		
   }
 }

 void checkState() {
    if (isOn) {
        System.out.println("The lightbulb is currently ON.");
    } else {
       System.out.println("The lightbulb is currently OFF.");
    }	   
	
 }
 public static void main(String[] args) {
   LightBulb bulb = new LightBulb();
   
   bulb.checkState();
   bulb.switchOn();
   bulb.switchOn();
   bulb.checkState();
   bulb.switchOff();
   bulb.switchOff();
   bulb.checkState();
   }
   
  }*/
   
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
		 
			  
		