package Strings;

public class ReverseIndividualWordsWithoutExtraSpace {
    public static void main(String[] args) {
        String string = "Hello World";
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = string.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            String str = stringArray[i];
            String result = reverseString(str);
            stringBuilder.append(result + " ");
        }
        System.out.print("ReverseString is-->" + stringBuilder.toString());
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
