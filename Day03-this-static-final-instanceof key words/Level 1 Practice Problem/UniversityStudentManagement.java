class Student {
	static String universityName = "TIT college;
	String name;
	final int rollNumber;
	char grade;
	int totalStudents;
	
	Student(String name, char grade, int rollNumber){
		this.name = name;
		this.grade = grade;
		totalStudents++;
	}
	
	public static void displayTotalStudents(){
		System.out.println("Total students are : " + totalStudents);
	}
}
		
public class UniversityStudentManagement{

	public static void main(String [] args){
	Student s1 = new Student("Ram", 'A');
	Student s1 = new Student("Aakrati", 'B');
	
		Student.displayTotalStudents();
	
		if(s1 instanceof Student){
			System.out.println("s1 is instance of Student");
		}
		if(s2 instanceof Student){
			System.out.println("s2 is instance of Student");
		}
	}
}