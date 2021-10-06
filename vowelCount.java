// Instructions 

// Return the number (count) of vowels in the given string.
// We will consider a, e, i, o, u as vowels for this Kata (but not y).
// The input string will only consist of lower case letters and/or spaces.

import java.util.ArrayList;
import java.util.List;

public class Vowels {

    public static int getCount(String str) {

        int vowelsCount = 0;
        //place all the letters from the string in a character aray
        char[] lettersFromString = str.toLowerCase().toCharArray();
        //Make a list that contain all vowels
        List vowelsList = new ArrayList();

        vowelsList.add('a');
        vowelsList.add('e');
        vowelsList.add('i');
        vowelsList.add('o');
        vowelsList.add('u');
        // Go over all the letters from the word
        for(int i = 0; i < str.length(); i++ ){

            //if the letter is in the vowelsList we need to add 1 to the vowelCount
            if (vowelsList.contains(lettersFromString[i])){

                vowelsCount += 1;

            }

        }

        return vowelsCount;
    }

}