package stringmanipulation.makinganagrams;

import java.util.Hashtable;

public class Anagrams {

    public int makeAnagram(String a, String b) {

        int counterA = 0;
        char[] arrayA = a.toCharArray();
        Hashtable<String, Integer> hashtableA = new Hashtable<>();

        int counterB = 0;
        char[] arrayB = b.toCharArray();
        Hashtable<String, Integer> hashtableB = new Hashtable<>();

        // Hashtable for quick lookup
        for (char letter : arrayB) {
            String letterString = Character.toString(letter);
            int counter = hashtableB.get(letterString) != null ? hashtableB.get(letterString)+1 : 1;
            hashtableB.put(letterString,counter);
        }
        // Lookup A chars in B table
        for(char letter : arrayA){
            String letterString = Character.toString(letter);
            if (hashtableB.get(letterString) == null || hashtableB.get(letterString) < 1){
                counterA++;
            } else {
                Integer letterCounter = hashtableB.get(letterString);
                hashtableB.put(letterString,--letterCounter);
            }
        }


        // Hashtable for quick lookup
        for (char letter : arrayA) {
            String letterString = Character.toString(letter);
            int counter = hashtableA.get(letterString) != null ? hashtableA.get(letterString)+1 : 1;
            hashtableA.put(letterString,counter);
        }
        // Lookup B chars in A table
        for(char letter : arrayB){
            String letterString = Character.toString(letter);
            if (hashtableA.get(letterString) == null || hashtableA.get(letterString) < 1){
                counterB++;
            }else {
                Integer letterCounter = hashtableA.get(letterString);
                hashtableA.put(letterString,--letterCounter);
            }
        }


        // Write your code here
        return counterA+counterB;
    }


}
