package ArrayListExample.ReplaceElementInArrayList21;

import java.util.ArrayList;

public class ReplaceSpecificElement {
    public static void main(String[] args) {
        ArrayList carType = new ArrayList();
        carType.add("Audi");
        carType.add("BMW");
        carType.add("Lamborgini");
        carType.add("RangeRover");

        System.out.println("List before replacing the second element " + carType);

        String newType = "Ford";
        carType.set(2, newType);

        System.out.println("List after replacing the second element " + carType);
    }
}
