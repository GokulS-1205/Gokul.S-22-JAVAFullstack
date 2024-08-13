package Gokul;

//Method Overloading in JAVA

public class Overload {
	void myMethod(String name) {
		System.out.println("welcome " + name);
		
	}
	void myMethod(int a,int b) {
		System.out.println("sum : "+ (a + b));
		
	}
	void myMethod(int n) {
		System.out.println("sum : " + (n + n));
		
	}
	public static void main(String[] args) {
		Overload obj = new Overload();
		obj.myMethod(5);
		obj.myMethod("Gokul");
		obj.myMethod(10, 20);
	}
	
}
