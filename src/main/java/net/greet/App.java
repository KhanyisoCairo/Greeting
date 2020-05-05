package net.greet;

import java.util.Scanner;

public class App {
//    protected static String name;
//    public static String language;



    public static void main(String[] args) {
        Greet greet = new Greet();
        boolean run = true;

        while(run){
            Scanner scn = new Scanner(System.in);
            //have
            System.out.println("Enter your Command:");
            String comma =scn.nextLine();
            String[] parts = comma.split(" ");

            String command = parts[0];
            if(command.equals("exist")){
                run = false;
                System.out.println("Goodbye");
            }
            if (command.equals("clear")){
                if(parts.length == 2){
                    if (greet.greetedUser.containsKey(greet.greeted())){
                        greet.greetedUser.get(greet.greeted());
                        greet.greetedUser.clear();
                        System.out.println("list has been cleared");
                    }else if (greet.greetedUser.containsKey(greet.greeted(parts[1]))){
                        greet.greetedUser.clear();
                        System.out.println("user has been cleared ");
                    }
                }
            }

           try{
               if(command.equals("greet")) {
                   System.out.println(greet.greet(parts[1], parts[2]));
               }
               if(command.equals("greeted")){
                   if(parts.length == 2){
                       System.out.println(greet.greeted(parts[1]));
                   }
                   else{
                   System.out.println(greet.greeted());
               }
               }
           }
           catch (Exception e){
                System.out.println("write command");
            }
           }
        }



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

