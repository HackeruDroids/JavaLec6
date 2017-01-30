package edu.tomer;

public class Main {

    public static void main(String[] args) {

        Person[] people = new Person[4];

        for (int i = 0; i < people.length; i++) {
           people[i] = new Person();
        }

        for (int i = 0; i < people.length; i++) {
            people[i].print();
        }



    }
}
