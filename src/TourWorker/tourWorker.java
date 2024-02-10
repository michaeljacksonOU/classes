package TourWorker;

public class tourWorker {
    boolean wentToCollege;
    String name;

    public tourWorker() {
        wentToCollege = false;
        name = "None";
    }

    public tourWorker(String initName, boolean college) {
        initName = name;
        college = wentToCollege;
    }
    
    static void bestPartOfDay() {
        System.out.println("None");
    }
}
