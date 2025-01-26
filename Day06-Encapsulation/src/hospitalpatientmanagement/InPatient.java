package hospitalpatientmanagement;

import java.util.ArrayList;

public class InPatient extends Patient implements MedicalRecord{
    private ArrayList<String> records = new ArrayList<>();
    private double dailyRate;
    private int daysAdmitted;

    public InPatient(int patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;
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
