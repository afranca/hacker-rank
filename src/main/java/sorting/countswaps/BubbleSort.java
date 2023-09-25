package sorting.countswaps;

import java.sql.SQLOutput;
import java.util.List;

public class BubbleSort {

    public void countSwaps(List<Integer> a) {
        Integer array[] = new Integer[a.size()];
        array = a.toArray(array);
        int n  = array.length;

        int numberOfSwaps = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    numberOfSwaps++;
                }
            }
        }

        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
        System.out.println("First Element: "+array[0]);
        System.out.println("Last Element: "+array[array.length-1]);

        //return numberOfSwaps;

    }

}
