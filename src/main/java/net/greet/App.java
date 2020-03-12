package net.greet;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Greet greet = new Greet();
        Scanner scn = new Scanner(System.in);



        System.out.print("Enter your Name: ");
        String name1 = scn.nextLine();
//      greet.greet(name1,Languages.English.toString());
        System.out.print("Enter your Language: ");
//        System.out.println(name1);
        String language = scn.nextLine();
        System.out.println("===========================");
        System.out.println(greet.greet(name1 , language));
    }
}
