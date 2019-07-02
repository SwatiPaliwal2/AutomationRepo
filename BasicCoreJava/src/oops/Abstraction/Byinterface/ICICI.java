package oops.Abstraction.Byinterface;

public class ICICI  implements RBI
{

	@Override
	public void savingAccount() 
	{
		System.out.println("Savings account in ICICI");
		
	}

	@Override
	public void currentAccount()
	{
		
		System.out.println("Current account in ICICI");
		
	}

	@Override
	public void debitCard()
	{
		
		System.out.println("Debit card in ICICI");
	}

	@Override
	public void creditCard() 
	{
		
		System.out.println("Credit card in ICICI");
	}

}
