
package model;

import dto.SaleLogDTO;

/**
 * This is an observer. It does nothing but receive information whenever it needs it. Other classes that implement this class will use the information received to display or log the information contained in parameters.
 * 
 */
public interface SaleObserver {
    
    /**
     * This function is part of the observer interface that other classes can implement. In this case it takes all the information about the finalized sale.
     * @param saleLogDTO The saleLogDTO created once a sale has been finalized
     */
    void newSale (SaleLogDTO saleLogDTO);
}
