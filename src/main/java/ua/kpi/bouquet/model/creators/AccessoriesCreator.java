package ua.kpi.bouquet.model.creators;

import ua.kpi.bouquet.model.entities.accessory.Accessory;
import ua.kpi.bouquet.model.entities.accessory.Basket;
import ua.kpi.bouquet.model.entities.accessory.Ribbon;
import ua.kpi.bouquet.model.entities.accessory.WrapperPaper;
import ua.kpi.bouquet.model.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 13. November. 16.
 * This class creates accessories for our bouquet
 *
 * @author Evgeniy
 */
public class AccessoriesCreator {

    /**
     * List of accessories for bouquet
     */
    private List<Accessory> accessories;

    /**
     * Creating accessories
     */
    public AccessoriesCreator() {
        accessories = new ArrayList<>();
        accessories.add(new Ribbon(Color.BLUE, 10, 176));
        accessories.add(new Ribbon(Color.YELLOW, 22.5, 150));
        accessories.add(new WrapperPaper(Color.WHITE, 46, 150, 90));
        accessories.add(new Basket(Color.RED, 200, 15.52, 90));
        accessories.add(new Ribbon(Color.GREEN, 30, 160));
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }
}
