package day3;

class Shape
{
	void getArea(float h,float w) {
		
		System.out.println("");
	}
}
class Rectangle extends Shape
{
	void getArea(float h,float w) {
		
		System.out.println("Area of Rectangle is : " + (h * w));
	}
}

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Rectangle();
		s.getArea(7,3.5f);

	}

}
