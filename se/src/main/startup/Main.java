package main.startup;

import java.io.IOException;

import main.controller.Controller;
import main.controller.OperationFailedException;
import main.integration.CatalogHandler;
import main.integration.InvalidIDException;
import main.integration.ReceiptPrinter;
import main.integration.SalesLog;
import main.integration.SystemHandler;
import main.view.TotalRevenueView;
import main.view.View;

/**
 * Contains the <code>main</code> method. Performs all startup of the application.
 */
public class Main {

    /**
     * Starts the application
     * 
     * @param args no command line parameters are taken
     * @throws OperationFailedException
     * @throws InvalidIDException
     * @throws IOException
     */
    public static void main(String[] args) throws InvalidIDException, OperationFailedException, IOException {
        SystemHandler systemHandler = new SystemHandler();
        CatalogHandler catalogHandler = new CatalogHandler();
        ReceiptPrinter receiptPrinter = new ReceiptPrinter();
        SalesLog salesLog = new SalesLog();
        Controller ctrl = new Controller(catalogHandler, systemHandler, receiptPrinter, salesLog);
        View view = new View(ctrl);
        view.sampleRun();
        

        
        

    }
    
}
