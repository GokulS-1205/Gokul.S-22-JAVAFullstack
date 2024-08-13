package Gokul;

public class Rectangle 
{
	float Height;
	float Width;
	
	Rectangle(float Height , float Width){
		this.Height = Height;
		this.Width = Width;
		
	}
	void Calculate() 
	{
		System.out.println("Area of Rectangle : " + (this.Height*this.Width));
		System.out.println("Perimeter of Rectangle : "+ 2*(this.Height+this.Width));
	}

	public static void main(String []arfg) 
	{
		
		Rectangle r1 = new Rectangle(5,10);
		r1.Calculate();
	}

}
