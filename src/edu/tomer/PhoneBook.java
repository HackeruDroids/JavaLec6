package edu.tomer;

import java.util.ArrayList;

/**
 * Created by hackeru on 30/01/2017.
 */
public class PhoneBook {
    ArrayList<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    void addContact() {
        contacts.add(new Contact());
    }

    void showAll() {
        for (int i = 0; i < contacts.size(); i++) {
            contacts.get(i).print();
        }
    }

    void showContactByIndex(int i) {
        contacts.get(i).print();
    }
}
