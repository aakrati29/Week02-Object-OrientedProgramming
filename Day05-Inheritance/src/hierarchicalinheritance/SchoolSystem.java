package hierarchicalinheritance;

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String displayRole(){
        return "Name : " + name + ", Age : " + age;
    }
}

class Teacher extends Person{
    String subject;

    Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    @Override
    public String displayRole(){
        return super.displayRole() + ", Subject : " + subject;
    }
}

class Student extends Person{
    char grade;

    Student(String name, int age, char grade){
        super(name, age);
        this.grade = grade;
    }

    @Override
    public String displayRole(){
        return super.displayRole() + ", Grade : " + grade;
    }
}

class Staff extends Person{
    int member;

    Staff(String name, int age, int member){
        super(name, age);
        this.member = member;
    }

    @Override
    public String displayRole(){
        return super.displayRole() + ", Memebers : " + member;
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Person person = new Person("Ram", 20);
        System.out.println("----------Person------------");
        System.out.println(person.displayRole());

        Teacher teacher = new Teacher("Ankit", 22, "Mathematics");
        System.out.println("-----------Teachers Details------------");
        System.out.println(teacher.displayRole());

        Student student = new Student("Aakrati", 21, 'A');
        System.out.println("------------Students Details------------");
        System.out.println(student.displayRole());

        Staff staff = new Staff("StaffOne", 30, 10);
        System.out.println("------------Staff Details-------------");
        System.out.println(staff.displayRole());

    }
}

