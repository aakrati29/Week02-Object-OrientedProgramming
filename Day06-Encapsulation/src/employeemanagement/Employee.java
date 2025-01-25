package employeemanagement;

public abstract class Employee {
    private int employeeId;
    private String name;
    private int baseSalary;

    Employee(int employeeId, String name, int baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }

    public abstract int calculateSalary();

    void displayDetails(){
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee name : " + name);
        System.out.println("Employee base salary : " + baseSalary);
    }
}
