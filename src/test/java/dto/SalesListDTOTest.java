
package dto;

import java.util.List;
import model.ListItem;
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
public class SalesListDTOTest {
    
    public SalesListDTOTest() {
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
     * Test of getTheItemList method, of class SalesListDTO.
     */
    @Test
    public void testGetTheItemList() {
        System.out.println("getTheItemList");
        SalesListDTO instance = null;
        List<ListItem> expResult = null;
        List<ListItem> result = instance.getTheItemList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPrice method, of class SalesListDTO.
     */
    @Test
    public void testGetTotalPrice() {
        System.out.println("getTotalPrice");
        SalesListDTO instance = null;
        double expResult = 0.0;
        double result = instance.getTotalPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalTax method, of class SalesListDTO.
     */
    @Test
    public void testGetTotalTax() {
        System.out.println("getTotalTax");
        SalesListDTO instance = null;
        double expResult = 0.0;
        double result = instance.getTotalTax();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
