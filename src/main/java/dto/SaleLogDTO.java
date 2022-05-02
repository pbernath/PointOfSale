
package dto;

import java.util.List;
import model.ListItem;


public class SaleLogDTO {
    private final List<ListItem> theFinalList;
    private final int amountPaid;
    private final int change;
    
    public SaleLogDTO (List<ListItem> theFinalList, int amountPaid, int change) {
        this.theFinalList = theFinalList;
        this.amountPaid = amountPaid;
        this.change = change;
    }
    
    public List<ListItem> getTheFinalList () {
        return theFinalList;
    }
    
    public int getAmountPaid () {
        return amountPaid;
    }
    
    public int getChange () {
        return change;
    }
}
