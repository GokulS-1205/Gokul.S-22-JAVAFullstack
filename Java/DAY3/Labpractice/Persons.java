package day3;

class Person{
void getFirstName(String Name)
{
	System.out.println("Employee Name : " +Name);
}
void lastFirstName(String Name)
{
	System.out.println("Employee Role : " +Name);
}

}
class Employe extends Person
{
void EmployeeId(int id)
{
	System.out.println("Employee Id : " +id);
}
void lastFirstName(String Name)
{
	super.getFirstName("Gokul");
	EmployeeId(101);
	System.out.println("Employee Role : " +Name);
}
}


public class Persons {
	public static void main(String[] args) {
	Person emp = new Employe();
		
		emp.lastFirstName("Full Stack Developer");
	}
}
