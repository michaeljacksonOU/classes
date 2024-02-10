package Animals;
public final class Tiger extends Animal implements InnerAnimal{
    int weightInLbs;
    String name;

    public Tiger() {
        weightInLbs = 0;
        name = "None";
    }

    public Tiger(int initWeight, String initName) {
        initWeight = weightInLbs;
        initName = name;
    }
    
    public void hasKids() {
        System.out.println("does not Have kids.");
    }
    public void hasKids(int num) {
        System.out.println("Has kids: " + num);
    }
    public void food() {
        System.out.println(name + " eats Meat.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
