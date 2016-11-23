package ua.kpi.bouquet.model.creators;

import ua.kpi.bouquet.model.entities.enums.FlowerName;
import ua.kpi.bouquet.model.entities.flower.Flower;
import ua.kpi.bouquet.model.entities.flower.GardenFlower;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 13. November. 16.
 * This class creates flowers to our bouquet
 *
 * @author Evgeniy
 */
public class FlowersCreator {

    /**
     * List of flowers in bouquet
     */
    private List<Flower> flowers;

    /**
     * Creating flowers
     */
    public FlowersCreator() {
        flowers = new ArrayList<>();
        flowers.add(new GardenFlower(29, 6, 120.3, FlowerName.TULIP));
        flowers.add(new GardenFlower(110, 10, 300, FlowerName.ROSE));
        flowers.add(new GardenFlower(60, 8, 130, FlowerName.CHRYSANTEMUM));
        flowers.add(new GardenFlower(20, 7, 50.45, FlowerName.CHAMOMILE));
        flowers.add(new GardenFlower(57, 7, 56, FlowerName.ASTER));
        flowers.add(new GardenFlower(26, 2, 41, FlowerName.POPPY));
        flowers.add(new GardenFlower(40, 9, 80, FlowerName.LILAE));
    }

    public List<Flower> getFlowers() {
        return flowers;
    }
}
