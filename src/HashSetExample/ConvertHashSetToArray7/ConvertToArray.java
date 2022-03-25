package HashSetExample.ConvertHashSetToArray7;

import java.util.HashSet;

public class ConvertToArray {
    public static void main(String[] args) {
        HashSet<String> val = new HashSet<>();
        val.add("Val1");
        val.add("Val2");
        val.add("Val3");
        val.add("Val4");
        val.add("Val5");
        System.out.println("HashSet Elements " + val + "\n");
        String [] array = new String[val.size()];//inicialize an array with the same number of elements as Set
        val.toArray(array);//return array with all elements of Set
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
