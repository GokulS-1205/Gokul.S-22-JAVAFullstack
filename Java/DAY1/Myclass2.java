import java.util.Scanner;

public class Myclass2{
     public static void main(String[]args){
	  int employeeId;
	  String employeeName;
	  float employeeSalary;

	  Scanner in = new Scanner(System.in);

	   System.out.println("Enter employee id"); 
	   employeeId = in.nextInt();
   	   System.out.println("Enter employee name");
	   employeeName = in.next();
	   System.out.println("Enter employee salary");
	   employeeSalary  = in.nextFloat();

	   System.out.println("Employee id : " + employeeId);
	   System.out.println("Employee name : " + employeeName);
	  System.out.println("Employee salary : " + employeeSalary);
	}
}	