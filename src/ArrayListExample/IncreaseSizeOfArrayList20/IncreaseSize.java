package ArrayListExample.IncreaseSizeOfArrayList20;

import java.util.ArrayList;

public class IncreaseSize {
    public static void main(String[] args) {
        ArrayList<String> carType = new ArrayList<>();
        carType.add("Audi");
        carType.add("BMW");
        carType.add("Lamborgini");
        carType.add("RangeRover");
        System.out.println("List before increasing the size " + carType);

        carType.ensureCapacity(7);//default size of ArrayList in Java is 10,ensureCapacity() method increase the size of an ArrayList

        carType.add("Ford");
        carType.add("Audi");
        carType.add("BMW");

        System.out.println("List after increasing the size " + carType);
    }
}
