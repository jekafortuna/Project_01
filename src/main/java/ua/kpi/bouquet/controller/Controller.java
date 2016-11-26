package ua.kpi.bouquet.controller;

import ua.kpi.bouquet.model.Bouquet;
import ua.kpi.bouquet.view.View;

import java.util.Scanner;

/**
 * Created on 13. November. 16.
 *
 * @author Evgeniy
 */
public class Controller {

    // The constants
    public static final int ZERO_VALUE = 0;

    /**
     * Reference to model unit of MVC based architecture of program
     */
    private Bouquet bouquet;

    /**
     * Reference to view unit of MVC based architecture of program
     */
    private View view;

    /**
     * Initiates program's controller unit and set up references to model and view units
     *
     * @param bouquet reference to model unit of application
     * @param view  reference to view unit of application
     */
    public Controller(Bouquet bouquet, View view) {
        this.bouquet = bouquet;
        this.view = view;
    }

    /**
     * The work method
     */
    public void processUser(){
        Scanner scanner = new Scanner(System.in);

        view.printMessage(View.MAIN_MESSAGE);

        view.printMessage(View.CONSISTENCE);
        bouquet.bouquetConsist();

        bouquet.getBouquetPrice();

        bouquet.sortFlowersByFreshness();

        view.printMessage(View.ENTER_RANGE);
        bouquet.findFlowersByStemLength(enterPositiveInt(scanner), enterPositiveInt(scanner));

        view.printMessage(View.FINISH);
    }

    /**
     * Check for correct input menu item
     * @param scanner
     * @return positive number
     */
    private int enterPositiveInt(Scanner scanner) {
        int positiveInt = enterIntValue(scanner);
        while (positiveInt < ZERO_VALUE) {
            view.printMessage(View.WRONG_INT);
            positiveInt = enterIntValue(scanner);
        }
        return positiveInt;
    }

    private int enterIntValue(Scanner scanner) {
        while( !scanner.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA);
            scanner.next();
        }
        return scanner.nextInt();
    }
}
