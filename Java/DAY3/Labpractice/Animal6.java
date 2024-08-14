package day3;

class Animals6
{
	void move() {
		System.out.println("Animal Movement");
	}
}
class Cheetah extends Animals6
{
	void move() {
		System.out.println("RUN...");
	}
}

public class Animal6 {
	public static void main(String[] args) {
		Animals6 ch = new Cheetah();
		ch.move();
	}
}
