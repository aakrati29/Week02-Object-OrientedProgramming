package employeemanagement;

public class PartTimeEmployee extends Employee implements Department{
    private String department;
    int numberOfDays;
    int perDaySalary;
    PartTimeEmployee(int employeeId, String name, int baseSalary, int numberOfDays, int perDaySalary) {
        super(employeeId, name, baseSalary);
        this.numberOfDays = numberOfDays;
        this.perDaySalary = perDaySalary;
    }

    @Override
    public int calculateSalary() {
        return numberOfDays * perDaySalary;
    }


    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department Name : " + department);
    }
}
