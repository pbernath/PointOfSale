
package model;

import dto.ItemDTO;
import dto.SalesListDTO;
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
public class SalesListTest {
    
    public SalesListTest() {
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
     * Test of addItem method, of class SalesList.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        ItemDTO itemDTO = null;
        int quantity = 0;
        SalesList instance = new SalesList();
        SalesListDTO expResult = null;
        SalesListDTO result = instance.addItem(itemDTO, quantity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalesListDTO method, of class SalesList.
     */
    @Test
    public void testGetSalesListDTO() {
        System.out.println("getSalesListDTO");
        SalesList instance = new SalesList();
        SalesListDTO expResult = null;
        SalesListDTO result = instance.getSalesListDTO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
