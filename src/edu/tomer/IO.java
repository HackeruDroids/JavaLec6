package edu.tomer;

import java.util.Scanner;

/**
 * Created by hackeru on 30/01/2017.
 */
public class IO {

    static String getString(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.next();
    }

    static int getInt(String message){
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
