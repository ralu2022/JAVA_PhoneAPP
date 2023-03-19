package org.example;

public class Contact extends Phone {

    public String s;
    public String phoneNumber;
    public String firstName;
    public String lastName;


    public Contact(String s, String phoneNumber, String firstName, String lastName, int batteryLife) {
        super(batteryLife);
        this.s =s;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "Contact data is: " + "\n" + "-s: " + s + "\n" + "-phone number: " + phoneNumber + "\n"
                + "-first name: " + firstName + "\n" + "-last name: " + lastName + "\n";
    }
}
