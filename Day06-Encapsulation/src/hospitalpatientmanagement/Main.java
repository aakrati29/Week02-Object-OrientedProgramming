package hospitalpatientmanagement;

public class Main {
    public static void main(String[] args) {
        Patient inPatient = new InPatient(101, "Alice", 30, 2000, 5);
        Patient outPatient = new OutPatient(201, "Bob", 25, 500);

        // Adding and viewing medical records
        MedicalRecord inPatientRecord = (InPatient) inPatient;
        inPatientRecord.addRecord("Admitted for surgery");
        inPatientRecord.addRecord("Prescribed painkillers");

        MedicalRecord outPatientRecord = (OutPatient) outPatient;
        outPatientRecord.addRecord("Consulted for flu symptoms");
        outPatientRecord.addRecord("Prescribed antiviral medication");

        // Displaying Patient Details and Bills
        System.out.println(inPatient.getPatientDetails());
        System.out.println("Bill: " + inPatient.calculateBill());
        System.out.println("Medical Records: " + inPatientRecord.viewRecords());

        System.out.println("\n" + outPatient.getPatientDetails());
        System.out.println("Bill: " + outPatient.calculateBill());
        System.out.println("Medical Records: " + outPatientRecord.viewRecords());
    }
}
