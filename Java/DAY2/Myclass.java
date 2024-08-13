package Gokul;

//Types of Variables in Java

public class Myclass {
	int b = 20; //instance or object variable 
	static int c = 30; //Static or Class Variable
	
	public static void main(String[] args) {
		int a = 10;//Local Variables
		System.out.println("Local Variaable :" + a);
		
		Myclass obj = new Myclass();
		System.out.println(obj.b);
		
		System.out.println(Myclass.c);
	}
	
}
