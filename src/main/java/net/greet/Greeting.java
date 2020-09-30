package net.greet;

public interface Greeting {
    String greet(String name,String language);
    int counter();
    String greeted();
    String greeted(String name);
    String clear();
}
