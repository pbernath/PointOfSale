
package model;

import dto.ItemDTO;
import dto.SalesListDTO;
import java.util.ArrayList;
import java.util.List;


public class SalesList {
    private List<ListItem> theItemList;
    private int totalPrice;
    
    public SalesList() {
        theItemList = new ArrayList<ListItem>();
        updatePrice();
    }
    
    public SalesListDTO addItem (ItemDTO itemDTO, int quantity) {
        if (itemDTO.getValidity() == true) {
            boolean present = false;
            for (ListItem i : theItemList) {
                if (itemDTO.getItemID() == i.itemDTO.getItemID()) {
                    present = true;
                    i.addQuantity(quantity);
                    break;
                }
            }
            if (present == false) {
                theItemList.add(new ListItem(itemDTO,quantity));
            }
        }
        return getSalesListDTO();
    }
    
    SalesListDTO getSalesListDTO () {
        updatePrice();
        return new SalesListDTO(theItemList, totalPrice);
    }
    
    private void updatePrice() {
        totalPrice = 0;
        for (ListItem i : theItemList) {
            int itemPrice = i.itemDTO.getPrice();
            int itemTaxRate = i.itemDTO.getTaxRate();
            int quantity = i.quantity;

            int itemAddedTax = itemPrice * itemTaxRate;
            int itemPriceWithTax = itemPrice + itemAddedTax;

            totalPrice += quantity * itemPriceWithTax;
        }
    }
}
