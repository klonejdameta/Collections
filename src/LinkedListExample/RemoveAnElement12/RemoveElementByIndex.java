package LinkedListExample.RemoveAnElement12;

import java.util.LinkedList;

public class RemoveElementByIndex {
    public static void main(String[] args) {

        LinkedList<String> lang = new LinkedList<>();
        lang.add("Sql");
        lang.add("Java");
        lang.add(".Net");
        lang.add("Angular");
        lang.add("Python");
        lang.add("R");

        lang.remove(2);//removes element at index 1
        lang.removeFirst();//removes first element of list
        lang.removeLast();//removes lalst element of list
        System.out.println("Elements of lis are "+lang);
    }
}
