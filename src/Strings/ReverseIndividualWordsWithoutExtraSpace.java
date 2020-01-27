package Strings;

import java.util.Arrays;

public class ReverseIndividualWordsWithoutExtraSpace {
    public static void main(String[] args) {
        String string = "apps best agoda";
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = string.split(" ");
//        for (int i = 0; i < stringArray.length; i++) {
//            String str = stringArray[i];
//            String result = reverseCharString(str);
//            stringBuilder.append(result).append(" ");
//        }

        for (int i = stringArray.length -1 ; i >= 0; i--) {
            stringBuilder.append(stringArray[i]).append(" ");
        }
        System.out.print("ReverseString is-->" + stringBuilder.toString());
    }

    private static String reverseCharString(String str) {
        int j = str.length() - 1;
        char[] charArray = str.toCharArray();
        char tempChar;
        StringBuffer resultBuffer = new StringBuffer();

        for (int i = 0; i < str.length()/2; i++) {
            tempChar = str.charAt(i);
            charArray[i] = str.charAt(j);
            charArray[j] = tempChar;
            j--;
        }

        for (char c : charArray) {
            resultBuffer.append(c);
        }
       return resultBuffer.toString();
    }

    private static String reverseString(String str) {
        int i = 0; int j = str.length() - 1;
        Character[] charArray = new Character[str.length()];
        Character tempChar;
        for (int k = 0; k < str.length(); k++) {
            charArray[k] = str.charAt(k);
        }

        while (i < j) {
            tempChar = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = tempChar;
            i++;
            j--;
        }

        StringBuilder builder = new StringBuilder();
        for (int k = 0;  k < charArray.length; k++) {
            builder.append(charArray[k]);
        }
        return builder.toString();
    }
}
