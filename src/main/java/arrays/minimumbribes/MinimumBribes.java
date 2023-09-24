package arrays.minimumbribes;

import java.util.List;

public class MinimumBribes {

    public int minimumBribes(List<Integer> q) {
        // Write your code here
        //q = List.of(1,2,5,3,4);
        //q = List.of(1,2,3,5,4);   i=3   |  size()-2 = 3
        int bribeCounter = 0;

        for(int i=0; i < q.size()-1; i++){
            int current = q.get(i);
            int next = q.get(i+1);

            if (current > next){
                bribeCounter++;
                if (i < q.size()-2){
                    int nextNext = q.get(i+2);
                    if (current > nextNext){
                        bribeCounter++;
                    }
                }
            } else if (i < q.size()-2){
                int nextNext = q.get(i+2);
                if (current > nextNext){
                    bribeCounter++;
                }
            }
        }
        //System.out.println("No of Bribes: "+ bribeCounter);
        return bribeCounter;
    }

}
