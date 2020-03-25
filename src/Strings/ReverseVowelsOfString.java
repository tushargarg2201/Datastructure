package Strings;

public class ReverseVowelsOfString {
    public static void main(String [] args) {
        String s = "hello";
        String result = reverseVowels(s);
        System.out.println("result is--->" + result);
    }

    private static String reverseVowels(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        int len = s.length();
        char[] charArray = new char[len];

        int i = 0;
        int j = len - 1;

        for (int k = 0; k < len; k++) {
            charArray[k] = s.charAt(k);
        }

        while (i < j) {
            if (checkVowels(charArray[i]) && checkVowels(charArray[j])) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
            } else if (!checkVowels(charArray[i])) {
                i++;
            } else if (!checkVowels(charArray[j])) {
                j--;
            } else if (!checkVowels(charArray[i]) && (!checkVowels(charArray[j]))) {
                i++;
                j--;
            }
        }

        String resultString = new String(charArray);
        resultString.toLowerCase();
        System.out.println("result string is --->" + resultString);
        return resultString;

    }

    private static boolean checkVowels(char ch) {
        return ((ch == 'a' || ch == 'A') || (ch == 'e' || ch == 'E') ||
                (ch == 'i' || ch == 'I') || (ch == 'o' || ch == 'O') ||
                (ch == 'u' || ch == 'U'));
    }

}
