package day3;

class Employee
{
	void work() {
		System.out.println("Data Analystics");
	}
	void getSalary() {
		System.out.println("Salary : 40000");
	}
}
class HRManager extends Employee
{
	void work() {
		System.out.println("Assiging the work");
	}
	void addEmployee() {
		System.out.println("Adding the new Employee");
	}
}

public class Employees {
	public static void main(String []args) {
//		Employee e = new Employee();
		HRManager hr = new HRManager();
//		e.work();
//		e.getSalary();
		hr.work();
		hr.addEmployee();
	}

}
