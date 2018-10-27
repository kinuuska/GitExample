package com.company;

public class Person {
    private String name;
    private String surname;
    private Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    @Override //to jest adnotacja
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        Person otherPerson = (Person) other;
        return this.name.equals(otherPerson.name) &&
                this.surname.equals(otherPerson.surname) &&
                this.gender == otherPerson.gender;
    }
}

