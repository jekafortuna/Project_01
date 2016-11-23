package ua.kpi.bouquet.model.entities.flower;

import ua.kpi.bouquet.view.View;

/**
 * Created on 13. November. 16.
 *
 * @author Evgeniy
 */
public abstract class Flower {

    /**
     * Stem length of flower in millimeters
     */
    private int stemLength;

    /**
     * Freshness of flower from 0 to 10
     */
    private int freshness;

    /**
     * Price of one unit of flower
     */
    private double price;

    /**
     * Flower constructor
     */
    public Flower(int stemLength, int freshness, double price) {
        this.stemLength = stemLength;
        this.freshness = freshness;
        this.price = price;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return View.FLOWER_STEM_LENGTH + stemLength + View.CENTIMETRES +
                View.FRESHNESS + freshness + View.PART_OF_10 +
                View.PRICE + price + View.COINS;
    }
}
