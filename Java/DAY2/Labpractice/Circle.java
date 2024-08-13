package Gokul;

public class Circle 
{
	float Radius;
	float pi = 3.14f;
	
	Circle(float Radius)
	{
		this.Radius = Radius;
		
	}
	void Calculate() {
		System.out.println("Area of Circle : " + (this.Radius*this.Radius*pi));
		System.out.println("Circumference of Circle : " + 2*(this.Radius*pi));
	}
	public static void main(String []args) 
	{
		
		Circle c1 = new Circle(7);
		c1.Calculate();
	}
}
