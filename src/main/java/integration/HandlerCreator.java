
package integration;


public class HandlerCreator {
    private final AccountingSystemHandler accountingSystemHandler;
    private final CustomerDatabaseHandler customerDatabaseHandler;
    private final DiscountDatabaseHandler discountDatabseHandler;
    private final InventorySystemHandler inventorySystemHandler;
    private final PrinterHandler printerHandler;
    
    public HandlerCreator(){
        accountingSystemHandler = new AccountingSystemHandler();
        customerDatabaseHandler = new CustomerDatabaseHandler();
        discountDatabseHandler = new DiscountDatabaseHandler();
        inventorySystemHandler = new InventorySystemHandler();
        printerHandler = new PrinterHandler();
    }
    
    public AccountingSystemHandler getAccountingSystemHandler() {
        return this.accountingSystemHandler;
    }
    
    public CustomerDatabaseHandler getCustomerDatabaseHandler() {
        return this.customerDatabaseHandler;
    }
    
    public DiscountDatabaseHandler getDiscountDatabaseHandler() {
        return this.discountDatabseHandler;
    }
    
    public InventorySystemHandler getInventorySystemHandler() {
        return this.inventorySystemHandler;
    }
    
    public PrinterHandler getPrinterHandler() {
        return this.printerHandler;
    }
    
}
