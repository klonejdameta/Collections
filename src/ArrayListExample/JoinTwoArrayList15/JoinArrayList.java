package ArrayListExample.JoinTwoArrayList15;

import java.util.ArrayList;

public class JoinArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors1 = new ArrayList<>();
        colors1.add("BLue");
        colors1.add("Yellow");
        colors1.add("Orange");
        colors1.add("Red");
        System.out.println("Elements of first list "+colors1);

        ArrayList<String> colors2 = new ArrayList<>();
        colors2.add("Purple");
        colors2.add("Green");
        colors2.add("Pink");
        System.out.println("Elements of second list "+colors2);

        ArrayList<String> rainbow = new ArrayList<>();
        rainbow.addAll(colors1);
        rainbow.addAll(colors2);
        System.out.println("Elements of joining lists " +rainbow);
    }
}
