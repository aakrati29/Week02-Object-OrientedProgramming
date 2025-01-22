import java.util.ArrayList;

class Course {
    private String name;
    private ArrayList<Student> enrolledStudents;

    // Constructor to initialize course details
    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    // Create a method to enroll a student in the course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this); // Associate course with student
        }
    }

    // Create a method to display students enrolled in the course
    public void displayEnrolledStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student student : enrolledStudents) {
            System.out.println("  " + student.getName());
        }
    }

    // Get course name
    public String getName() {
        return name;
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses;

    // Constructor to initialize student details
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Create a method to add a course (called internally by Course class)
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    // Create a method to view enrolled courses
    public void viewEnrolledCourses() {
        System.out.println("Courses for Student: " + name);
        for (Course course : courses) {
            System.out.println("  " + course.getName());
        }
    }

    // Get student name
    public String getName() {
        return name;
    }
}

class School {
    private String name;
    private ArrayList<Student> students;

    // Constructor to initialize school details
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Create a method to add a student to the school
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Create a method to display all students in the school
    public void displayStudents() {
        System.out.println("Students in School: " + name);
        for (Student student : students) {
            System.out.println("  " + student.getName());
        }
    }
}

public class SchoolAndStudentsCourse{

    public static void main(String[] args) {
   
        School school = new School("Green Valley High");

        // Creating Student objects
        Student s1 = new Student("Aakrati");
        Student s2 = new Student("Ram");
        Student s3 = new Student("Ankit");

        // Creating Course objects
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course history = new Course("History");

        // Adding students to the school (Aggregation)
        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);

        // Enrolling students in courses (Association)
        math.enrollStudent(s1);
        math.enrollStudent(s2);
        science.enrollStudent(s1);
        science.enrollStudent(s3);
        history.enrollStudent(s2);

        // Displaying school students
        school.displayStudents();

        // Viewing courses for each student
        s1.viewEnrolledCourses();
        s2.viewEnrolledCourses();
        s3.viewEnrolledCourses();

        // Viewing students enrolled in each course
        math.displayEnrolledStudents();
        science.displayEnrolledStudents();
        history.displayEnrolledStudents();
    }
}
