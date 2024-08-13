package Gokul;

import java.util.*;

class Grade {
    int reg_no;
    String name;
    int[] marks = new int[5];
    int sum;
    int average;
    // Constructor
    Grade(int regno, String name) {
        this.reg_no = regno;
        this.name = name;
    }
    // Method calculate
    void calculate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        sum = 0;
        for (int i = 0; i < 5; i++) {
            marks[i] = in.nextInt();
            sum += marks[i];
        }
        System.out.println("Total marks: " + sum);
    }
    // Method average
    void Average() {
        average = sum / 5;
        System.out.println("Average marks: " + average);
    }
    void grade() {	
    	if(average > 90 && average <=100) {
    		System.out.println("A grade");
    	}
    	else if(average > 80 && average <=90) {
    		System.out.println("A grade");	
    	}
    	else if(average > 70 && average <=80) {
    		System.out.println("B grade");
    	}
    	else {
    		System.out.println("Fail");
    	}
    }
    // Method to display
    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Registration Number: " + reg_no);
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Total: " + sum);
        System.out.println("Average: " + average);
    }
}

public class Student {
    public static void main(String[] args) {
        Grade obj = new Grade(101, "Gokul");
        obj.calculate();
        obj.Average();
        obj.grade();
        obj.display();
        obj.grade();
    }
}