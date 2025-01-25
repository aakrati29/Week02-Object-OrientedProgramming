package employeemanagement;

public class FullTimeEmployee extends Employee implements Department{
    private String department;
    FullTimeEmployee(int employeeId, String name, int baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public int calculateSalary() {
        return super.getBaseSalary();
    }


    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    public void getDepartmentDetails() {
        System.out.println("Department Name : " + department);
    }
}
