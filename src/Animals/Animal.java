package Animals;
public class Animal {
    int age; 
    String gender;

    public Animal() {
     int age = 0;
     String gender = "None";
    }

    public Animal(int initAge, String initGender) {
        initAge = age;
        initGender = gender;
    }

    public boolean isMammal(String answ) {
        if (answ.equals("yes")) {
            return true;
        }
        return false;
    }

    public void mate(String mate) {
        System.out.println("Mate with " + mate);

    }
    public void mate() {
        System.out.println("No mate specified.");
    }

    public void food() {
        System.out.println("Food is not specified.");
    }
   
    
}

interface InnerAnimal {
    public void sleep();
}