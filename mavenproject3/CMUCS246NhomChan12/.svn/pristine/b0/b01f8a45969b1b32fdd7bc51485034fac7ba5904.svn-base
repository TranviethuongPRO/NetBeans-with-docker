/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package product;

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
public class ProductsystemTest {
    
    public ProductsystemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getProductId method, of class Productsystem.
     */
    @Test
      public void testGetProductId() {
          Productsystem product = new Productsystem("P001", "Laptop", 1500.0);
          assertEquals("P001", product.getProductId());
      }

      @Test
      public void testSetPrice() {
          Productsystem product = new Productsystem("P001", "Laptop", 1500.0);
          product.setPrice(1600.0);
          assertEquals(1600.0, product.getPrice(), 0.001);
      }
  }
