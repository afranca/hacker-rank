package minimumtime;

public class MinimumTimeRequired {

    public long minTime(long[] machines, long goal) {
        long itemCount=0;
        long dayCount=0;
        System.out.println("Day  Count:"+dayCount);
        System.out.println("Item Count:"+itemCount);
        System.out.println("* * * * * * * * * * * * * * * ");
        System.out.println("");
        while(itemCount!=goal){
            dayCount++;
            for(int i=0;i<machines.length;i++){
                long current = machines[i];
                long rest = dayCount % current;
                if (rest == 0){
                    itemCount++;
                    System.out.println("Day  Count:"+dayCount);
                    System.out.println("Item Count:"+itemCount);
                    System.out.println("Goal Count:"+goal);
                    System.out.println("* * * * * * * * * * * * * * * ");
                    System.out.println("");
                }
            }
        }
        return dayCount;
    }
}

/*
        long fastestMachine = machines[0];
        for(int i=1;i<machines.length;i++){
            long current = machines[i];
            if (current < fastestMachine){
                fastestMachine = current;
            }
        }
 */
