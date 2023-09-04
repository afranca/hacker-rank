package repeatedstring;

public class RepeatedString {

    public long repeatedString(String s, long n) {
        int nRepetition = (int) n;
        long result = 0;
        int stringLength = s.length();
        if (stringLength >= n){
            // easy case
            var substring = s.substring(0,nRepetition);
            result = substring.chars()
                    .filter( ch -> ch =='a')
                    .count();
        } else {
            // complex case
            int fullRepeatedTimes = nRepetition / stringLength;
            int incompleteRepetition = nRepetition % stringLength;

            long count = s.chars()
                    .filter( ch -> ch =='a')
                    .count();
            result = count * fullRepeatedTimes;

            if (incompleteRepetition > 0){
                var substrIncompleteCount = s.substring(0,incompleteRepetition);
                long incompleteSubstrCount = substrIncompleteCount.chars()
                        .filter( ch -> ch =='a')
                        .count();
                result = result + incompleteSubstrCount;
            }

        }

        return result;
    }
}
