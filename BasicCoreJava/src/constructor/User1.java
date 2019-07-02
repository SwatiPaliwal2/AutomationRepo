package constructor;

public class User1
{

	public static void main(String[] args)
	{
		
		Car car1= new Car("Audi","Red","A4", 160);
		//car1.colour="Red";
		//car1.maxSpeed=160;
		//car1.name="Audi";
		//car1.model="A4";
		//car1.wheels=6;
				
		car1.brake();
		car1.driving();
		
		
		Car car2= new Car("VW","Black","Polo",160);
		//car2.colour="Black";
		//car2.maxSpeed=160;
		//car2.name="VW";
		//car2.model="Polo";
		
		car2.brake();
		car2.driving();
		
		Car car3= new Car("BMW","Red","Z4", 250);
		//car3.colour="Pink";
		//car3.maxSpeed=250;
		//car3.name="BMW";
		//car3.model="Z4";
		
		car3.brake();
		car3.driving();
	}

}
