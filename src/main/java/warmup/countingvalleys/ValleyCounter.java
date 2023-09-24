package warmup.countingvalleys;

public class ValleyCounter {


    public static int countingValleys(int steps, String path) {
        var pathChar = path.toCharArray();
        int seaLevel = 0;
        int valleyCounter = 0;
        boolean isComingFromBelowSeaLevel = false;

        for(int i = 0; i < steps; i++){

            if (seaLevel < 0 ){
                isComingFromBelowSeaLevel = true;
            }

            if (pathChar[i] == 'U'){
                seaLevel++;
                if (seaLevel == 0 && isComingFromBelowSeaLevel){
                   valleyCounter++;
                   isComingFromBelowSeaLevel = false;
                }
            } else {
                seaLevel--;
            }
        }
        return valleyCounter;
    }
}
