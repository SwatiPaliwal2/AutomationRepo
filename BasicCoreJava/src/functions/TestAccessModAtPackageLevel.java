package functions;

public class TestAccessModAtPackageLevel 
{

	public static void main(String[] args) 
	{
		AccessModifiers ref = new AccessModifiers();
		ref.publicmethod();
		ref.noAccessModMethod();
		ref.ProtectedMethod();
	}

}
