import java.util.*;

class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Create a method to display employee details
    public String toString() {
        return "Employee Name : " + name + ", Position : " + position;
    }
}

class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Create a method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Create a method to display department details
    public void displayDepartment() {
        System.out.println("Department : " + name);
        for (Employee employee : employees) {
            System.out.println("	" + employee);
        }
    }
}

class Company {
    private String name;
    private ArrayList<Department> departments;

    // Constructor to initialize company details
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display company details
    public void displayCompany() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.displayDepartment();
        }
    }
}

public class CompanyAndDepartments {

    public static void main(String[] args) {
   
        Company company = new Company("TechCorp");

        // Creating Department objects
        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Data Science");

        // Creating Employee objects and adding them to departments
        dept1.addEmployee(new Employee("Ram", "Research Scientist"));
        dept1.addEmployee(new Employee("Aakrati", "Data Analyst"));

        dept2.addEmployee(new Employee("Ankit", "HR Manager"));
        dept2.addEmployee(new Employee("Anand", "Recruiter"));

        // Adding departments to the company
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        // Displaying company details
        company.displayCompany();

        company = null;
        System.out.println("\nCompany and all associated departments and employees are deleted.");
    }
}
