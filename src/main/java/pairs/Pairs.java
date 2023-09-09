package pairs;

import java.util.List;

public class Pairs {

    public int pairs(int k, List<Integer> arr) {
        int pairCounter=0;
        int current;
        int next;
        for(int i=0; i < arr.size()-1; i++){
            current = arr.get(i);
            for(int j=i+1; j < arr.size(); j++){
                next = arr.get(j);
                if(Math.abs(current-next) == k ){
                    pairCounter++;
                }
            }
        }
        return pairCounter;
    }
}
