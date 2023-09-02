import java.util.ArrayList;
import java.util.List;

public class SockMerchant {

    public int solve(int numberOfSocks, List<Integer> colorList){
        int sockMatchCount = 0;
        int index = 0;
        List<Integer> indicesAlreadyMatched = new ArrayList<>();

        while(index < numberOfSocks-1){
            if (!indicesAlreadyMatched.contains(index)) {
                var leftPair = colorList.get(index);
                boolean match = false;
                int index2 = index+1;
                do {
                    if (!indicesAlreadyMatched.contains(index2)) {
                        var rightPair = colorList.get(index2);
                        if (leftPair.equals(rightPair)) {
                            indicesAlreadyMatched.add(index);
                            indicesAlreadyMatched.add(index2);
                            sockMatchCount++;
                            match = true;
                        }
                    }
                    index2++;
                } while (!match && index2 < numberOfSocks);
            }
            index++;
        }
        return sockMatchCount;
    }

}
