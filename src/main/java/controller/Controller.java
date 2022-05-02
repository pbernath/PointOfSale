
package controller;


import integration.HandlerCreator;
import integration.AccountingSystemHandler;
import integration.CustomerDatabaseHandler;
import integration.DiscountDatabaseHandler;
import integration.InventorySystemHandler;
import integration.PrinterHandler;


public class Controller {
    private final HandlerCreator handlerCreator;
    private final AccountingSystemHandler accountingSystemHandler;
    private final CustomerDatabaseHandler customerDatabaseHandler;
    private final DiscountDatabaseHandler discountDatabseHandler;
    private final InventorySystemHandler inventorySystemHandler;
    private final PrinterHandler printerHandler;
    
    public Controller (HandlerCreator handlerCreator) {
        this.handlerCreator = handlerCreator;
        this.accountingSystemHandler = handlerCreator.getAccountingSystemHandler();
        this.customerDatabaseHandler = handlerCreator.getCustomerDatabaseHandler();
        this.discountDatabseHandler = handlerCreator.getDiscountDatabaseHandler();
        this.inventorySystemHandler = handlerCreator.getInventorySystemHandler();
        this.printerHandler = handlerCreator.getPrinterHandler();
        
    }
}
