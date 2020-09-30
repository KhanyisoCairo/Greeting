package net.greet;

import java.util.Scanner;

public class CommandProcessor {
    // have a while loop always true
    JDBC jdbc = new JDBC();
    Greet greet = new Greet();
    boolean run = true;

    public void processor() {
        Scanner scn = new Scanner(System.in);
        System.out.println("\n|--Welcome To Greeting With Console --|\n");
        try {
            while (run) {
                System.out.println("Enter your Command:");
                String comma = scn.nextLine();
                String[] parts = comma.split(" ");
                String command = parts[0];

                if (command.equals("exist")) {
                    run = false;
                    System.out.println("\n-------------------------||--------------------------");
                    System.out.println("---------------------    Goodbye   ------------------");
                    System.out.println("\n-------------------------||--------------------------");

                }
                if (command.equals("clear")) {
                    if (parts.length == 2) {
                        jdbc.clear();
                        greet.clear(parts[1]);
                        System.out.println(parts[1]+"\n||--Have Cleared The Name --||");
                    } else {
                        jdbc.clear();
                        greet.clear();
                        System.out.println("\n||----All Names Have Been Cleared---||");

                    }
                }

                try {
                    if (command.equals("help")) {

                        System.out.println("\n-------------------------||--------------------------");
                        System.out.println("greet - Greet with a name");
                        System.out.println("greeted - Shows how many users where greeted");
                        System.out.println("greeted -greeted with name shows how many users where greeted");
                        System.out.println("clear - Clears the count list of the users that have been greeted");
                        System.out.println("clear - Clears with Name, clears the user ");
                        System.out.println("exist - Terminates the program");
                        System.out.println("\n-------------------------||--------------------------");


                    }
                    if (command.equals("greet")) {
                        jdbc.addData(parts[1]);
                        System.out.println(greet.greet(parts[1], parts[2]));
                    }
                    if (command.equals("greeted")) {
                        if (parts.length == 2) {
                            jdbc.getData();
                            jdbc.greeted();
                            System.out.println(greet.greeted(parts[1]));
                        } else {
                            jdbc.greeted();
                            System.out.println(greet.greeted());
                        }
                    }
                } catch (Exception e) {
                    System.out.println("write command");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
