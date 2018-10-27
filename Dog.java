package com.company;

public class Dog {
    String name;
    private int numberOfLegs = 4; //można tutaj zrobić =4 lub konstruktorem
//jest public, private, protected, nic

    //public Dog(int numberOfLegs) {
    //    this.numberOfLegs = numberOfLegs;
    //}

    public Dog(String name) { //generuje konstrukcję
        //this();
        this.name = name;
    }

    public void bark() {
        System.out.println("huahua");
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public static void sayHau() { //nie Reksio a Dog
        System.out.println("hau");

    }
}
