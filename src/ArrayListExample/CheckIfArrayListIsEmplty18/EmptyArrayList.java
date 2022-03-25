package ArrayListExample.CheckIfArrayListIsEmplty18;

import java.util.ArrayList;

public class EmptyArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Red");

        System.out.println(colors.isEmpty());//check if is empty turns true or false

    }
}
