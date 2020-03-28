package net.greet;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetTest {
    @Test
    void shouldgreet() {
        Greet greet = new Greet();
//        greet.greet("cairo","Isixhosa");

        assertEquals(greet.greet("cairo", "Isixhosa"), "Molo cairo");
    }

    @Test
    void shouldGetGreeted() {
        Greet greeted = new Greet();
        greeted.greet("sino", "English");
        greeted.greet("sino", "English");
//        System.out.println(greeted.greeted());
        assertEquals(greeted.greeted(), "{sino=2}");
    }

    @Test
    void shouldGetGreetedUser() {
        Greet Greeted = new Greet();
        Greeted.greet("sino", "English");
        Greeted.greet("sino", "Isixhosa");
        Greeted.greet("Cairo", "Afrikaans");

        assertEquals(Greeted.greeted("sino"), 2);
        assertEquals(Greeted.greeted("Cairo"), 1);
    }

    @Test
    void shouldGetCounter() {
        Greet counter = new Greet();
        counter.greet("sino", "English");
        counter.greet("cairo", "Afrikaans");
        counter.greet("cairo", "Isixhosa");
        counter.greet("Sbu", "Afrikaans");
        counter.greeted("cairo");
        assertEquals(counter.counter(), 3);
    }
//
    @Test
    void  shouldClearGreeted(){
        Greet Greeted = new Greet();
        Greeted.greet("sino", "English");
        Greeted.greet("sino", "Isixhosa");
        Greeted.greet("Cairo", "Afrikaans");
        Greeted.clear();
//        System.out.println(Greeted.greeted());
        assertEquals(Greeted.greeted().toString(), "{}");
    }
    @Test
    void  shouldClearUser(){
        Greet Greeted = new Greet();
        Greeted.greet("sino", "English");
        Greeted.greet("sino", "Isixhosa");
        Greeted.greet("Cairo", "Afrikaans");
        Greeted.clear("sino");
//     Greeted.clear("Cairo");
//        System.out.println(Greeted.greeted());
        assertEquals(Greeted.greeted().toString(), "{Cairo=1}");
    }
}
