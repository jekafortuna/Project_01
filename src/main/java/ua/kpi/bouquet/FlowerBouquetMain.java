package ua.kpi.bouquet;

import ua.kpi.bouquet.controller.Controller;
import ua.kpi.bouquet.model.Bouquet;
import ua.kpi.bouquet.view.View;

/**
 * Created by Evgeniy on 13.11.2016.
 * Main class for running a program
 */
public class FlowerBouquetMain {
    public static void main(String[] args) {

        // Initialization
        Controller controller = new Controller(new Bouquet().createBouquet(), new View());

        // Run
        controller.processUser();
    }
}
