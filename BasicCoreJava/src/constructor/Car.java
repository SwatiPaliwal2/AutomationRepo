package constructor; //

public class Car
{

	String name;
	String colour;
	String model;
	static int wheels=4;
	int maxSpeed;
	
	public Car(String name, String colour, String model, int maxSpeed)
	{
		// variable with this.keyword refers to global variable and right side variable refers to the
		// variables in function parameter
		this.name=name; 
		this.colour=colour;
		this.model=model;
		this.maxSpeed=maxSpeed;
			
	}
	
	public Car(String name, String model)//constructor overloading
	{
		this.name=name;
		this.model=model;
	}
	
	public void driving()
	{
	   System.out.println("I can drive my " +colour+ " color " +name+" "+model+ " at maximum speed " +maxSpeed);
	}
		
   public void brake()
   {
	   
	   System.out.println("Brake function is working on " +wheels+ " wheels " +name+" "+model);
   }

}
