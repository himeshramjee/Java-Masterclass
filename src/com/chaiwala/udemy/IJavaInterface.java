package com.chaiwala.udemy;

public interface IJavaInterface {

    String name = null;

    void getName();

    default String concatenateName(String n) {
        return name == null ? n : name.concat(n);
    }

    private void sayName() {
        System.out.println("Name is: " + name);
    }
}
