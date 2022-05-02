
package dto;

import java.util.List;
import model.ListItem;


public class SalesListDTO {
    private final List<ListItem> theItemList;
    private final int totalPrice;
    
    public SalesListDTO (List<ListItem> theItemList, int totalPrice) {
        this.theItemList = theItemList;
        this.totalPrice = totalPrice;
    }
    
    public List<ListItem> getTheItemList () {
        return theItemList;
    }
    
    public int getTotalPrice () {
        return totalPrice;
    }
}