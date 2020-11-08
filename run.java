package LinkedLearning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class run {
    public static Scanner scan;

    public static void main(String[] args){
        LinkedLearning lL = null;
        boolean flag = true;

        try {
            //reads chem data from txt file
            //stores it in arraylist
            ArrayList<String> chemData = returnArrayListOfData("src/LinkedLearning/chemLinkedLearning.txt");
            Chemistry chem = new Chemistry(chemData);

            //reads Java data from txt file
            ArrayList<String> javaData = returnArrayListOfData("src/LinkedLearning/JavaLinkedLearning.txt");
            Java java = new Java(javaData);

            //reads Math data from txt file
            ArrayList<String> mathData = returnArrayListOfData("src/LinkedLearning/MathLinkedLearning.txt");
            Math math = new Math(mathData);

            //reads Cooking data from txt file
            ArrayList<String> cookingData =returnArrayListOfData("src/LinkedLearning/CookingLinkedLearning.txt");
            Cooking cooking = new Cooking((cookingData));

            lL = new LinkedLearning(java, chem, math, cooking);

        } catch (FileNotFoundException e) {
            flag = false;
        }

        if (flag == false) {
            System.out.println("File Not found");
        } else {

            boolean stay = true;
            while (stay) {
                scan = new Scanner(System.in);
                printMenu();

                String input = scan.next();
                //checks if the input is exit and exits the program if it is
                if (input.equalsIgnoreCase("exit")){
                    stay = false;
                    System.out.println("Goodbye!");

                    //if the input is correct print out the input and print out a message
                } else if (lL.options(input)) {
                    System.out.println("\ntype any input to return to the menu");
                    String returnToMenu = scan.next();

                    //prints spaces
                    printSpace();
                } else {
                    System.out.println("\n");
                }
            }

        }
    }

    /**
     * Prints out the options for the menu
     */
    public static void printMenu() {
        System.out.println("Welcome To the Linked Learning Program...\n"
                + "Please Choose a pathway to follow\n"
                + "\n1. Chemistry\n"
                + "2. Java\n"
                + "3. Math\n"
                + "4. Cooking\n"
                + "\nPlease enter the subject below\n"
                + "- Input exit to leave the program - \n"

        );
    }

    /**
     * prints out the 20 newline spaces
     */
    public static void printSpace() {
        for (int i = 0; i < 20; i++) {
            System.out.println("\n");
        }
    }

    /**
     * this method returns an array list with data read from the location of a txt file
     * @param url   location of Txt file
     * @return      Array list that contains String values
     * @throws FileNotFoundException
     */
    public static ArrayList<String> returnArrayListOfData(String url) throws FileNotFoundException {
        scan = new Scanner(new File(url));
        ArrayList<String> chemData = new ArrayList<>();
        while (scan.hasNext()) {
            chemData.add(scan.nextLine());
        }
        scan.close();
        return chemData;
    }
}
