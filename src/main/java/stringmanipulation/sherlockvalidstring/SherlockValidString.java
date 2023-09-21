package stringmanipulation.sherlockvalidstring;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SherlockValidString {

    public String isValid(String s) {
        // Create Hash with counts of all letters
        HashMap<String, Integer> fullCounterMap = new HashMap<>();
        char arr[] = s.toCharArray();
        for(int i = 0; i<arr.length; i++ ){
            char letter = arr[i];
            String letterStr = String.valueOf(letter);
            Integer counter = fullCounterMap.get(letterStr);
            if (counter != null){
                counter++;
            } else {
                counter=1;
            }
            fullCounterMap.put(letterStr, counter);
        }

        // Create Hash with counts of letter occurrences
        HashMap<Integer, Integer> aggregatedCounterMap = new HashMap<>();
        fullCounterMap.forEach( (fullKey, aggregatedKey) -> {
                Integer aggregatedValue = aggregatedCounterMap.get(aggregatedKey);
                if (aggregatedValue == null){
                    aggregatedCounterMap.put(aggregatedKey, 1);
                } else {
                    aggregatedCounterMap.put(aggregatedKey, ++aggregatedValue);
                }
            }
        );

        // If there is only 0ne, it's already a valid string
        if (aggregatedCounterMap.size() == 1){
            return  "YES";
        }

        // If there are more than 2 counters, bail out
        if (aggregatedCounterMap.size() > 2){
            return  "NO";
        }


        // Iterate through aggregated Map
        Integer keys[] = new Integer[2];
        Integer values[] = new Integer[2];
        AtomicInteger counter = new AtomicInteger(0);

        aggregatedCounterMap.forEach( (key, value) -> {
            keys[counter.get()] = key;
            values[counter.get()] = value;
            counter.incrementAndGet();
        });

        // Deciding which occurrence is bigger and subtract them (bigger - smaller)
        if (keys[0] > keys[1]){
            // Then find out if difference of the number of repetitions equals to 1
            if (keys[0] - keys[1] == 1){
                // Then find out if one occurred only once
                if (values[0] == 1 || values[1] == 1){
                    return "YES";
                }
            } else {
                return "NO";
            }

        } else if (keys[1] > keys[0]){
            if (keys[1] - keys[0] == 1){
                if (values[1] == 1 || values[0] == 1){
                    return  "YES";
                }
            } else {
                return "NO";
            }
        }
        return "NO";
    }

    public String isValid2(String s) {
        // Create a frequency map of characters in the string
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Create a frequency map of frequencies
        Map<Integer, Integer> frequencyCount = new HashMap<>();
        for (int freq : charFrequency.values()) {
            frequencyCount.put(freq, frequencyCount.getOrDefault(freq, 0) + 1);
        }

        // If there is only one distinct frequency, it's already valid
        if (frequencyCount.size() == 1) {
            return "YES";
        }

        // If there are two distinct frequencies, check if it's possible to remove one character
        if (frequencyCount.size() == 2) {
            int freq1 = -1, freq2 = -1;
            for (int freq : frequencyCount.keySet()) {
                if (freq1 == -1) {
                    freq1 = freq;
                } else {
                    freq2 = freq;
                }
            }

            // Check if one of the frequencies occurs only once and can be removed
            if ((Math.abs(freq1 - freq2) == 1 && (frequencyCount.get(freq1) == 1 || frequencyCount.get(freq2) == 1))
                    || (freq1 == 1 && frequencyCount.get(freq1) == 1)
                    || (freq2 == 1 && frequencyCount.get(freq2) == 1)) {
                return "YES";
            }
        }

        // If none of the conditions are met, it's not possible to make it valid
        return "NO";
    }

}
