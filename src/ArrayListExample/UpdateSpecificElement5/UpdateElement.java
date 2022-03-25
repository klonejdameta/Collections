package ArrayListExample.UpdateSpecificElement5;

import java.util.ArrayList;

public class UpdateElement {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add(0,"Apple");
        fruits.add(1,"Pineapple");
        fruits.add(2,"Watermelon");

        fruits.set(0,"Orange");
        System.out.println(fruits);
    }
}
