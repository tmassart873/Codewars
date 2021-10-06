public class Solution {

    public static int solution(int number) {
        int totalCount = 0;

        // If the value is negative we return 0 otherwise will will count
        if (number < 0){

            return(totalCount);

        }

        else{
            // number -1 because we need all the numbers below our given number
            for (int i = number-1; i > 0; i--){

                // If it is dividable by 3 OR (||) 5 the modulus is 0 and we need to count the number up with the total
                if (i%3 == 0 || i%5 == 0 ){

                    totalCount += i;

                }

            }
            return(totalCount);
        }
    }
}