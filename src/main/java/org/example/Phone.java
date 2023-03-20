package org.example;

import java.util.ArrayList;
import java.util.List;

public class Phone implements Manufacturer {

    protected String manufacturerName;
    protected String manufactureAddress;
    protected String manufactureCountry;

    protected final int batteryLife;
    protected String color;
    protected String material;

    protected Phone(int batteryLife) {

        this.batteryLife = batteryLife;
    }

    List<Contact> contactList = new ArrayList<>();

    public void addContact(String s, String phoneNumber, String firstName, String lastName) {
        Contact contact = new Contact(s, phoneNumber, firstName, lastName, 24);
        contactList.add(contact);
        System.out.println(contactList);
    }

    public void getFirstContact() {

        for (int index = 0; index < contactList.size() - 1; index++) {
            System.out.println("First contact from the list is: " + contactList.get(0).firstName + " "
                    + contactList.get(0).lastName);
        }
    }

    public void getLastContact() {
        for (int index = 0; index < contactList.size() - 1; index++) {
            System.out.println("Last contact from the list is: " + contactList.get(contactList.size() - 1).firstName + " "
                    + contactList.get(contactList.size() - 1).lastName);
        }
    }

    public void verifyMessageLength(String messageContent) {
        if (messageContent.length() <= 500) {
            System.out.println("Your message has the right length");
        } else {
            System.out.println("Your message does not have the right length");
        }
    }

    List<String> messages = new ArrayList<>();

    public void sendMessage(String phoneNumber, String messageContent) {

        if (messageContent.length() <= 100) {

            System.out.println("Phone number: " + phoneNumber + " sent the message: " +
                    "\n" + messageContent);
            messages.add(messageContent);

        } else {
            System.out.println("Please enter maximum 100 chars!" + "\n");
        }
        System.out.println(messages);
        return;
    }

    public void getFirstMessage(String phoneNumber) {
        for (int index = 0; index < messages.size() - 1; index++) {
            System.out.println("First message from the list is: " + messages.get(0) + "\n");
        }

    }

    public void getSecondMessage(String phoneNumber) {
        for (int index = 0; index < messages.size() - 1; index++) {
            System.out.println("First message from the list is: " + messages.get(1) + "\n");
        }

        // public void call(String secondPhoneNumber) {
    }

    // public void viewHistory() {


}




