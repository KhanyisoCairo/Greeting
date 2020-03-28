package net.greet;

import java.util.HashMap;
import java.util.Map;

public class Greet {
    //this will store the userName that are being greeted
    HashMap<String, Integer> greetedUser = new HashMap<String, Integer>();

     public String greet(String name , String language){
         if(greetedUser.containsKey(name)){
             greetedUser.put(name, greetedUser.get(name) + 1);
         }else{
             greetedUser.put(name,1);
         }
         return  Languages.valueOf(language).getLanguage()+" "+name;
    }

    public String greeted() {

        return String.valueOf(greetedUser);
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
