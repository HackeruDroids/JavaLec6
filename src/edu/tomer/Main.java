package edu.tomer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        //1) input 3 contacts:
        for (int i = 0; i < 3; i++) {
            //add 4 persons to the list
            people.add(new Person());
        }

        //display all the people:
        //size = size of the list (How many items)
        for (int i = 0; i < people.size(); i++) {
            //get an item by Index
            people.get(i).print();
        }
        //remove an item from the list:
        people.remove(2);
        System.out.println("___________________________");

        //display all the people:
        //size = size of the list (How many items)
        for (int i = 0; i < people.size(); i++) {
            //get an item by Index
            people.get(i).print();
        }

    }
}
