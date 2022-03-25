package ArrayListExample.SearchAnElement7;

import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Purple");
        colors.add("Red");
        colors.add("Brown");

        if( colors.contains("Blue")){
            System.out.println("The list contains Blue");
        }
        System.out.println(colors);
    }
}
