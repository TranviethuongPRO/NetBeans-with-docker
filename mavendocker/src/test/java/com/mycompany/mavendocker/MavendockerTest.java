/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.mavendocker;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class MavendockerTest {
    
    public MavendockerTest() {
    }
    
      private Mavendocker instance;

    @Before
    public void setUp() {
        instance = new Mavendocker("user123", "test@example.com");
    }

    /**
     * Test phương thức getEmail().
     */
    @Test
    public void testGetEmail() {
        System.out.println("Test getEmail");
        String expectedEmail = "test@example.com";
        String actualEmail = instance.getEmail();
        assertEquals(expectedEmail, actualEmail);
    }

    /**
     * Test phương thức setEmail().
     */
    @Test
    public void testSetEmail() {
        System.out.println("Test setEmail");
        String newEmail = "newemail@example.com";
        instance.setEmail(newEmail);
        assertEquals(newEmail, instance.getEmail());
    }

    /**
     * Test phương thức updateEmail().
     */
    @Test
    public void testUpdateEmail() {
        System.out.println("Test updateEmail");
        String updatedEmail = "updated@example.com";
        instance.updateEmail(updatedEmail);
        assertEquals(updatedEmail, instance.getEmail());
    }
}