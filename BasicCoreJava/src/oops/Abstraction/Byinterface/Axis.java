package oops.Abstraction.Byinterface;

public class Axis implements RBI 
{

	@Override
	public void savingAccount() 	
	{
		System.out.println("Savings account in Axis bank");
		
	}

	@Override
	public void currentAccount() 
	{
		System.out.println("Current account in Axis bank");
	}

	@Override
	public void debitCard() 
	{
		System.out.println("Debit Card from Axis bank");
		
	}

	@Override
	public void creditCard() 
	{
		System.out.println("Credit Card from Axis bank");
		
	}

}
