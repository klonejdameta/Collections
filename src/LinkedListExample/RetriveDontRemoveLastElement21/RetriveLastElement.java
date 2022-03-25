package LinkedListExample.RetriveDontRemoveLastElement21;

import java.util.LinkedList;

public class RetriveLastElement {
    public static void main(String[] args) {
        LinkedList<String> val = new LinkedList<>();
        val.add(0,"One");
        val.add(1,"Two");
        val.add(2,"Three");
        val.add(3,"Four");
        val.add(4,"Five");
        val.add(5,"Six");
        System.out.println("Original list "+val+ "\n");
        System.out.println( "Last element of list: "+val.peekLast() +"\n");//retrive last element but dont remove it
        System.out.println("List after uring peekLast() method  "+val +"\n");
        System.out.println("Retrive last element and removes it from list: "+val.pollLast() + "\n");//removes last element
        System.out.println("List after using pollLast() method "+val);
    }
}
