package ua.kpi.bouquet.model.entities.accessory;

import ua.kpi.bouquet.model.entities.enums.Color;
import ua.kpi.bouquet.view.View;

/**
 * Created on 13. November. 16.
 * Instance of wrapping paper
 *
 * @author Evgeniy
 */
public class WrapperPaper extends Accessory{

    /**
     * Height of wrapper paper in centimetres
     */
    private int wrapperHeight;

    /**
     * Width of wrapper paper in centimetres
     */
    private int wrapperWidth;

    /**
     * Constructor of wrapper paper
     * @param color of paper
     * @param price of paper
     * @param wrapperHeight height of paper
     * @param wrapperWidth width of paper
     */
    public WrapperPaper(Color color, double price, int wrapperHeight, int wrapperWidth) {
        super(color, price);
        this.wrapperHeight = wrapperHeight;
        this.wrapperWidth = wrapperWidth;
    }

    public int getWrapperHeight() {
        return wrapperHeight;
    }

    public void setWrapperHeight(int wrapperHeight) {
        this.wrapperHeight = wrapperHeight;
    }

    public int getWrapperWidth() {
        return wrapperWidth;
    }

    public void setWrapperWidth(int wrapperWidth) {
        this.wrapperWidth = wrapperWidth;
    }

    @Override
    public String toString() {
        return View.ACCESSORY + View.WRAPPER_PAPER + super.toString() +
                View.HEIGHT + wrapperHeight + View.CENTIMETRES +
                View.WIDTH + wrapperWidth + View.CENTIMETRES;
    }
}
