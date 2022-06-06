
package startup;

import controller.Controller;
import controller.InvalidItemException;
import integration.HandlerCreator;
import view.View;

/**
 * This is the startup class that starts the application
 */
public class main {
    
    /**
     * This is the function that starts the application
     * @param args 
     */
    public static void main (String[] args) throws InvalidItemException {
        
        HandlerCreator handlerCreator = new HandlerCreator();
        Controller controller = new Controller(handlerCreator);
        View view = new View(controller);
        
        view.runFakeExecution();
        
    }
}
