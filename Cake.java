package chapter9;

/*
*Create Superclass called Cake that has 2 fields: flavor and price. Add Getter/Setter methods for both fields.
* Create BirthdayCake class that will inherit from Cake and has a field called candles. Make Getter/Setter for candles.
* Create WeddingCake class that inherits from Cake and has a field called tiers with Getter/Setter methods.
* Create TasteTester class to test out inheritance.
 */


public class Cake {

    protected String flavor;
    protected double price;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
