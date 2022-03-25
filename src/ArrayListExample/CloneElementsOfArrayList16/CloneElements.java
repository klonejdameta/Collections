package ArrayListExample.CloneElementsOfArrayList16;

import java.util.ArrayList;
import java.util.Collections;

public class CloneElements {
    public static void main(String[] args) {
        ArrayList<String> colors1 = new ArrayList<>();
        colors1.add("BLue");
        colors1.add("Yellow");
        colors1.add("Orange");
        colors1.add("Red");
        System.out.println("Elements of first list "+colors1);

        System.out.println(colors1.clone());
    }
}
