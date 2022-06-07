
package exceptions;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * This class is an exception that can occur when a connection to a database can not be established.
 * 
 */
public class DatabaseConnectionException extends Exception {
    
    /**
     * Constructor for the exception
     * When the connection can't be established a message to be logged is contained in this exception constructor.
     */
    public DatabaseConnectionException (){
        super("Developer log: Connection to inventory system failed at " + LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES) + " and through IP-address '8.8.8.8'.");
    }
}
