package net.greet;

import java.util.Scanner;

public class App {
    public static String command = "";
    protected static String name;
    public static String language;



    public static void main(String[] args) {
        Greet greet = new Greet();
        Scanner scn = new Scanner(System.in);
        //have

        String[] parts = command.split(" ");

        String command = parts[0];
        String name = parts[1];
        String language = parts[2];

//       if ("greet".equals(command)) {
        String greetingMessage = greet.greet(name, language);
        System.out.println(greetingMessage);
//       } else if ("exit".equals())
//    }



        // name1  = command[1];
        //language lang =command[2];

//        System.out.print("Enter Command: ");
//        if(getCommand.equals(command)){
//            String name1 = scn.nextLine();
////            String language1 = scn.nextLine();
//        }else{
//            System.out.println("===========================");
//            System.out.println(greet.greet(name , language);
//        }


    }
}
