package sorting.toysbudget;

import java.util.Arrays;
import java.util.List;

public class Markstoys {

    public  int maximumToys(List<Integer> prices, int k) {
        // Convert List into array, sort array ascending
        Integer arr[] = new Integer[prices.size()];
        arr = prices.toArray(arr);
        Arrays.sort(arr);

        int wallet = k;
        int toysCounter = 0;

        // Iterates the prices array until the budget is finished and return count
        for(int i=0; i < arr.length -1; i++){
           wallet = wallet - arr[i];
           if (wallet >= 0){
                toysCounter++;
           } else {
               break;
           }
        }

        return toysCounter;
    }



}
