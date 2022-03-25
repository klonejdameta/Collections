package ArrayListExample.AddElementsToArrayList1;

import java.util.ArrayList;

public class AddElements {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Red");//we can have dublicate elements

        for (int i = 0; i < colors.size(); i++) {
           colors.get(i); //Fill list with elements
        }
        System.out.println("Values are "+ colors);//pritn values in a list in the same order that were inputed


    }

}
