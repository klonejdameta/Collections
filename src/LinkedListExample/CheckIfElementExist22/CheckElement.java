package LinkedListExample.CheckIfElementExist22;

import java.util.LinkedList;

public class CheckElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(19);

        boolean exist=list.contains(19);
        if (exist){
            System.out.println("Element exist in list "+"\n");

        }else {
            System.out.println("Elements do not exist in list ");
        }
    }
}
