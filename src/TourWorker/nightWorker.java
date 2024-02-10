package TourWorker;

public class nightWorker {
    String name;

    public nightWorker() {
        name = "None";
    }

    public nightWorker(String initName) {
        initName = name;
    }

    public void bestPartOfDay() {
        System.out.println(name + " loves clocking out, at night.");
        
    }
    public void coworkers() {
        System.out.println(name + "Doesnt work with anyone.");
    }
    
    public void coworkers(String coworkerNames) {
        System.out.println(name + " works with" + coworkerNames);
    }
}
