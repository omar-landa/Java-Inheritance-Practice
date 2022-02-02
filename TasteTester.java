package chapter9;

public class TasteTester {

    public static void main(String[] args){

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setTiers(4);

        System.out.println("The wedding cake has " + weddingCake.getTiers() + " tiers.");

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setFlavor("Funfetti");

        System.out.println("The birthday cake is " + birthdayCake.getFlavor() + " flavored!");
    }
}
