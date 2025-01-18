class Course{
	String courseName;
	int duration;
	double fees;
	static String instituteName = "BridgeLab";
	
	Course(String courseName, int duration, double fees){
		this.courseName = courseName;
		this.duration = duration;
		this. fees = fees;
	}
	
	// Create a method to display details
	public void displayProductDetails() {
        System.out.println("Course Name : " + this.courseName);
        System.out.println("Duration : " + this.duration);
		System.out.println("Fees : " + this.fees);
    } 
	
	public static void updateInstituteName(String newInstituteName){
		instituteName = newInstituteName;
	}
}
		
public class  OnlineCourseManagement{
	public static void main(String [] args){
	Course course1 = new Course("Java Programming", 6, 6000.0);
	Course course2 = new Course("Java FullStack Developer", 12, 12000.0);
	
	course1.displayProductDetails();
	course2.displayProductDetails();
	
	Course.updateInstituteName("Capgemini");
	
	course1.displayProductDetails();
	course2.displayProductDetails();
	
	}
}
