package functions;

public class AccessModifiers 
{

	public static void main(String[] args) 
	{
		//calling non static function
		AccessModifiers ref = new AccessModifiers();
		ref.publicmethod();
		ref.privatemethod();
		ref.noAccessModMethod();
		ref.ProtectedMethod();
	}

	
	//public - can be used throughout the project ie class, package and project
	public void publicmethod()
	{
		System.out.println("public method");
	}
	
	//private - can be used only within the class
		private void privatemethod()
		{
			System.out.println("private method");
		}
		
	//No access modifier - can be used only within the package
		void noAccessModMethod()
		{
			System.out.println("No Access Modifier method");
		}
		
	//Protected Method - can be used within the package and by using object of child class can call 
		//throughout the project
		void ProtectedMethod()
		{
			System.out.println("Protected method");
			
		}
		
}
