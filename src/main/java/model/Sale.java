
package model;

import dto.SaleLogDTO;
import integration.AccountingSystemHandler;
import integration.InventorySystemHandler;
import integration.PrinterHandler;
import java.util.List;


public class Sale {
    List<ListItem> theFinalList;
    int amountPaid;
    int change;
    SaleLogDTO saleLogDTO;
    
    public Sale (SalesList salesList) {
        theFinalList = salesList.getSalesListDTO().getTheItemList();
        amountPaid = 0;
        change = 0;
    }
    
    public SaleLogDTO processSale (int amountPaid, AccountingSystemHandler accountingSystemHandler, InventorySystemHandler inventorySystemHandler, PrinterHandler printerHandler) {
        
        this.amountPaid = amountPaid;
        
        
        constructSaleLogDTO();
        
        
        
        
        
        
        return saleLogDTO;
    }
    
    private void constructSaleLogDTO () {
        saleLogDTO = new SaleLogDTO(theFinalList, amountPaid, change);
    }
}
