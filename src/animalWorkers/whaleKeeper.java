package animalWorkers;

public final class whaleKeeper extends animalWorkers implements lunchBreak{
    String favAnimal;

    private whaleKeeper() {
        favAnimal = "None";
    }

    private whaleKeeper(String initFavAnimal) {
        initFavAnimal = favAnimal;
    }

    private void favWhale() {
        System.out.println("The whale keeper doesn't have a favorite whale.");
    }

    private void favWhale(String whaleName) {
        System.out.println("The whale keeper's favorite whale is " + whaleName + ".");
    }

public void feedAnimals() {
        System.out.println("The whale keeper is feeding the whales krill.");
    }
    
    @Override
    public void lunch() {
        System.out.println("The beekeeper is taking a lunch break.");
    }
}
