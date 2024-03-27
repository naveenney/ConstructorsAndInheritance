package constructorsandinheritance;


class Vehicle
{
   protected String name;
   
   protected String modelYear;

public Vehicle(String name, String modelYear) {
	super();
	this.name = name;
	this.modelYear = modelYear;
}
   
}
class Bike extends Vehicle
{

	public Bike(String name, String modelYear) {
		super(name, modelYear);
		}
	
}

class car extends Vehicle
{
	
	public car(String name,String modelYear)
	{
		super(name,modelYear);
	}
	
}


