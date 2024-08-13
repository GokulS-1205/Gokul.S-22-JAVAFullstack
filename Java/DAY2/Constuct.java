package Gokul;

//Constructor Overloading in JAVA

/*public class Constuct {
	
	Constuct(String name){
		System.out.println("Wlcome " + name);
	}
	Constuct(int a,int b){
		System.out.println("sum : " + (a+b));
	}
	
	Constuct(int n){
		System.out.println("sum : " + (n+n));
	}
	public static void main(String[] args) {
		Constuct obj1 = new Constuct("Gokul");
		Constuct obj2 = new Constuct(10,20);
		Constuct obj3 = new Constuct(5);
	}

}
*/

public class Constuct {
	
	Constuct(String name){
		System.out.println("Wlcome " + name);
	}
	Constuct(int a,int b){
		this("Gokul");
		System.out.println("sum : " + (a+b));
	}
	
	Constuct(int n){
		this(10,20);
		System.out.println("sum : " + (n+n));
	}
	public static void main(String[] args) {
		Constuct obj3 = new Constuct(5);
	
	}

}