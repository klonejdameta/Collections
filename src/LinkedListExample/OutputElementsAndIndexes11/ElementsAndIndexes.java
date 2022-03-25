package LinkedListExample.OutputElementsAndIndexes11;

import java.util.LinkedList;

public class ElementsAndIndexes {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Ann");
        names.add("Enn");
        names.add("John");
        names.add("Erika");
        names.add("Chloe");
        names.add("Sam");

        for (int i = 0; i <names.size(); i++) {
            System.out.println( "Elements and indexes are " + i + " " + names.get(i) );
        }

    }
}
