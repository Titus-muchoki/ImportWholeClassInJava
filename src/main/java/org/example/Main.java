package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String Instagram;
        int Password;
        System.out.println("");
        System.out.println("***************************");
        System.out.println("Enter your Instagram credentials");
        Instagram = myObj.nextLine();
        System.out.println("");
        System.out.println("***********************");
        System.out.println("Enter your password");
        Password = myObj.nextInt();
        System.out.println("Select Page: " +Instagram);
        System.out.println("Enter password: " +Password);
    }
}