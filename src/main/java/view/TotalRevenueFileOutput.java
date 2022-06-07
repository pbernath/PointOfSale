
package view;

import dto.SaleLogDTO;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import model.SaleObserver;


/**
 * This is an observer class that logs to a file the running tally of all sales and their total revenue thus far. It implements the SaleObserver in the model
 */
public class TotalRevenueFileOutput implements SaleObserver{
    int totalNumberOfSales = 0;
    double totalRevenue = 0;
    
    private static final String LOG_FILE_NAME = "log.txt";
    private PrintWriter logFile;
    
    /**
     * This is the constructor for the class. It is responsible for creating the FileWriter to write to a file that logs the running tally after each sale
     */
    public TotalRevenueFileOutput () {
        try {
            logFile = new PrintWriter(new FileWriter(LOG_FILE_NAME, true), true);
        } catch (IOException ex) {
            System.out.println("Developer Log: Could not create the Log Handler when running startup.");
        }
    }
    
    /**
     * This function overrides the newSale in the observer class and controls the adding of the tally
     * @param saleLogDTO This is the saleLogDTO created after the sale has been processed and completed.
     */
    @Override
    public void newSale (SaleLogDTO saleLogDTO) {
        addNewSale (saleLogDTO);
        outputTotalRevenue ();
    }
    
    private void addNewSale (SaleLogDTO saleLogDTO) {
        totalNumberOfSales++;
        totalRevenue += saleLogDTO.getTotalPrice();
    }
    
    private void outputTotalRevenue () {
        logFile.println("We have made a total of " + totalNumberOfSales + " sales with a total revenue of " + totalRevenue);
    }
}
