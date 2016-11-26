package ua.kpi.bouquet.view;

/**
 * Created by Evgeniy on 13.11.2016.
 * This class represents View unit of MVC based architecture of program
 */
public class View {

    // Text's constants
    public static final String CONSISTENCE = "Bouquet consists of: ";
    public static final String FLOWER_STEM_LENGTH = " with stem length - ";
    public static final String FRESHNESS = ", freshness is ";
    public static final String PART_OF_10 = "/10";
    public static final String PRICE = ", price - ";
    public static final String COINS = " coins";
    public static final String ACCESSORY = "Accessory - ";
    public static final String COLOR = "of color - ";
    public static final String FLOWERS_NAME = "Flower - ";
    public static final String RIBBON = "ribbon ";
    public static final String LENGTH = " with a length of ";
    public static final String CENTIMETRES = " centimetres";
    public static final String BASKET = "basket ";
    public static final String DIAMETER = ", with a diameter of ";
    public static final String HEIGHT = ", height - ";
    public static final String WIDTH = ", width - ";
    public static final String WRAPPER_PAPER = "paper for wrapping ";
    public static final String BOUQUET_PRICE = "Total price of bouquet - ";
    public static final String SORTING_BY_FRESHNESS = "Flowers sorted by freshness (from high to low): ";
    public static final String FLOWERS_BY_STEM_LENGTH = "Flowers, suitable by set range of stem length:";
    public static final String BOUQUET_CONTAINS = "Bouquet contains ";
    public static final String FLOWERS = " flowers ";
    public static final String ACCESSORIES = " accessories ";
    public static final String MIN_MAX = "Lower value must be less then higher!";
    public static final String NO_MATCHING_FLOWERS = "Sorry, there are no flowers in bouquet that match those requirements!";
    public static final String WRONG_INT = "Wrong input! Length must be positive! Enter correct INT value";
    public static final String WRONG_INPUT_DATA = "Wrong input! Enter correct INT value";
    public static final String ENTER_RANGE = "Enter length range in centimeters:";
    public static final String FINISH = "Good luck! Thanks for attention!";

    public static final String MAIN_MESSAGE = "There will execute next actions:\n1.Print consistence of bouquet\n" +
            "2.Count cost of all elements in bouquet\n3.Sort flowers by freshness \n" +
            "4.Get flowers by stem length\n";

    public void printMessage(String message){
        System.out.println(message);
    }
}
