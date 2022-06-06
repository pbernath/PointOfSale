package controller;

import dto.ItemDTO;

/**
 *
 * @author Peter
 */
public class InvalidItemException extends Exception{
    ItemDTO itemDTO;
    
    public InvalidItemException (ItemDTO itemDTO) {
        super ("The item with the Item ID " + itemDTO.getItemID() + " was not found in the inventory system.\n");
    }
}
