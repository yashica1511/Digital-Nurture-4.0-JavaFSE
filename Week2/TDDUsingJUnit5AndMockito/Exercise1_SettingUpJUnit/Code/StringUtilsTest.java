package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void testIsPalindromeWithPalindrome() {
        assertTrue(StringUtils.isPalindrome("Madam"));
    }

    @Test
    public void testIsPalindromeWithSpacesAndPunctuation() {
        assertTrue(StringUtils.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testIsNotPalindrome() {
        assertFalse(StringUtils.isPalindrome("Hello"));
    }

    @Test
    public void testNullInput() {
        assertFalse(StringUtils.isPalindrome(null));
    }
}

