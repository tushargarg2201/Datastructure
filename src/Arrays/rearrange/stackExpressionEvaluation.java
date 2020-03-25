//package Arrays.rearrange;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class stackExpressionEvaluation {
//    public static void main(String [] args) {
//        String string = "2[a3[bc]]";
//        String result = compressionEvaluation(string);
//
//    }
//
//    private static String compressionEvaluation(String string) {
//        String resultString = "";
//        Stack<Character> stack = new Stack<>();
//        ArrayList<Character> arrayList = new ArrayList<>();
//
//        for (int i = 0; i < string.length(); i++) {
//            Character ch = string.charAt(i);
//            stack.push(ch);
//        }
//
//        while (!stack.isEmpty()) {
//            Character ch = stack.pop();
//            if (ch is alphabet) {
//                arrayList.add(ch);
//            } else if (ch is number) {
//                // add the elements that number of times in the.
//            }
//        }
//
//        return resultString;
//    }
//}