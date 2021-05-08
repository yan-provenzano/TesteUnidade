package com.fullteaching.backend.user;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserTest {

    private User userUnderTest;

    @Before
    public void setUp() {
        userUnderTest = new User("name", "password", "nickName", "picture", "roles");
    }

    @Test
    public void testEquals() {
        final boolean result = userUnderTest.equals(userUnderTest);
        assertTrue(result);
    }

    @Test
    public void testHashCode() {
        final int result = userUnderTest.hashCode();
        assertEquals(0, result);
    }

    @Test
    public void testToString() {
        final String result = userUnderTest.toString();
        assertEquals("name", result);
    }
}
