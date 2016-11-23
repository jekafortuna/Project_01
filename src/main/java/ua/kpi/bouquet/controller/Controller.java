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
    public static final int FIRST_ITEM = 1;
    public static final int SECOND_ITEM = 2;
    public static final int THIRD_ITEM = 3;
    public static final int FOURTH_ITEM = 4;
    public static final int FIFTH_ITEM = 5;

    private Bouquet bouquet;
    private View view;

    // Constructor
    public Controller(Bouquet bouquet, View view) {
        this.bouquet = bouquet;
        this.view = view;
    }

    /**
     * The work method
     */
    public void processUser(){
        Scanner scanner = new Scanner(System.in);

        view.printMessage(View.MAIN_MENU);
        int menuItem = enterIntValue(scanner);
        /**
         * Menu for user
         */
        switch (menuItem) {
            case FIRST_ITEM:                                //print bouquet consist
                bouquet.bouquetConsist();
                processUser();
                break;
            case SECOND_ITEM:                               //bouquet price
                bouquet.getBouquetPrice();
                processUser();
                break;
            case THIRD_ITEM:                                //flowers by stem length from range
                view.printMessage(View.ENTER_RANGE);
                bouquet.findFlowersByStemLength(enterPositiveInt(scanner),
                                                enterPositiveInt(scanner));
                processUser();
                break;
            case FOURTH_ITEM:                               //sort by freshness
                bouquet.sortFlowersByFreshness();
                processUser();
                break;
            case FIFTH_ITEM:                                //end of work
                view.printMessage(View.FINISH);
                break;
            default:
                view.printMessage(View.WRONG_MENU_ITEM);
                processUser();
                break;
        }
    }

    /**
     * Check for correct input menu item
     * @param sc
     * @return positive number
     */
    private int enterPositiveInt(Scanner sc) {
        int positiveInt = enterIntValue(sc);
        while (positiveInt < ZERO_VALUE) {
            view.printMessage(View.WRONG_INT);
            positiveInt = enterIntValue(sc);
        }
        return positiveInt;
    }

    private int enterIntValue(Scanner sc) {
        while( !sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}
