package edu.tomer;

/**
 * Created by hackeru on 30/01/2017.
 */
public class Contact {
    String firstName;
    String lastName;
    String phone;

    public Contact() {
        this.firstName = IO.getString("Enter firstName:");
        this.lastName = IO.getString("Enter last Name:");
        this.phone = IO.getString("Enter Phone:");
    }

    void print() {
        System.out.println("Contact{" +
                "firstName='" + firstName + '\n' +
                ", lastName='" + lastName + '\n' +
                ", phone='" + phone + '\n' +
                '}');
    }


}
