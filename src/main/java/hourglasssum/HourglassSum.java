package hourglasssum;

import java.util.ArrayList;
import java.util.List;

public class HourglassSum {

    public int hourglassSum(List<List<Integer>> arr) {
        // Write your code here

        List<Integer> sums = new ArrayList<>();

        for(int i=0; i<4; i++){

            var row1 = arr.get(i);
            var row2 = arr.get(i+1);
            var row3 = arr.get(i+2);

            for(int j=0; j<4; j++){
                int a = row1.get(j);
                int b = row1.get(j+1);
                int c = row1.get(j+2);

                int d = row2.get(j+1);

                int e = row3.get(j);
                int f = row3.get(j+1);
                int g = row3.get(j+2);

                int result = a+b+c+d+e+f+g;
                //System.out.println("Result["+i+"]["+j+"]:" +result);
                sums.add(result);
            }
        }

        var ret = sums.stream()
                                .mapToInt(value -> value)
                                .max();

        if (ret.isPresent()) {
            return ret.getAsInt();
        }
        return 0;
    }
}
