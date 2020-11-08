package LinkedLearning;

import java.util.ArrayList;

public class Java {
    private ArrayList<String> compSciResources;

    //constructor
    public Java(ArrayList<String> data) {
        this.compSciResources = data;
    }

    @Override
    public String toString() {
        return compSciResources.toString();
    }

    //getter
    public ArrayList<String> getCompSciResources(String url) {
        return this.compSciResources;
    }

    /**
     * prints out the resources in the array list
     */
    public void printCompSciSources() {
        for (int i = 0; i < compSciResources.size(); i++) {
            System.out.println(compSciResources.get(i));
        }
    }

}
