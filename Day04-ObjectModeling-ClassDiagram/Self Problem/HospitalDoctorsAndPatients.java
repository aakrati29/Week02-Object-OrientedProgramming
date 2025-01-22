import java.util.ArrayList;

class Patient {
    private String name;
    private ArrayList<Doctor> consultedDoctors;

    public Patient(String name) {
        this.name = name;
        this.consultedDoctors = new ArrayList<>();
    }

    // Create a method to add a doctor to the patient's consulted list
    public void addDoctor(Doctor doctor) {
        if (!consultedDoctors.contains(doctor)) {
            consultedDoctors.add(doctor);
        }
    }

    // Create a method to display the doctors the patient has consulted
    public void displayConsultedDoctors() {
        System.out.println("Patient: " + name);
        System.out.println("Consulted Doctors:");
		
        for (Doctor doctor : consultedDoctors) {
            System.out.println("  " + doctor.getName());
        }
    }

    // Get patient name
    public String getName() {
        return name;
    }
}

// Doctor class
class Doctor {
    private String name;
    private ArrayList<Patient> patients;

    // Constructor to initialize doctor details
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    // Create a method to consult a patient (establishes a two-way association)
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Add the doctor to the patient's list
        }
        System.out.println("Consultation: Dr. " + name + " is consulting patient " + patient.getName());
    }

    // Create a method to display the patients the doctor has consulted
    public void displayConsultedPatients() {
        System.out.println("Doctor: " + name);
        System.out.println("Consulted Patients:");
        for (Patient patient : patients) {
            System.out.println("  " + patient.getName());
        }
    }

    // Get doctor name
    public String getName() {
        return name;
    }
}

class Hospital {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    // Constructor to initialize hospital details
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Create a method to add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Create a method to add a patient to the hospital
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    // Display hospital details
    public void displayDetails() {
        System.out.println("Hospital : " + name);
        System.out.println("Doctors :");
        for (Doctor doctor : doctors) {
            System.out.println("  " + doctor.getName());
        }
        System.out.println("Patients :");
        for (Patient patient : patients) {
            System.out.println("  " + patient.getName());
        }
    }
}

public class HospitalDoctorsAndPatients{

    public static void main(String[] args) {

        Hospital hospital = new Hospital("Bansal Hospital");

        // Create Doctor objects
        Doctor d1 = new Doctor("Smith");
        Doctor d2 = new Doctor("Johnson");

        // Create Patient objects
        Patient p1 = new Patient("Aakrati");
        Patient p2 = new Patient("Ram");
        Patient p3 = new Patient("Aashu");

        // Add doctors and patients to the hospital
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);
        hospital.addPatient(p3);

        // Establish consultations (association)
        d1.consult(p1); 
        d1.consult(p2); 
        d2.consult(p2); 
        d2.consult(p3); 

        // Display hospital details
        hospital.displayDetails();

        // Display consultations for each doctor
        d1.displayConsultedPatients();
        d2.displayConsultedPatients();

        // Display consultations for each patient
        p1.displayConsultedDoctors();
        p2.displayConsultedDoctors();
        p3.displayConsultedDoctors();
    }
}
