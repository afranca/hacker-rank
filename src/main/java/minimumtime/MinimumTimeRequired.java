package minimumtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumTimeRequired {

    public long minTime(long[] machines, long goal) {
        long itemCount=0;
        long dayCount=0;
        while(itemCount!=goal){
            dayCount++;
            for(int i=0;i<machines.length;i++){
                long current = machines[i];
                long rest = dayCount % current;
                if (rest == 0){
                    itemCount++;

                }
            }
        }
        return dayCount;
    }


    public long minTimeBinary(long[] machines, long goal) {
        Arrays.sort(machines); // Sort the machines in ascending order
        long left = 1; // Minimum time required
        long right = machines[machines.length - 1] * goal; // Maximum time required

        while (left < right) {
            long mid = (left + right) / 2; // Calculate the mid-point

            long itemsProduced = 0;
            for (int i = 0; i < machines.length; i++) {
                itemsProduced += mid / machines[i]; // Calculate items produced by each machine at time 'mid'
            }

            if (itemsProduced < goal) {
                left = mid + 1; // Adjust the left bound
            } else {
                right = mid; // Adjust the right bound
            }
        }

        return left; // 'left' will be the minimum time required
    }

    public long minTimeBinaryArrays(long[] machines, long goal) {
        Arrays.sort(machines); // Sort the machines in ascending order
        long right = machines[machines.length - 1] * goal; // Maximum time required

        int[] days = new int[(int)right];
        for(int i=0;i<right;i++){
            days[i]=i+1;
        }

        System.out.println(Arrays.binarySearch(days, (int) goal));
        int index = Arrays.binarySearch(days, (int) goal);

        return days[index]; // 'left' will be the minimum time required
    }

}

