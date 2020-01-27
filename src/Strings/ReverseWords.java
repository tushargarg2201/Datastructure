package Strings;

import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        String string = "apps best agoda";
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                stack.push(string.charAt(i));
            } else {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
