package recursion;

public class StringPermuation {
    public static void main(String[] args) {
        String s = "abc";
        int left = 0;
        int right = s.length() - 1;
        checkPermuation(s, left, right);
    }

    private static void checkPermuation(String s, int left , int right) {
        if (left == right) {
            System.out.println(s);
            return;
        }

        for (int i = left; i <= right; i++) {
            s = interChange(s, left, i);
            checkPermuation(s, left + 1, right);
            s = interChange(s, left, i);
        }
    }

    private static String interChange(String s, int a, int b) {
        char[] charArray = s.toCharArray();
        char temp = charArray[a];
        charArray[a] = charArray[b];
        charArray[b] = temp;
        return String.valueOf(charArray);
    }
}
