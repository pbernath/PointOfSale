
package exceptions;

import dto.ItemDTO;

/**
 * This class is an exception that can occur when an item is scanned that is not registered in the inventory system.
 * 
 */
public class ItemInvalidException extends Exception {
    
    /**
     * Constructor for the exception
     * When an item can't be found in the inventory system, the DTO of that item is still created and is containing the faulty ItemID. This is not displayed however, but the user is prompted to try the scanning again.
     * @param itemDTO The itemDTO created after unsuccessful fetching from the inventory system.
     */
    public ItemInvalidException (ItemDTO itemDTO){
        super("To user: Item scanned not found in the inventory system! Try Again!");
    }
}
