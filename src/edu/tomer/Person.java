package edu.tomer;

/**
 * Created by hackeru on 30/01/2017.
 */
public class Person {
    //properties:
    String firstName;
    String lastName;
    int age;


    //The full constructor
   //alt + insert //(OSx cmd + N)
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //The default constructor
    Person(){
        firstName = IO.getString("Enter the person name:");
        this.lastName = IO.getString("Enter the last Name:");
        this.age = IO.getInt("Enter the age:");
    }

    //actions / methods:
    void print() {
        System.out.printf("First Name: %s\n" +
                        "Last Name: %s\n" +
                        "Age: %3d\n",
                firstName, lastName, age);
    }

    void howOldAreYou() {
        System.out.println("Age: " + age);
    }

    void growByOneYear() {
        age++;
    }
}
