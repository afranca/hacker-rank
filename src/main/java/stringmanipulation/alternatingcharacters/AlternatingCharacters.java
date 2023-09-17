package stringmanipulation.alternatingcharacters;

public class AlternatingCharacters {

    public int alternatingCharacters(String s) {

        char arr[] = s.toCharArray();
        int repeatedLetters = 0;
        int jump = 0;
        for (int i=0; i< arr.length; i=i+1+jump){
            jump = 0;
            char letter  = arr[i];
            for (int j=i+1; j<arr.length; j++){
                char nextLetter = arr[j];
                if (letter != nextLetter){
                    break;
                }
                repeatedLetters++;
                jump++;
            }
        }
        return repeatedLetters;
    }
}
