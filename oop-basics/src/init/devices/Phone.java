package init.devices;

import java.util.Arrays;

public class Phone {

    private String phoneNumber;
    private String model;
    private double weight;

    public Phone() {

    }

    public Phone(String phoneNumber, String model, double weight) {
        this.phoneNumber = phoneNumber;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String phoneNumber, String model) {
        this.phoneNumber = phoneNumber;
        this.model = model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Hey it's " + name + "  is calling");
    }

    public void receiveCall(String name, String phoneNumber) {
        System.out.println("Hey it's " + name + "  is calling " + phoneNumber);
    }

    public void sendMessage(String ... phoneNumber) {
        System.out.println(Arrays.toString(phoneNumber));
    }
}
