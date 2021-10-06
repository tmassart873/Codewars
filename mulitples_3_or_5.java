// Instructions

// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

// Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally, if the number is negative, return 0 (for languages that do have them).

// Note: If the number is a multiple of both 3 and 5, only count it once.

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
