package ua.kpi.bouquet.model.entities.accessory;

import ua.kpi.bouquet.model.entities.enums.Color;
import ua.kpi.bouquet.view.View;

/**
 * Created on 13. November. 16.
 *
 * @author Evgeniy
 */
public class Basket extends Accessory{

    /**
     * Diameter of basket in centimetres
     */
    private double diameter;

    /**
     * Height of basket in centimetres
     */
    private int basketHeight;

    /**
     * Constructor of basket
     * @param color of basket
     * @param price of basket
     * @param diameter of basket
     * @param basketHeight height of basket
     */
    public Basket(Color color, double price, double diameter, int basketHeight) {
        super(color, price);
        this.diameter = diameter;
        this.basketHeight = basketHeight;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getBasketHeight() {
        return basketHeight;
    }

    public void setBasketHeight(int basketHeight) {
        this.basketHeight = basketHeight;
    }

    @Override
    public String toString() {
        return View.BASKET + super.toString() + View.DIAMETER +
                diameter + View.CENTIMETRES + View.HEIGHT +
                basketHeight + View.CENTIMETRES;
    }
}
