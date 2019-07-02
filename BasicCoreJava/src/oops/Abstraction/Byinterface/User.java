package oops.Abstraction.Byinterface;

public class User {

	public static void main(String[] args) 
	{
		RBI acc=new HDFC();
		
		acc.creditCard();
		acc.currentAccount();
		acc.debitCard();
		acc.savingAccount();
		
		System.out.println("*********************");
		
		acc=new Axis();
		
		acc.creditCard();
		acc.currentAccount();
		acc.debitCard();
		acc.savingAccount();
		
		System.out.println("*********************");
		
		acc=new ICICI();
		
		acc.creditCard();
		acc.currentAccount();
		acc.debitCard();
		acc.savingAccount();
		
	}

}
