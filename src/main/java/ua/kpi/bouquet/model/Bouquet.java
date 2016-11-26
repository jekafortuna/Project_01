package ua.kpi.bouquet.model;

import ua.kpi.bouquet.model.creators.AccessoriesCreator;
import ua.kpi.bouquet.model.creators.FlowersCreator;
import ua.kpi.bouquet.model.entities.accessory.Accessory;
import ua.kpi.bouquet.model.entities.flower.Flower;
import ua.kpi.bouquet.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created on 13. November. 16.
 * This class represents Model unit of MVC based architecture of program
 *
 * @author Evgeniy
 */
public class Bouquet {

    /**
     * List of flowers in bouquet
     */
    private List<Flower> flowers;

    /**
     * List of accessories in bouquet
     */
    private List<Accessory> accessories;

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<Accessory> accessories) {
        this.accessories = accessories;
    }

    /**
     * Method for adding flower to bouquet
     * @param flower that must be added
     */
    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    /**
     * Method for adding accessory to bouquet
     * @param accessory that must be added
     */
    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

    public Bouquet() {
        this.flowers = new ArrayList<>();
        this.accessories = new ArrayList<>();
    }

    public Bouquet(List<Flower> flowers, List<Accessory> accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
    }

    public Bouquet(List<Flower> flowers) {
        this(flowers, new ArrayList<Accessory>());
    }

    /**
     * Method creates a bouquet with flowers and accessories
     * @return ready bouquet
     */
    public Bouquet createBouquet(){
        return new Bouquet(new FlowersCreator().getFlowers(),
                new AccessoriesCreator().getAccessories());
    }

    /**
     * This method prints consistence of bouquet
     */
    public void bouquetConsist(){
        for (Flower flower : this.getFlowers()){
            System.out.println(flower + " ");
        }

        for (Accessory accessory : this.getAccessories()){
            System.out.println(accessory + " ");
        }
        System.out.println();
    }

    /**
     * Calculating full price of bouquet
     * @return bouquet price
     */
    public double getBouquetPrice() {
        double bouquetPrice = 0;
        for(Flower flower : flowers) {
            bouquetPrice += flower.getPrice();
        }
        for(Accessory accessory : accessories) {
            bouquetPrice += accessory.getPrice();
        }
        System.out.println(View.BOUQUET_PRICE + bouquetPrice + View.COINS + '\n');
        return bouquetPrice;
    }

    /**
     * Sorting flowers in bouquet by freshness and print them
     */
    public void sortFlowersByFreshness() {
        Collections.sort(flowers, new Comparator<Flower>() {
            @Override
            public int compare(Flower flower1, Flower flower2) {
                return flower2.getFreshness() - flower1.getFreshness();
            }
        });

        System.out.println(View.SORTING_BY_FRESHNESS);
        for(Flower flower : flowers) {
            System.out.println(flower);
        }
        System.out.println();
    }

    /**
     * Printing flowers by stem length from range
     * @param fromLength lower edge
     * @param toLength higher length
     * @return list of suitable flowers
     */
    public List<Flower> findFlowersByStemLength(double fromLength, double toLength) {
        List<Flower> resultFlowers = new ArrayList<>();

        /**
         * min value from both entered - equals to lower border
         */
        double min = Math.min(fromLength, toLength);

        /**
         * max value from both entered - equals to high border
         */
        double max = Math.max(fromLength, toLength);

        if (min > max){
            System.out.println(View.MIN_MAX);
        }
        for(Flower flower : flowers) {
            if(flower.getStemLength() >= min && flower.getStemLength() <= max) {
                resultFlowers.add(flower);
            }
        }

        if (resultFlowers.size() <= 0){
            System.out.println(View.NO_MATCHING_FLOWERS);
        } else {
            System.out.println(View.FLOWERS_BY_STEM_LENGTH);
            for (Flower flower : resultFlowers) {
                System.out.println(flower);
            }
        }
        return resultFlowers;
    }

    @Override
    public String toString() {
        return View.BOUQUET_CONTAINS + View.FLOWERS + flowers +
                View.ACCESSORIES + accessories + getBouquetPrice();
    }
}