package com.chaiwala.udemy;

public class Contact {
    private String fullName;
    private String mobileNumber;

    public Contact(String fullName, String mobileNumber) {
        this.fullName = fullName;
        this.mobileNumber = mobileNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setFullName(String newFullName) {
        if (newFullName.isBlank()) {
            System.out.println("Fullname cannot be blank.");
            return;
        }

        fullName = newFullName;
    }
}
