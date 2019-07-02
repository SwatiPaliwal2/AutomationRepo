package oops.Abstraction.Byinterface;

public class HDFC implements RBI
{

	@Override
	public void savingAccount() 
	{
		System.out.println("SAvings account in HDFC");
		
	}

	@Override
	public void currentAccount() 
	{
		System.out.println("Current account in HDFC");
		
	}

	@Override
	public void debitCard() 
	{
		System.out.println("Debit Card from HDFC");
				
	}

	@Override
	public void creditCard()
	{
		System.out.println("Credit Card from HDFC");
		
	}

}
