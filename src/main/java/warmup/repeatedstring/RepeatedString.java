package warmup.repeatedstring;

public class RepeatedString {

    public long repeatedString(String s, long n) {
        long result = 0;
        long stringLength = s.length();
        if (stringLength >= n){
            // easy case:  string is longer than n
            var substring = s.substring(0,(int)n);
            result = getCount(substring);
        } else {
            // complex case: string is shorter than n
            // find number of time string needs to be repeated
            long fullRepeatedTimes = n / stringLength;
            // find number of chars of last repetition
            int incompleteRepetition = (int) (n % stringLength);
            // count whole repetitions
            long count = getCount(s);
            result = count * fullRepeatedTimes;
            // If last repetition is incomplete, only consider fewer the relevant chars
            if (incompleteRepetition > 0){
                var substrIncompleteCount = s.substring(0, incompleteRepetition);
                long incompleteSubstrCount = getCount(substrIncompleteCount);
                result = result + incompleteSubstrCount;
            }
        }
        return result;
    }

    private long getCount(String str) {
        return str.chars()
                .filter( ch -> ch =='a')
                .count();
    }
}
