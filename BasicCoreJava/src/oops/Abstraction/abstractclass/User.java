package oops.Abstraction.abstractclass;

public class User {

	public static void main(String[] args) 
	{
		MSWord obj = new Sprint3();
		obj.editing();
		obj.format();
		obj.print();
		obj.save();
		obj.toolBar();
		
		
		//MSWord ref=new MSWord();         // cannot create object of abstract class
	}

}
