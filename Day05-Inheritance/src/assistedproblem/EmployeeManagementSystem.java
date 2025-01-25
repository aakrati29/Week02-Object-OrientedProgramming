package assistedproblem;

class Employee {
    String name;
    int id;
    int salary;

    Employee(){}

    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Print Nothing");
    }
}

class Manager extends Employee{
    int teamSize;

    Manager(String name, int id, int salary, int teamSize){
        super(name,id,salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails(){
        System.out.println("-------Manager Details--------");
        System.out.println("Manager name : " + name);
        System.out.println("Manager id : " + id);
        System.out.println("Manager salary : " + salary);
        System.out.println("Team size : " + teamSize);
    }
}

class Developer extends Employee{
    String programmingLanguage;

    Developer(String name, int id, int salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails(){
        System.out.println("-------Developer Details--------");
        System.out.println("Developer name : " + name);
        System.out.println("Developer id : " + id);
        System.out.println("Developer salary : " + salary);
        System.out.println("Programming language : " + programmingLanguage);
    }
}

class Intern extends Employee{
    Intern(String name, int id, int salary){
        super(name, id, salary);
    }

    @Override
    public void displayDetails(){
        System.out.println("-------Intern Details--------");
        System.out.println("Intern name : " + name);
        System.out.println("Intern id : " + id);
        System.out.println("Intern salary : " + salary);
    }
}

public class EmployeeManagementSystem{

    public static void main(String [] args){
        Employee emp = new Employee();
        emp.displayDetails();

        Manager m = new Manager("Ram", 01, 100000, 06);
        m.displayDetails();

        Developer d = new Developer("Ankit", 9, 80000, "Java");
        d.displayDetails();

        Intern i = new Intern("Aakrati", 29, 60000);
        i.displayDetails();
    }
}
