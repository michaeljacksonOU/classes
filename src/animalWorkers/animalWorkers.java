package animalWorkers;

public class animalWorkers{
    int yearsWorked;
    String gender;
    int numOfKids;
    
    public animalWorkers() {
        int yearsWorked = 0;
        String gender = "None";
        int numOfKids = 0;
    }

    public animalWorkers(int initYearsWorked, String initGender, int initNumOfKids) {
        initYearsWorked = yearsWorked;
        initGender = gender;
        initNumOfKids = numOfKids;

    }

    public void feedAnimals() {;
    }


}

interface lunchBreak {
    public void lunch();
}