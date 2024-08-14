	package day3;
	
	class Animals {
		void makeSound() {
			System.out.println("This is a animal");
		}
	}
		class Cat extends Animals {
	
			void makeSound() {
				System.out.println("Cat Sounds Meow");
			}
		}
		public class Animal{
		public static void main(String []args) {
			Animals c = new Cat();
			c.makeSound();
		}
	
	}
