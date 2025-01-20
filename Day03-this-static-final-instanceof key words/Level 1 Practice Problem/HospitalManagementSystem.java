class Patient {
	static String hospitalName  = "Bansal Hospital;
	String name;
	int age;
	int aliment;
	final int patientID;
	int totalPatients;
	
	Patient(String name, String age, int aliment){
		this.name = name;
		this.age = age;
		this.aliment = aliment;
		totalPatients++;
	}
	
	public static void getTotalPatients(){
		System.out.println("Total patient : " + totalPatients);
	}
}
		
public class HospitalManagementSystem{

	public static void main(String [] args){
	Patient p1 = new Patient("Ram", 21, 2);
	Patient p2 = new Patient("Aakrati", 20, 1);
	
		Patient.getTotalPatients();
	
		if(p1 instanceof Patient){
			System.out.println("p1 is instance of Patient");
		}
		if(p2 instanceof Patient){
			System.out.println("p2 is instance of Patient");
		}
	}
}