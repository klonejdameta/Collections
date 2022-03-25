package HashSetExample.ConvertHashSetToArrayList9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertToArrayList {
    public static void main(String[] args) {
        Set<String> col = new HashSet<>();
        col.add("Purple");
        col.add("Green");
        col.add("Black");
        col.add("Red");
        System.out.println("Elements of Set "+ col +"\n");

        List<String> list = new ArrayList<>(col);
        System.out.println("List elements are "+ list + "\n");
        list.addAll(2,col);
        System.out.println(list);//this method adds all Set elements at index 2 of List
    }
}
