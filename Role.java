package assignment_2;

class Employee{
	
	public String getRole() {
		return "Employee";
	}
}
class Manager extends Employee{
	public String getRole() {
		return "Manager";
	}
}
class Devloper extends Employee{
	public String getRole() {
		return "Devloper";
	}
}


public class Role {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		Employee emp2=new Devloper();
		Employee emp3=new Manager();
		
		System.out.println("Employee1 is: "+emp1.getRole());
		System.out.println("Employee2 is: "+emp2.getRole());
		System.out.println("Employee3 is: "+emp3.getRole());
	}

}
