
package model;

import dto.SaleLogDTO;
import integration.AccountingSystemHandler;
import integration.InventorySystemHandler;
import integration.PrinterHandler;
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
public class SaleTest {
    
    public SaleTest() {
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
     * Test of processSale method, of class Sale.
     */
    @Test
    public void testProcessSale() {
        System.out.println("processSale");
        int amountPaid = 0;
        AccountingSystemHandler accountingSystemHandler = null;
        InventorySystemHandler inventorySystemHandler = null;
        PrinterHandler printerHandler = null;
        Sale instance = null;
        SaleLogDTO expResult = null;
        SaleLogDTO result = instance.processSale(amountPaid, accountingSystemHandler, inventorySystemHandler, printerHandler);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
