package rotateleft;

import java.util.ArrayList;
import java.util.List;

public class RotateLeft {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> resultTemp;

        for(int numberToRotate=0; numberToRotate<d; numberToRotate++){
            var itemToRotate = a.get(0);
            resultTemp = new ArrayList<>();
            for(int s=1; s < a.size(); s++){
                resultTemp.add(a.get(s));
            }
            resultTemp.add(itemToRotate);
            a = resultTemp;
        }
        return  a;
    }
}
