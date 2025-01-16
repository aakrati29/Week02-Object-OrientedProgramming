class Student {
	String name;
	int rollnumber;
	int marks;
	
	// Initializing constructor
	Student(String name, int rollnumber, int marks){
		this.name = name;
		this.rollnumber = rollnumber;
		this. marks = marks;
	}
	
	// Create a method to calculate the grade of students
	public char calculateGrade(){
		if(this.marks >= 90){
			return 'A';
		}
		else if(this.marks >= 75){
			return 'B';
		}
		else if(this.marks >= 65){
			return 'C';
		}
		else if(this.marks >= 35){
			return 'D';
		}
		else{
		 return 'F';
		}
	}
		
		// Create a method to display the details of students
		public void displayDetailes(){
		System.out.println("----------Display result----------");
		System.out.println("Name of student : " + this.name);
		System.out.println("Roll number of student : " + this.rollnumber);
		System.out.println("Marks of student : " + this.marks);
		System.out.println("Grade of student : " + calculateGrade());
	}
}
	
public class StudentReport{
		public static void main(String [] args){
		Student student = new Student("Ram", 01, 85);
		System.out.println(student.calculateGrade());
		student.displayDetailes();
	}
}