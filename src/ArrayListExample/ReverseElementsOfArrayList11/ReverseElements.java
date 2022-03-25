package ArrayListExample.ReverseElementsOfArrayList11;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseElements {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Pink");
        colors.add("Purple");

        Collections.reverse(colors);
        System.out.println(colors);
    }
}
