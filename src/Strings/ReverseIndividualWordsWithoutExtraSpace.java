package Strings;

import java.util.Arrays;

public class ReverseIndividualWordsWithoutExtraSpace {
    public static void main(String[] args) {
        String string = "Care$e,m";
        String resultString = reverseString(string);
        System.out.print("ReverseString is-->" + resultString);
    }

    private static String reverseString(String str) {
        int i = 0; int j = str.length() - 1;
        Character[] charArray = new Character[str.length()];
        Character tempChar;
        for (int k = 0; k < str.length(); k++) {
            charArray[k] = str.charAt(k);
        }

        while (i < j) {
            if (!charCheck(charArray[i])) {
                i++;
            } else if (!charCheck(charArray[j])) {
                j--;
            } else {
                tempChar = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = tempChar;
                i++;
                j--;
            }

        }

        StringBuilder builder = new StringBuilder();
        for (int k = 0;  k < charArray.length; k++) {
            builder.append(charArray[k]);
        }
        return builder.toString();
    }

        private static boolean charCheck(Character input_char) {
            if ((input_char >= 65 && input_char <= 90)
                    || (input_char >= 97 && input_char <= 122)) {
                return true;
            }
            else if (input_char >= 48 && input_char <= 57) {
                return true;
            }
            return false;
        }
}
