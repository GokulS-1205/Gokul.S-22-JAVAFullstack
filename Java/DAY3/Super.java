package day3;

//Super Keyword in Java
/*
class A{
	int a = 10;
	A(String name){
		System.out.println("WELCOME " + name);
	}
	void myMethod1() {
		System.out.println("I am a super class method ");
	}
}
class B extends A {
	B() {
		super("Gokul");
	}
	void myMethod2() {
		System.out.println("Super class variable : " + super.a);
		super.myMethod1();
	}
}
public class Super {
	public static void main(String [] args) {
		B b = new B();
		b.myMethod2();
	}

}
*/

class A{

	A(){
		this(5);
		System.out.println("A ");
	}
	
	A(int a){
		super();
		System.out.println("A 1");
	}
//	void myMethod1() {
//		System.out.println("I am a super class method ");
//	}
}
class B extends A {
	B() {
		super(5);
		System.out.println("B");
	}
	
	B(int a){
		System.out.println("B 1");
	}
//	void myMethod2() {
//		System.out.println("Super class variable : " + super.a);
//		super.myMethod1();
//	}
}
public class Super {
	public static void main(String [] args) {
		B b = new B(5);
//		b.myMethod2();
	}

}
