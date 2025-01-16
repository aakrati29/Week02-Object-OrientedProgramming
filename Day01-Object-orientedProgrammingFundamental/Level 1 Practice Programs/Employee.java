public class Employee{
	String name;
	int id;
	int salary;
	
	// Create a method to display details of employee
	public void displayDetails(){
		System.out.println("----------Employee Details----------");
		System.out.println("Name of employee " + name);
		System.out.println("ID of employee " + id);
		System.out.println("Salary of employee " + salary);
	}
	
	public static void main(String [] args){
		// Create object of Employee class
		Employee emp = new Employee();
		emp.name = "Ram";
		emp.id = 29;
		emp.salary = 50000;
		emp.displayDetails();
	}
}