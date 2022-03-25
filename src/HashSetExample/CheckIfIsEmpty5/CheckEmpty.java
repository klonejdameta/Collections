package HashSetExample.CheckIfIsEmpty5;

import java.util.HashSet;

public class CheckEmpty {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(2);
        num.add(4);
        num.add(8);
        num.add(10);

        boolean empty = num.isEmpty();
        if (empty){
            System.out.println("List is empty");
        }else {
            System.out.println("List is not empty "+num);
        }
    }
}
