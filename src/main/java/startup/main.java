
package startup;

import controller.Controller;
import integration.HandlerCreator;
import view.View;


public class main {
    
    /**
     * This is the startup class that start the application
     * @param args 
     */
    public static void main(String[] args){
        
        HandlerCreator handlerCreator = new HandlerCreator();
        Controller controller = new Controller(handlerCreator);
        View view = new View(controller);
        
    }
}
