package Animals;

public final class Hippo extends Animal implements InnerAnimal{
    String name;

    public Hippo() {
        name = "None";
    }

    public Hippo(String initName) {
        initName = name;
    }

    public void isHungry(String answ) {
        if (answ.equals("yes")) {
            System.out.println(name + " is hungry.");
        } else {
            System.out.println(name + " is not hungry.");
        }
    }
    public void isHungry() {
        System.out.println("is " + name + " hungry?: yes or no?");
    }
    
    public void food() {
        System.out.println(name + " eats Grass.");
    }
    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
