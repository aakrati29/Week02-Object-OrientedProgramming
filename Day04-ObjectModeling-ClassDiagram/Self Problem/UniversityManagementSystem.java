import java.util.ArrayList;

class Course {
    private String courseName;
    private Professor professor;
    private ArrayList<Student> enrolledStudents;

    // Constructor to initialize course details
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Assigning a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " is assigned to course: " + courseName);
    }

    // Enrolling a student in the course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this); // Add course to the student's list
            System.out.println(student.getName() + " enrolled in course: " + courseName);
        }
    }

    // Displaying course details
    public void displayCourseDetails() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "None assigned"));
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("	" + student.getName());
        }
    }

    // Get course name
    public String getCourseName() {
        return courseName;
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

    // Add a course to the student's list
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    // Displaying the enrolled courses
    public void displayEnrolledCourses() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled Courses :");
        for (Course course : courses) {
            System.out.println("	" + course.getCourseName());
        }
    }

    // Get student name
    public String getName() {
        return name;
    }
}

class Professor {
    private String name;
    private ArrayList<Course> assignedCourses;

    // Constructor to initialize professor details
    public Professor(String name) {
        this.name = name;
        this.assignedCourses = new ArrayList<>();
    }

    // Assigning a course to the professor
    public void assignCourse(Course course) {
        if (!assignedCourses.contains(course)) {
            assignedCourses.add(course);
            course.assignProfessor(this); // Assign professor to the course
        }
    }

    // Displaying the assigned courses
    public void displayAssignedCourses() {
        System.out.println("Professor: " + name);
        System.out.println("Assigned Courses:");
        for (Course course : assignedCourses) {
            System.out.println("  " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}


public class UniversityManagementSystem {

    public static void main(String[] args) {
   
        Professor professor1 = new Professor("Dr. Ram");
        Professor professor2 = new Professor("Dr. Aashu");

		// Object for Student
        Student s1 = new Student("Aakrati");
        Student s2 = new Student("Ankit");
        Student s3 = new Student("Anand");

		// Object for Course
        Course c1 = new Course("Computer Science 101");
        Course c2 = new Course("Mathematics 201");
        Course c3 = new Course("Physics 301");

        // Assign professors to courses
        professor1.assignCourse(c1);
        professor2.assignCourse(c2);
        professor2.assignCourse(c3);

        // Enroll students in courses
        c1.enrollStudent(s1); 
        c1.enrollStudent(s2); 
        c2.enrollStudent(s2); 
        c3.enrollStudent(s3); 

        // Display course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();

        // Display student enrolled courses
        s1.displayEnrolledCourses();
        s2.displayEnrolledCourses();
        s3.displayEnrolledCourses();

        // Display professor assigned courses
        professor1.displayAssignedCourses();
        professor2.displayAssignedCourses();
    }
}
