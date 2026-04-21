package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    void testGreet() {
        HelloWorld app = new HelloWorld();
        assertEquals("Hello, World!", app.greet("World"));
    }

    @Test
    void testGreetCustomName() {
        HelloWorld app = new HelloWorld();
        assertEquals("Hello, Harness!", app.greet("Harness"));
    }
}
