package stringmanipulation.sherlockvalidstring;

import java.util.*;

public class SherlockValidString {

    public String isValid(String s) {
        // Write your code here
        HashMap<String, Integer> counterMap = new HashMap<>();
        char arr[] = s.toCharArray();
        for(int i = 0; i<arr.length; i++ ){
            char letter = arr[i];
            String letterStr = String.valueOf(letter);
            Integer counter = counterMap.get(letterStr);
            if (counter != null){
                counter++;
            } else {
                counter=0;
            }
            counterMap.put(letterStr, counter);
        }

        HashSet<Integer> counterSet = new HashSet<>();
        counterMap.forEach( (key, value) -> {
                counterSet.add(value);
            }
        );

        if (counterSet.size() > 2){
            return  "NO";
        } else {
            Integer counterArr[] = new Integer[2];
            counterSet.toArray(counterArr);
            if ( (counterArr[0] -1 == counterArr[1]) || (counterArr[1]-1 == counterArr[0])  ){
                return  "YES";
            }
        }
        return  "NO";



    }
}
