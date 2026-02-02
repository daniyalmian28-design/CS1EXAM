public class Greenhouse {
    String name;
    boolean sprinklersOn;
    int numberOfFlowers;
    int randomInt;
    double randomNum;
    int x;
    int g;




    public Greenhouse(){
        System.out.println("Hello World! Good luck on your exams!");
        String name = "Planting Paramaters at the CSG";
        boolean sprinklersOn = true;
        int numberOfFlowers = 31;

        System.out.println("Welcome to " + name + "! It is " + sprinklersOn + " that we are watering plants right now. We have " + numberOfFlowers + " flowers!");

        numberOfFlowers = 4000;

        System.out.println("Welcome to " + name + "! It is " + sprinklersOn + " that we are watering plants right now. We have " + numberOfFlowers + " flowers!");

        Plant Kimplant = new Plant(3,"orange",true);
        System.out.println(Kimplant);

        Plant myPlant = new Plant(5, "red", false);
        System.out.println(myPlant);



    }



    public static void main(String[] args) {
        Greenhouse greenhouse = new Greenhouse();

        greenhouse.randomReplant();
        greenhouse.veggieOfTheDay( "cucumber");
        greenhouse.countFlowers();
        greenhouse.changeTemperature();
        greenhouse.starTriangle();
        greenhouse.perimeterTriangle();




    }





    public void randomReplant(){
        randomInt = (int) (Math.random()*16);
        System.out.println("we are replanting " + randomInt + " vegetables today!");

    }

    public void veggieOfTheDay(String veggie){
        System.out.println("Today's chosen veggie is " + veggie + "!");

    }

    public void countFlowers(){
        for (int i = 2; i<=6; i=i+1) {
            System.out.println(i);
        }
        for (int i = 20; i<=110; i=i+30) {
            System.out.println(i);
        }
        for (int i = 8; i>=0; i=i-1) {
            System.out.println(i);
        }

    }

    public void changeTemperature(){
        double randomNum = (double) Math.random()*.9999999;
        if (randomNum<.25){
            System.out.println("The temperature has decreased by 2 degrees.");
        }
        else if (randomNum>.25 && randomNum<.5){
            System.out.println("The temperature has decreased by 1 degree");
        }
        else if (randomNum>.5 && randomNum<.75){
            System.out.println("The temperature has increased by 1 degree");
        }
        else if (randomNum>.75 && randomNum<1){
            System.out.println("The temperature has increased by 2 degrees");
        }

    }

    public void starTriangle(){
        int x = (int) (Math.random()*5);

        if (x==1) {
            System.out.print("* ");
        }

        else if (x==2){
            System.out.print("* ");
            System.out.println(" ");
            System.out.print("** ");
        }



        else if (x == 3) {
            System.out.print("* ");
            System.out.println(" ");
            System.out.print("** ");
            System.out.println(" ");
            System.out.print("*** ");
        }

        else if(x == 4) {
            System.out.print("* ");
            System.out.println(" ");
            System.out.print("** ");
            System.out.println(" ");
            System.out.print("*** ");
            System.out.println(" ");
            System.out.print("**** ");
        }

        else if(x == 5) {
            System.out.print("* ");
            System.out.println(" ");
            System.out.print("** ");
            System.out.println(" ");
            System.out.print("*** ");
            System.out.println(" ");
            System.out.print("**** ");
            System.out.println(" ");
            System.out.print("***** ");
        }



    }

    public void perimeterTriangle(){
        int g = (int) (Math.random()*5);

        System.out.println("     ");

        if (g==1) {
            System.out.print("- ");
        }

        else if (g==2){
            System.out.print("- ");
            System.out.println(" ");
            System.out.print("-- ");
        }



        else if (g == 3) {
            System.out.print("- ");
            System.out.println(" ");
            System.out.print("-- ");
            System.out.println(" ");
            System.out.print("--- ");
        }

        else if(g == 4) {
            System.out.print("- ");
            System.out.println(" ");
            System.out.print("-- ");
            System.out.println(" ");
            System.out.print("-*- ");
            System.out.println(" ");
            System.out.print("---- ");
        }

        else if(g == 5) {
            System.out.print("- ");
            System.out.println(" ");
            System.out.print("-- ");
            System.out.println(" ");
            System.out.print("-*- ");
            System.out.println(" ");
            System.out.print("-**- ");
            System.out.println(" ");
            System.out.print("-----");
        }





    }

}

