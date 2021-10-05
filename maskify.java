public class Maskify {
    public static String maskify(String str) {

        int lengthString = str.length();
        char[] letters = str.toCharArray();
        for (int i = 0;i < (lengthString-4);i++){
            letters[i] = '#';
        }
        String outputString =String.valueOf(letters);
        return outputString;
    }
}