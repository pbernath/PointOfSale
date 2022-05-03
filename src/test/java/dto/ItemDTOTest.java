
package dto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Peter
 */
public class ItemDTOTest {
    
    public ItemDTOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getItemID method, of class ItemDTO.
     */
    @Test
    public void testGetItemID() {
        System.out.println("getItemID");
        ItemDTO instance = null;
        int expResult = 0;
        int result = instance.getItemID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemName method, of class ItemDTO.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        ItemDTO instance = null;
        String expResult = "";
        String result = instance.getItemName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemDescription method, of class ItemDTO.
     */
    @Test
    public void testGetItemDescription() {
        System.out.println("getItemDescription");
        ItemDTO instance = null;
        String expResult = "";
        String result = instance.getItemDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemCategory method, of class ItemDTO.
     */
    @Test
    public void testGetItemCategory() {
        System.out.println("getItemCategory");
        ItemDTO instance = null;
        String expResult = "";
        String result = instance.getItemCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class ItemDTO.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        ItemDTO instance = null;
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxRate method, of class ItemDTO.
     */
    @Test
    public void testGetTaxRate() {
        System.out.println("getTaxRate");
        ItemDTO instance = null;
        double expResult = 0.0;
        double result = instance.getTaxRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValidity method, of class ItemDTO.
     */
    @Test
    public void testGetValidity() {
        System.out.println("getValidity");
        ItemDTO instance = null;
        boolean expResult = false;
        boolean result = instance.getValidity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
