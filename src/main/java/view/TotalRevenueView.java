
package view;

import dto.SaleLogDTO;
import model.SaleObserver;

/**
 * This is an observer class that displays a running tally of all sales and their total revenue thus far. It implements the SaleObserver in the model
 */
public class TotalRevenueView implements SaleObserver{
    int totalNumberOfSales = 0;
    double totalRevenue = 0;
    
    /**
     * This function overrides the newSale in the observer class and controls the adding of the tally
     * @param saleLogDTO This is the saleLogDTO created after the sale has been processed and completed.
     */
    @Override
    public void newSale (SaleLogDTO saleLogDTO) {
        addNewSale (saleLogDTO);
        printTotalRevenue ();
    }
    
    private void addNewSale (SaleLogDTO saleLogDTO) {
        totalNumberOfSales++;
        totalRevenue += saleLogDTO.getTotalPrice();
    }
    
    private void printTotalRevenue () {
        System.out.println("To a view: We have made a total of " + totalNumberOfSales + " sales with a total revenue of " + totalRevenue);
    }
}
