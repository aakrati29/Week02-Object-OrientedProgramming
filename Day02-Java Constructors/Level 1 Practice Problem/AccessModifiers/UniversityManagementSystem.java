class Student {
    public int rollNumber;         
    protected String name;         
    private double CGPA;  

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } 
		
		else {
            System.out.println("Invalid CGPA. Please provide a value between 0.0 and 10.0.");
        }
    }

    // Create a method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name : " + name);
        System.out.println("CGPA : " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {

    private String PGStudents;

    // Constructor to initialize rollNumber, name, CGPA, and PGStudents
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String PGStudents) {
		
		// Call superclass constructor
        super(rollNumber, name, CGPA); 
        this.PGStudents = PGStudents;
    }

    // Create a method to display postgraduate student details
    public void displayPostgraduateDetails() {
        displayStudentDetails(); 
        System.out.println("Thesis Topic: " + PGStudents);
    }
}

public class UniversityManagementSystem {

    public static void main(String[] args) {
	
        // Create a Student object of Student class
        Student student1 = new Student(101, "Alice", 8.5);
        student1.displayStudentDetails();

        // Access and modify CGPA using public methods
        System.out.println("Modifying CGPA...");
        student1.setCGPA(9.0);
        student1.displayStudentDetails();

        // Create a Student object of PostgraduateStudent class
        PostgraduateStudent pgStudent1 = new PostgraduateStudent(01, "Aakrati", 9.2, "Artificial Intelligence");
        System.out.println("\nPostgraduate Student Details:");
        pgStudent1.displayPostgraduateDetails();
    }
}
