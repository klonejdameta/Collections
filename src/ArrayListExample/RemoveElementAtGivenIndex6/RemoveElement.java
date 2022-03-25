package ArrayListExample.RemoveElementAtGivenIndex6;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Red");//we can have dublicate elements

        colors.remove(2);
        System.out.println(colors);
    }
}
