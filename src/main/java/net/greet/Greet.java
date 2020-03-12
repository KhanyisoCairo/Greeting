package net.greet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Greet {
    //this will store the userName that are being greeted
    HashMap<String, Integer> greetedUser = new HashMap<String, Integer>();

     public String greet(String name ,String language){
         if(greetedUser.containsKey(name)){
             greetedUser.put(name, greetedUser.get(name) + 1);
         }else{
             greetedUser.put(name,1);
         }
//         System.out.println(Languages.valueOf(language).getLanguage());
//    if (){
//
//        return String.valueOf(Languages.valueOf(language));
//    }
//         if(language == Languages.Isixhosa.toString()){
////             return "Molo, " + name;
//                return Languages.English + name;
//         }else if(language == Languages.English.toString()){
//             return "Hello, " + name;
//         }
//         else if(language == Languages.Afrikaans.toString()){
//
//             return "Hallo, " + name;
//         }
//       return  name + ", " + language;sou
         return  Languages.valueOf(language).getLanguage()+" "+name;
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

 public void clear(){
         greetedUser.clear();
//         greetedUser.size();
        }
public void clear(String name){
  greetedUser.containsKey(name);
      greetedUser.remove(name);
}
//public void exit(){
//}

}
