package LinkedLearning;

import java.util.ArrayList;

public class Cooking {
        private ArrayList<String> cookingResources;

        //constructor
        public Cooking(ArrayList<String> data) {
            this.cookingResources = data;
        }

        @Override
        public String toString() {
            return cookingResources.toString();
        }

        //getter
        public ArrayList<String> getCookingResources(String url) {
            return this.cookingResources;
        }

        /**
         * prints out the resources in the array list
         */
        public void printCookingSources() {
            for (int i = 0; i < cookingResources.size(); i++) {
                System.out.println(cookingResources.get(i));
            }
        }

}

