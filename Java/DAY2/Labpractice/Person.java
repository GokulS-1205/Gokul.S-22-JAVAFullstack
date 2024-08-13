package Gokul;

class Detail 
{
	String Pname;
	int P_age;
	
	Detail(String Name,int Age)
	{
		this.Pname = Name;
		this.P_age = Age;
	}
	
	void display() 
	{
		System.out.println("Person Name: " + this.Pname);
		System.out.println("Person Age : " + this.P_age);
	}
}

public class Person 
{
	public static void main(String []args) 
	{
		Detail p1 = new Detail("Gokul" ,201);
		p1.display();
		
		Detail p2 = new Detail("Deepak" ,202);
		p2.display();
	}
}
