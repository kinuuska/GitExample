package com.company;

public class Main {

    public static void main(String[] args) {

 //ctrl+alt+l formatuje kod
//	Dog reksio = new Dog("Reksio");
//	reksio.setNumberOfLegs(3);
//	System.out.println(reksio.getNumberOfLegs());
//	//reksio.name = "Reksio"; jak nie było konstruktora było porzebne
//	reksio.bark();
//	Dog.sayHau();
//
//	Dicer kostki = new Dicer(3);
//	kostki.throwDices();

        Person Kinga = new Person("Kinga", "Zalewska", Gender.FEMALE);
        Person Kinga1 = new Person("Kinga", "Zalewska", Gender.FEMALE);
        System.out.println(Kinga.equals(Kinga1)); //

        //System.out.println(Kinga);
//        String a = new String("Java");
//        String b = new String("Java");
//        String c = "Java";
//        String d = "Java";
//
//        System.out.println(a ==b);
//        System.out.println(c ==d);


    }


}

