package ua.kpi.bouquet.model.entities.flower;

import ua.kpi.bouquet.model.entities.enums.FlowerName;
import ua.kpi.bouquet.view.View;

/**
 * Created on 13. November. 16.
 *
 * @author Evgeniy
 */
public class GardenFlower extends Flower{

    private FlowerName flowerName;

    public GardenFlower(int stemLength, int freshness, double price, FlowerName flowerName) {
        super(stemLength, freshness, price);
        this.flowerName = flowerName;
    }

    public FlowerName getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(FlowerName flowerName) {
        this.flowerName = flowerName;
    }

    @Override
    public String toString() {
        return  View.FLOWERS_NAME + flowerName.name() + super.toString();
    }
}
