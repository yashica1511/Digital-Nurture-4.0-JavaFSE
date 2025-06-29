package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplierTest {

    @Test
    public void testMultiply() {
        Multiplier multiplier = new Multiplier();

        assertEquals(12, multiplier.multiply(3, 4));   
        assertEquals(0, multiplier.multiply(5, 0));  
        assertEquals(-15, multiplier.multiply(3, -5)); 
    }

    @Test
    public void testMessage() {
        Multiplier multiplier = new Multiplier();

        String message = multiplier.getMessage();

        assertNotNull(message);                    
        assertTrue(message.contains("done"));     
        assertEquals("Multiplication done", message); 
    }
}
