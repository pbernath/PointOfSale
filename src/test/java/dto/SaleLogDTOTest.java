
package dto;

import java.time.LocalDateTime;
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
public class SaleLogDTOTest {
    
    public SaleLogDTOTest() {
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
     * Test of getTheFinalList method, of class SaleLogDTO.
     */
    @Test
    public void testGetTheFinalList() {
        System.out.println("getTheFinalList");
        SaleLogDTO instance = null;
        List<ListItem> expResult = null;
        List<ListItem> result = instance.getTheFinalList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmountPaid method, of class SaleLogDTO.
     */
    @Test
    public void testGetAmountPaid() {
        System.out.println("getAmountPaid");
        SaleLogDTO instance = null;
        int expResult = 0;
        int result = instance.getAmountPaid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPrice method, of class SaleLogDTO.
     */
    @Test
    public void testGetTotalPrice() {
        System.out.println("getTotalPrice");
        SaleLogDTO instance = null;
        double expResult = 0.0;
        double result = instance.getTotalPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChange method, of class SaleLogDTO.
     */
    @Test
    public void testGetChange() {
        System.out.println("getChange");
        SaleLogDTO instance = null;
        int expResult = 0;
        int result = instance.getChange();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalTax method, of class SaleLogDTO.
     */
    @Test
    public void testGetTotalTax() {
        System.out.println("getTotalTax");
        SaleLogDTO instance = null;
        double expResult = 0.0;
        double result = instance.getTotalTax();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimestamp method, of class SaleLogDTO.
     */
    @Test
    public void testGetTimestamp() {
        System.out.println("getTimestamp");
        SaleLogDTO instance = null;
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getTimestamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
