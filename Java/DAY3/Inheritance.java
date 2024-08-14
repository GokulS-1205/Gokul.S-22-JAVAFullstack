package day3;
/*
 
 							SINGLE INHERITANCE
class Twowheeler{
	void noofWheeles() {
		System.out.println("I have Two wheels");
	}
}
 
class Bike extends Twowheeler{
	void brandName() {
		System.out.println("Brand Name is Honda");
	}
}
public class Inheritance {
	public static void main(String []args) {
		Bike bike = new Bike();
		bike.noofWheeles();
		bike.brandName();
	}
	
}
*/
						 //MULTILEVEL INHERITANCE
/*class vehicle {
	void noofEngine() {
		System.out.println("I have no Engine");
	}
}
class Twowheeler extends vehicle {
	void noofWheeles() {
		System.out.println("I have Two wheels");
	}
}
 
class Bike extends Twowheeler {
	void brandName() {
		System.out.println("Brand Name is Honda");
	}
}

public class Inheritance {
	public static void main(String []args) {
		Bike bike = new Bike();
		bike.noofEngine();
		bike.noofWheeles();
		bike.brandName();
	}
	
}*/

						//Hierarchical INHERITANCE

class vehicle {
	void noofEngine() {
		System.out.println("I have no Engine");
	}
}
class Twowheeler extends vehicle {
	void noofWheeles() {
		System.out.println("I have Two wheels");
	}
}
 //child 1
class Bike extends Twowheeler {
	void brandName() {
		System.out.println("Brand Name is Honda");
	}
}
//child 2
class Scooty extends Twowheeler {
	void brandName() {
		System.out.println("Brand Name is Activa");
	}
}
public class Inheritance {
	public static void main(String []args) {
		
		Bike bike = new Bike();
		bike.noofEngine();
		bike.noofWheeles();
		bike.brandName();
		
		Scooty scooty = new Scooty();
		scooty.noofEngine();
		scooty.noofWheeles();
		scooty.brandName();
	}
	
}

