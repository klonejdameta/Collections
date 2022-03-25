package ArrayListExample.SwapTwoElements14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SwapElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(9);
        numbers.add(15);
        System.out.println("Elements before swap "+numbers);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index i : ");
        int i = sc.nextInt();
        System.out.print("Enter index j : ");
        int j = sc.nextInt();
        Collections.swap(numbers, i, j);//using the swap() method
        System.out.println("List after swapping: "+numbers);
        sc.close();

    }
}
