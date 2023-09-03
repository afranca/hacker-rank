package jumpingonclouds;

import java.util.List;

public class JumpingOnClouds {

    public static int jumpingOnClouds(List<Integer> c) {
        Integer clouds[] = new Integer[c.size()];
        clouds = c.toArray(clouds);
        int jumpCounter = 0;
        int lastIndex = clouds.length-1;

        for(int i=0; i<lastIndex; i++){
            if((i+2) <= lastIndex && clouds[i+2] == 0 ) {
                i++;
                //jumpCounter++;
            } else if((i+1) <= lastIndex && clouds[i+1] == 0 )  {
                //do nothing
                //jumpCounter++;
            }
            jumpCounter++;
        }
        return jumpCounter;
    }
}
