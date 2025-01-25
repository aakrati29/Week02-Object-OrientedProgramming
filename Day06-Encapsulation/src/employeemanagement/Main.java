package employeemanagement;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------Full-Time-Employee------------------");

        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Aakrati", 40000);
        emp1.assignDepartment("IT");
        emp1.displayDetails();
        emp1.getDepartmentDetails();
        System.out.println("Total Salary is : " + emp1.calculateSalary());

        System.out.println("----------------Part-Time-Employee------------------");

        PartTimeEmployee emp2 = new PartTimeEmployee(102,"Ankit", 0, 15, 8000);
        emp2.assignDepartment("Computer Science");
        emp2.displayDetails();
        emp2.getDepartmentDetails();
        System.out.println("The total salary is : " + emp2.calculateSalary());


    }
}
