package animalWorkers;

public final class beeKeeper extends animalWorkers implements lunchBreak{
    String name;

    protected beeKeeper() {
        name = "None";
    }

    protected beeKeeper(String initName) {
        initName = name;
    }

    static void thirsty() {
        System.out.println("The beekeeper is thirsty.");
    }

    static void thirsty(String drink) {
        System.out.println("The beekeeper is thirsty for " + drink + ".");
    }

    public void feedAnimals() {
        System.out.println("The beekeeper is feeding the bees pollen.");
    }

    @Override
    public void lunch() {
        System.out.println(name + " The beekeeper is taking a lunch break.");
    }
    
}
