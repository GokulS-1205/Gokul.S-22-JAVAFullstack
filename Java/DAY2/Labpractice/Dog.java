package Gokul;

public class Dog 
{
	
	String Name;
	String Breed;
	
	Dog(String Name,String Breed)
	{
		this.Name = Name;
		this.Breed = Breed;
	}
	void display() 
	{
		System.out.println("DOG Name: " + this.Name);
		System.out.println("DOG Breed: " + this.Breed);
	}
	void setname(String Name,String Breed) 
	{
		this.Name = Name;
		this.Breed = Breed;
		this.display();
	}
	public static void main(String []args) 
	{
		
		Dog d1 = new Dog("Raja","Great Dane");
		Dog d2 = new Dog("Timmy","Samoyed");
		d1.display();
		d2.display();
		
		d1.setname("Cheems","Shiba Inu");
		d2.setname("bd", "hgf");
	}

}
