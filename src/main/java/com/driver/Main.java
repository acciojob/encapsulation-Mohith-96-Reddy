package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        // obj.name = "John"; // this will give an error as name is private

        // Uncomment the below line to see the error
        // System.out.println(obj.name);

        obj.setName("John");
        System.out.println(obj.getName()); // This will print "John"
    }
}
