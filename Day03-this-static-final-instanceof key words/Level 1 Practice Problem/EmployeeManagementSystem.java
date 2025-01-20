class Employee {
	String companyName = "Capgemini";
	String name;
	final int id;
	String designation;
	static int totalEmployee;
	
	Employee(String name, int id, String designation){
		this.name = name;
		this.id = id;
		this.designation = designation;
		totalEmployee++;
	}
	
	public static void displayTotalEmployees(){
		System.out.println("Total employee is : " + totalEmployee);
	}
}

public class EmployeeManagementSystem{
	public static void main(String [] args){
	Employee emp1 = new Employee("Ram", 01, "Manager");
	Employee emp2 = new Employee("Aakrati", 29, "HR");
	
		Employee.displayTotalEmployees();
	
		if(emp1 instanceof Employee){
			System.out.println("emp1 is instance of Employee");
		}
		if(emp2 instanceof Employee){
			System.out.println("emp2 is instance of Employee");
		}
	}
}