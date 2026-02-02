public class Plant {

    int numWeeksOld;
    String color;
    Boolean isEdible;

    public Plant(int pnumWeeksOld, String pcolor, boolean pisEdible) {
        int numWeeksOld = pnumWeeksOld;
        String color = pcolor;
        Boolean isEdible = pisEdible;


    }

    public void printInfo(){
        System.out.println("Number of weeks old: " + numWeeksOld);
        System.out.println("Color: " + color );
        System.out.println("It is " + isEdible + " that the plant is edible");
    }


}
