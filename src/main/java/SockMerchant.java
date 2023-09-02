import java.util.ArrayList;
import java.util.List;

public class SockMerchant {

    public int solve(int n, List<Integer> colorList){
        int sockMatchCount = 0;
        int index = 0;
        List<Integer> indicesAlreadyMatched = new ArrayList<>();

        while(index < colorList.size()){
            if (!indicesAlreadyMatched.contains(index)) {
                var leftPair = colorList.get(index);
                boolean match = false;
                int index2 = index;
                while (!match && index2 < colorList.size()-1) {
                    index2++;
                    if (!indicesAlreadyMatched.contains(index2)) {
                        var rightPair = colorList.get(index2);
                        if (leftPair.equals(rightPair)) {
                            indicesAlreadyMatched.add(index);
                            indicesAlreadyMatched.add(index2);
                            sockMatchCount++;
                            match = true;
                        }
                    }
                }
            }
            index++;
        }
        return sockMatchCount;
    }



}
