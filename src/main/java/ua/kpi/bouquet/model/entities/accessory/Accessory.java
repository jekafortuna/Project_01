package ua.kpi.bouquet.model.entities.accessory;

import ua.kpi.bouquet.model.entities.enums.Color;
import ua.kpi.bouquet.view.View;

/**
 * Created on 13. November. 16.
 *
 * @author Evgeniy
 */
public abstract class Accessory {

    /**
     * Color of accessory
     */
    private Color color;

    /**
     * Price of accessory
     */
    private double price;

    /**
     * Accessory constructor
     */
    public Accessory(Color color, double price) {
        this.color = color;
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return View.ACCESSORY + View.COLOR + color +
                View.PRICE + price + View.COINS;
    }
}
