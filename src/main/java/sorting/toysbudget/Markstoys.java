package sorting.toysbudget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Markstoys {

    public  int maximumToys(List<Integer> prices, int k) {
        int wallet = k;
        int maxToysCounter=0;

        // Create List into array, sort array ascending
        Integer arr[] = new Integer[prices.size()];
        arr = prices.toArray(arr);
        Arrays.sort(arr);

        for(int i=0; i < arr.length -1; i++){
            int toysCounter = 0;
            for(int j=i; j < arr.length -1; j++){
                   wallet = wallet - arr[j];
                   if (wallet >= 0){
                        toysCounter++;
                   }
            }
            if (toysCounter > maxToysCounter){
                maxToysCounter = toysCounter;
            }
        }

        return maxToysCounter;
    }

}
