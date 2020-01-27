package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateChars {
    public static void main(String[] args) {
        printDuplicateCharacters("Programming");
    }

    private static void printDuplicateCharacters(String string) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (hashMap.containsKey(ch)) {
                int val = hashMap.get(ch);
                val = val + 1;
                hashMap.put(ch, val);
            } else {
                hashMap.put(ch, 1);
            }
        }
       Set<Map.Entry<Character, Integer>> entrySet = hashMap.entrySet();
       for (Map.Entry<Character, Integer> entry : entrySet) {
           if (entry.getValue() >=1 ) {
               System.out.println(entry.getKey() + " " + entry.getValue());
           }
       }
    }
}
