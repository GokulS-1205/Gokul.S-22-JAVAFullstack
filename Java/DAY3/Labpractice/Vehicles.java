package day3;

class Veheicle
{
	void drive() {
		System.out.println("This is a Vehicle");
	}
}
class Car extends Veheicle
{
	void drive() {
		System.out.println("Repairing a Car");
	}
}

public class Vehicles 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Veheicle v = new Car();
		v.drive();

	}

}
