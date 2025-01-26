package hospitalpatientmanagement;

import java.util.ArrayList;

public class OutPatient extends Patient implements MedicalRecord{
    private ArrayList<String> records = new ArrayList<>();
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public ArrayList<String> viewRecords() {
        return new ArrayList<>(records);
    }
}
