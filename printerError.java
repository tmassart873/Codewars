// Instructions

// The colors used by the printer are recorded in a control string. For example a "good" control string would be aaabbbbhaijjjm meaning that the printer used three times color a, four times color b, one time color h then one time color a...

// Sometimes there are problems: lack of colors, technical malfunction and a "bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm with letters not from a to m.

// You have to write a function printer_error which given a string will return the error rate of the printer as a string representing a rational whose numerator is the number of errors and the denominator the length of the control string. Don't reduce this fraction to a simpler expression.

// The string has a length greater or equal to one and contains only letters from a to z.

import java.util.ArrayList;
import java.util.List;

public class Printer {

    public static String printerError(String s) {

        char[] lettersFromString = s.toLowerCase().toCharArray();

        int lengthStringS = s.length();
        int numberOfErrors = 0;

        List goodColors = new ArrayList();

        goodColors.add('a');
        goodColors.add('b');
        goodColors.add('c');
        goodColors.add('d');
        goodColors.add('e');
        goodColors.add('f');
        goodColors.add('g');
        goodColors.add('h');
        goodColors.add('i');
        goodColors.add('j');
        goodColors.add('k');
        goodColors.add('l');
        goodColors.add('m');

        for (int i = 0;i < lengthStringS; i++){

            if(!goodColors.contains(lettersFromString[i])){

                numberOfErrors += 1;

            }

        }

        String numberOfErrorsString = Integer.toString(numberOfErrors);
        String lengthStringSString = Integer.toString(lengthStringS);
        String result = numberOfErrorsString + "/" + lengthStringSString;

        return result;


    }
}
