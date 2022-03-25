package ArrayListExample.AddElementAtFirstPostition3;

import java.util.ArrayList;

public class AddInFirstPosition {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add(0,"Apple");
        fruits.add(1,"Pineapple");
        fruits.add(2,"Watermelon");

        for (int i = 0; i < fruits.size(); i++) {
            fruits.get(i);
        }
        System.out.println("Values at first postiton is " + fruits.get(0));
    }
}
