package animalWorkers;


public final class tigerKeeper extends animalWorkers implements lunchBreak{
    int numOfSiblings;

    private tigerKeeper() {
        numOfSiblings = 0;
    }

    protected tigerKeeper(int initNumOfSiblings) {
        initNumOfSiblings = numOfSiblings;
    }

    public void feedAnimals() {
        System.out.println("The tiger keeper is feeding the tigers meat.");
    }

    protected void favMovie() {
        System.out.println("The tiger keeper doesn't have a favorite movie.");

    }

    protected void favMovie(String movieName) {
        System.out.println("The tiger keeper's favorite movie is " + movieName + ".");
    }
    @Override
    public void lunch() {
        System.out.println(" The beekeeper is taking a lunch break.");
    }
    
}