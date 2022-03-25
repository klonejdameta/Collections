package ArrayListExample.PrintElementByIndex22;

import java.util.ArrayList;

public class PrintElementByIndex {
    public static void main() {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        for (int i = 0; i < num.size(); i++) {
              num.get(i);
            System.out.println("Printing elements by index "+num);
        }
    }
}
