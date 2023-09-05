package rotateleft;

import java.util.ArrayList;
import java.util.List;

public class RotateLeft {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int size = a.size();
        if (d < size){
          return performRotation(a,d,size);
        } else if (d % size > 0){
            int mod = d % size;
            return performRotation(a,mod,size);
        } else { // if (d == size || (d % size == 0) ) {
            return a;
        }
    }

    private static List<Integer> performRotation(List<Integer> originalList, int factor, int size){
        List<Integer> rotatedList = new ArrayList<>(size);
        for (int i = factor; i < size; i++) {
            rotatedList.add(originalList.get(i));
        }
        for (int i = 0; i < factor; i++) {
            rotatedList.add(originalList.get(i));
        }
        return rotatedList;
    }
}
