package LinkedLearning;

public class LinkedLearning {
    private Java java;
    private Chemistry chem;
    private Math math;
    private Cooking cooking;

    //constructor
    public LinkedLearning(Java java, Chemistry chem, Math math, Cooking cooking) {
        this.java = java;
        this.chem = chem;
        this.math = math;
        this.cooking = cooking;
    }

    /**
     * prints out the data for whichever option is chosen
     * @param num
     */
    public boolean options(String num) {

            if (num.equalsIgnoreCase("chemistry")){
                System.out.println("\n");
                this.chem.printChemSources();
                return true;

            } else if (num.equalsIgnoreCase("Java")) {

                System.out.println("\n");
                this.java.printCompSciSources();
                return true;

            } else if (num.equalsIgnoreCase("Math")) {

                System.out.println("\n");
                this.math.printMathResources();
                return true;
            } else if (num.equalsIgnoreCase("Cooking")) {
                System.out.println("\n");
                this.cooking.printCookingSources();
                return true;
            }
        return false;
    }









}
