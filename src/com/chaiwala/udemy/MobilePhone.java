package com.chaiwala.udemy;

import java.util.ArrayList;
import java.util.UUID;

public class MobilePhone {

    private final int phoneID = (int) (Math.random() * (13));
    private final UUID uid = UUID.randomUUID();
    private ArrayList<Contact> contacts;

    public MobilePhone() {
        System.out.println("New phone instance created.");
        System.out.println("\tPhone ID: " + phoneID);
        System.out.println("\tUUID: " + uid);
        contacts = new ArrayList<Contact>();
    }

    public int getContactsCount() {
        if (contacts == null) {
            contacts = new ArrayList<Contact>();
        }
        return contacts.size();
    }

    public void addContact(String fullName, String mobileNumber) {
        if (contacts == null) {
            contacts = new ArrayList<Contact>();
        }

        if (getContact(fullName) != null) {
            System.out.println("Contact already exists.");
            return;
        }

        contacts.add(new Contact(fullName, mobileNumber));
    }

    public Contact getContact(String fullName) {
        for (Contact c : contacts) {
            if (c.getFullName().equals(fullName)) {
                return c;
            }
        }

        return null;
    }

    public void removeContact(String fullName) {
        for (Contact c : contacts) {
            if (c.getFullName().equals(fullName)) {
                contacts.remove(c);
                break;
            }
        }
    }

    public void updateContactName(String oldFullName, String newFullName) {
        if (getContact(newFullName) != null) {
            System.out.println("Updated name for contact already in use.");
            return;
        }

        for (Contact c : contacts) {
            if (c.getFullName().equals(oldFullName)) {
                c.setFullName(newFullName);
                return;
            }
        }

        System.out.println("Contact not found.");
    }

    public void printContactList() {
        int counter = 1;
        for (Contact c : contacts) {
            System.out.print(counter++ + ". ");
            System.out.println(c.getFullName() + " - " + c.getMobileNumber());
        }
        System.out.println("Total contacts: " + contacts.size());
    }
}
