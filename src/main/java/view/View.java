
package view;

import controller.Controller;


public class View {
    private final Controller controller;
    
    public View (Controller controller) {
        this.controller = controller;
    }
    
    public void runFakeExecution () {
        controller.startSale();
        System.out.println("A new sale has been started");
        
        int anItemID = 1;
        int aItemQuantity = 1;
        controller.scanItem(anItemID, aItemQuantity);
        System.out.println("Scanned itemID " + anItemID + " with quantity " + aItemQuantity);
        
        controller.endSale();
        System.out.println("The current sale is ending");
    }
}
