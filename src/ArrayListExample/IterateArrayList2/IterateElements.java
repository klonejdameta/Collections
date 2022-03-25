package ArrayListExample.IterateArrayList2;

import java.util.ArrayList;

public class IterateElements {
    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<>(5);//ky kufzim nuk lejon qe elementet te kene
                                                                    //vlere me te madhe se 5 dhe duhet te kemi 4 elemente mqs
                                                                    //bredhja fillon nga 0
        values.add(0,1);
        values.add(1,1);
        values.add(2,2);
        values.add(3,3);
        values.add(4,4);

        for (Integer i: values) {
            values.get(i);
        }
        System.out.println(values);
    }
}
