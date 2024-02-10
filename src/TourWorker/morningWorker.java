package TourWorker;

public class morningWorker {
    String name;

    public morningWorker() {
        name = "None";
    }

    public morningWorker(String initName) {
        initName = name;
    }

    static void bestPartOfDay() {
        System.out.println("I loves clocking in, in the mornings.");
    }
    static void shift() {
        System.out.println("I Doesnt know what time they work today");
    }
    
    public void shift(String time) {
        System.out.println("I work from " + time);
    }
}

