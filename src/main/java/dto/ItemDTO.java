
package dto;


public class ItemDTO {
    
    private final int itemID;
    private final String itemName;
    private final String itemDescription;
    private final String itemCategory;
    private final int price;
    private final int taxRate;
    private final boolean validity;
    
    
    public ItemDTO (int itemID, String itemName, String itemDescription, String itemCategory, int price, int taxRate, boolean validity) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.price = price;
        this.taxRate = taxRate;
        this.validity = validity;
    }
    
    public int getItemID () {
        return itemID;
    }
    
    public String getItemName () {
        return itemName;
    }
    
    public String getItemDescription () {
        return itemDescription;
    }
    
    public String getItemCategory () {
        return itemCategory;
    }
    
    public int getPrice () {
        return price;
    }
    
    public int getTaxRate () {
        return taxRate;
    }
    
    public boolean getValidity () {
        return validity;
    }
}
