package ua.kpi.bouquet.model.entities.accessory;

import ua.kpi.bouquet.model.entities.enums.Color;
import ua.kpi.bouquet.view.View;

/**
 * Created on 13. November. 16.
 * Instance of ribbon
 *
 * @author Evgeniy
 */
public class Ribbon extends Accessory{

    /**
     * Ribbon length in centimeters
     */
    private int ribbonLength;

    /**
     * Ribbon constructor
     * @param color of the ribbon
     * @param price of the ribbon
     * @param ribbonLength length of the ribbon
     */
    public Ribbon(Color color, double price, int ribbonLength) {
        super(color, price);
        this.ribbonLength = ribbonLength;
    }

    public int getRibbonLength() {
        return ribbonLength;
    }

    public void setRibbonLength(int ribbonLength) {
        this.ribbonLength = ribbonLength;
    }

    @Override
    public String toString() {
        return View.RIBBON + super.toString() + View.LENGTH +
                ribbonLength + View.CENTIMETRES ;
    }
}
