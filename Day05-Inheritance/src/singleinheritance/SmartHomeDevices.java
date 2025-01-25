package singleinheritance;

class Device  {
    int deviceId ;
    String status;

    Device(int deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device{
    String temperatureSetting;

    Thermostat(int deviceId, String status, String temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }


    public void displayStatus(){
        System.out.println("---------Thermostat Details----------");
        System.out.println("Device ID : " + deviceId);
        System.out.println("Device Status : " + status);
        System.out.println("Temperature Setting : " + temperatureSetting);
    }
}

public class SmartHomeDevices{

    public static void main(String [] args){
        Thermostat t = new Thermostat(1245244, "running", "high");
        t.displayStatus();
    }
}
