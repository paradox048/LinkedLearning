package LinkedLearning;

import java.util.ArrayList;

public class Math {
    private ArrayList<String> mathResources;

    //constructor
    public Math(ArrayList<String> data) {
        this.mathResources = data;
    }

    //getter
    public ArrayList<String> getMathResources() {
        return mathResources;
    }

    @Override
    public String toString() {
        return mathResources.toString();
    }

    /**
     * Prints out the available Math resources
     */
    public void printMathResources() {
        for (int i = 0; i < mathResources.size(); i++) {
            System.out.println(mathResources.get(i));
        }
    }
}
