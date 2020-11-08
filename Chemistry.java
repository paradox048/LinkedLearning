package LinkedLearning;

import java.util.ArrayList;

public class Chemistry {
    private ArrayList<String> chemResources;

    public Chemistry (ArrayList<String> data) {
        this.chemResources = data;
    }

    @Override
    public String toString() {
        return chemResources.toString();
    }

    //getter
    public ArrayList<String> getChemResources(String url) {
        return this.chemResources;
    }

    /**
     * prints out the contents of the array list
     */
    public void printChemSources() {
        for (int i = 0; i < chemResources.size(); i++) {
            System.out.println(chemResources.get(i));
        }
    }


}
