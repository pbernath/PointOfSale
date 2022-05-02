
package dto;

import java.util.List;
import model.ListItem;


public class SaleLogDTO {
    private final List<ListItem> theFinalList;
    private final int amountPaid;
    private final double totalPrice;
    private final int change;
    private final double totalTax;
    
    public SaleLogDTO (List<ListItem> theFinalList, int amountPaid, double totalPrice, int change, double totalTax) {
        this.theFinalList = theFinalList;
        this.amountPaid = amountPaid;
        this.totalPrice = totalPrice;
        this.change = change;
        this.totalTax = totalTax;
    }
    
    public List<ListItem> getTheFinalList () {
        return theFinalList;
    }
    
    public int getAmountPaid () {
        return amountPaid;
    }
    
    public double getTotalPrice () {
        return totalPrice;
    }
    
    public int getChange () {
        return change;
    }
    
    public double getTotalTax () {
        return totalTax;
    }
}
