package pairs;

import java.util.ArrayList;
import java.util.List;

public class Pairs {

    public static int counter=0;

    public static synchronized void increment(){
        counter++;
    }

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

    public int pairsThread(int k, List<Integer> arr) {
        // To store ref to all threads
        List<Thread> threads = new ArrayList<>();

        for(int i=0; i < arr.size()-1; i++){
            final int currentIndex = i;
            // Create new thread
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int current;
                    int next;

                    current = arr.get(currentIndex);
                    for(int j=currentIndex+1; j < arr.size(); j++){
                        next = arr.get(j);
                        if(Math.abs(current-next) == k ){
                            increment();;
                        }
                    }
                }
            });
            // Start thread and store its ref
            thread.start();
            threads.add(thread);
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return counter;
    }
}
