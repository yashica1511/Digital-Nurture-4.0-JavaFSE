package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreeterAAATest {

    private Greeter greeter;

    // Setup method - runs before each test
    @Before
    public void setUp() {
        System.out.println("Setup - Creating Greeter");
        greeter = new Greeter();
    }

    // Teardown method - runs after each test
    @After
    public void tearDown() {
        System.out.println("Teardown - Cleaning up");
        greeter = null;
    }

    @Test
    public void testGreet() {
        // Arrange
        String name = "Yashica";

        // Act
        String result = greeter.greet(name);

        // Assert
        assertEquals("Hello, Yashica!", result);
    }
}
