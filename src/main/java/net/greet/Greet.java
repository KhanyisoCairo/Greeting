package net.greet;

import java.util.HashMap;
import java.util.Map;

public class Greet {
    //this will store the userName that are being greeted
    HashMap<String, Integer> greetedUser = new HashMap<String, Integer>();

     public String greet(String name ,String language){
         if(greetedUser.containsKey(name)){
             greetedUser.put(name, greetedUser.get(name) + 1);
         }else{
             greetedUser.put(name,1);
         }

         if(language == Languages.Isixhosa.toString()){
             return "Molo, " + name;

         }else if(language == Languages.English.toString()){
             return "Hello, " + name;
         }
         else if(language == Languages.Afrikaans.toString()){

             return "Hallo, " + name;
         }
       return  name + ", " + language;
    }

    public Map<String, Integer> greeted() {
        return greetedUser;
    }

    public int greeted(String name){
         if (greetedUser.containsKey(name)){
             return greetedUser.get(name);
         }else {
             return greetedUser.size();
         }
     }

     public int counter(){
         return greetedUser.size();
     }

 public void clear(){ greetedUser.clear();
        }




//    public static void main(String[] args) throws IOException {
//         Greet greet = new Greet();
//        BufferedReader standardInput = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.print("Enter your command: ");
//        String name = standardInput.readLine();
////        System.out.print("Enter your Language: ");
//        String language = standardInput.readLine();
//        System.out.println("===========================");
//         System.out.println(greet.greet(name,language));
//    }

}
