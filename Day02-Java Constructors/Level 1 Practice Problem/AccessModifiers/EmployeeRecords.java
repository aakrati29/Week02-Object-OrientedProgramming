class Employee {
    public int employeeID;         
    protected String department;   
    private double salary;         
	
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Create a method to get the current salary
    public double getSalary() {
        return salary;
    }

    // Create a method to set or modify the salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary
		
		else {
            System.out.println("Salary must be greater than zero.");
        }
    }

    // Create a method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department : " + department);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee {
    private String teamName; 
	
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary); 
        this.teamName = teamName;
    }

    // create a method to display manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details :");
        System.out.println("Employee ID : " + employeeID); 
        System.out.println("Department : " + department); 
        System.out.println("Team Name : " + teamName);
        System.out.println("Salary : " + getSalary()); 
    }
}

public class EmployeeRecords {

    public static void main(String[] args) {
	
        // Create an Employee object
        Employee employee1 = new Employee(101, "Finance", 55000.0);
        System.out.println("Employee Details :");
        employee1.displayEmployeeDetails();

        // Modify the salary
        System.out.println("\nUpdating Salary...");
        employee1.setSalary(50000.0);
        employee1.displayEmployeeDetails();

        // Create a Manager object
        Manager manager1 = new Manager(201, "IT", 75000.0, "Developer Team");
        System.out.println("\nManager Details :");
        manager1.displayManagerDetails();
    }
}
