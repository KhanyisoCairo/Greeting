package net.greet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetTest {
    @Test
    void shouldgreet() {
        Greet greet = new Greet();

        assertEquals(greet.greet("cairo", "Isixhosa"), "Molo, cairo");
    }

    @Test
    void shouldGetGreeted() {
        Greet greeted = new Greet();
        greeted.greet("sino", "English");
        greeted.greet("sino", "English");

        assertEquals(greeted.greeted().size(), 1);
    }

    @Test
    void shouldGetGreetedUser() {
        Greet Greeted = new Greet();
        Greeted.greet("sino", "English");
        Greeted.greet("sino", "IsiXhosa");
        Greeted.greet("Cairo", "Afrikaans");

        assertEquals(Greeted.greeted("sino"), 2);
        assertEquals(Greeted.greeted("Cairo"), 1);
    }

    @Test
    void shouldGetCounter() {
            Greet counter = new Greet();
            counter.greet("sino", "English");
            counter.greet("cairo", "Afrikaans");
            counter.greet("cairo", "IsiXhosa");
            counter.greet("Sbu", "Afrikaans");
            counter.greeted("cairo");
            assertEquals(counter.counter(),3);
    }
}
