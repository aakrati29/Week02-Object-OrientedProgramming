import java.util.ArrayList;

class Faculty {
    private String name;

    // Constructor to initialize faculty details
    public Faculty(String name) {
        this.name = name;
    }

    // Create a method to display faculty details
    public String toString() {
        return "Faculty Name: " + name;
    }
}

class Department {
    private String name;
    private ArrayList<Faculty> faculties;

    // Constructor to initialize department details
    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    // Create a method to add a faculty to the department
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Create a method to display department details
    public void displayDepartment() {
        System.out.println("Department: " + name);
        for (Faculty faculty : faculties) {
            System.out.println("  " + faculty);
        }
    }
}

class University {
    private String name;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Create a method to add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Create a method to add a faculty to the university (aggregation)
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Create a method to display university details
    public void displayUniversity() {
        System.out.println("University: " + name);
        System.out.println("Departments :");
		
        for (Department department : departments) {
            department.displayDepartment();
        }
        System.out.println("Independent Faculty Members :");
        for (Faculty faculty : faculties) {
            System.out.println("	" + faculty);
        }
    }

    // Deleting the university
    public void deleteUniversity() {
        System.out.println("\nDeleting University: " + name);
		
		// Removes all departments
        departments.clear(); 
		
		// Faculties still exist outside the university
        faculties.clear(); 
        System.out.println("All departments removed, but faculty members can still exist independently.");
    }
}

public class UniversityFacultyAndDepartments {

    public static void main(String[] args) {

        University university = new University("Global Tech University");

        // Creating Faculty objects
        Faculty faculty1 = new Faculty("Prof. Ankit");
        Faculty faculty2 = new Faculty("Prof. Aakrati");
        Faculty faculty3 = new Faculty("Dr. Shubhi");

        // Adding faculties directly to the university (aggregation)
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Creating Department objects
        Department csDept = new Department("Computer Science");
        Department bioDept = new Department("Biology");

        // Adding faculty to departments
        csDept.addFaculty(faculty1); 
        csDept.addFaculty(faculty3); 
        bioDept.addFaculty(faculty2);

        // Adding departments to the university (composition)
        university.addDepartment(csDept);
        university.addDepartment(bioDept);

        // Displaying university details
        university.displayUniversity();

        // Deleting the university
        university.deleteUniversity();
    }
}
