package Arrays.rearrange;

import java.util.ArrayList;

/**Input will be 123
 * output should be 124
  */
public class AddOneToNumber {
    public static void main(String [] args)  {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
//        arrayList.add(0);
//        arrayList.add(3);
//        arrayList.add(7);
//
//        arrayList.add(6);
//        arrayList.add(4);
//        arrayList.add(0);
//
//        arrayList.add(5);
//        arrayList.add(5);
//        arrayList.add(5);

//        arrayList.add(9);
//        arrayList.add(9);
//        arrayList.add(9);
//
//        arrayList.add(9);
//        arrayList.add(9);
//        arrayList.add(9);
//
//        arrayList.add(9);
//        arrayList.add(9);
//        arrayList.add(9);
//
//        arrayList.add(9);
//        arrayList.add(9);
//        arrayList.add(9);


        //addOneToNumberImpl(arrayList);
        ArrayList<Integer> result = carryLogic(arrayList);
        System.out.println("result is ---> " + result);
    }

    private static ArrayList<Integer> carryLogic(ArrayList<Integer> arrayList) {
        ArrayList<Integer> tempList = new ArrayList<>();
        int carry = 0;
        int number = 0;
        int finalNumber = 0;
        boolean isCarryFound = false;
        int i = 0;

        for (i = arrayList.size() - 1; i >= 0; i--) {
            isCarryFound = false;
            if ( i == arrayList.size() -1) {
                number = arrayList.get(i) +  carry + 1;
            } else {
                number = arrayList.get(i) + carry;
            }

            while (!isCarryFound) {
                isCarryFound = true;
                finalNumber = number % 10;
                number = number / 10;
                carry = number;
            }
            if (shouldAddNumber(i, carry)) {
                tempList.add(finalNumber);
            }

            if (i == 0 && carry > 0) {
                tempList.add(carry) ;
            }
        }

        arrayList.clear();
        for (int k = tempList.size() - 1; k >= 0; k--) {
            arrayList.add(tempList.get(k));
        }

        System.out.println("arrayList is--->" + arrayList);

        return arrayList;

    }

    private static boolean shouldAddNumber(int i, int carry) {
        if (i == 0 && carry == 0) {
            return false;
        }
        return true;
    }

    private static void addOneToNumberImpl(ArrayList<Integer> arrayList) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < arrayList.size(); i++) {
            buffer.append(arrayList.get(i));
        }
        String resultString = buffer.toString();
        long number = Long.parseLong(resultString);
        number++;
        System.out.println("number is--->" + number);
        long result;
        ArrayList<Long> resultList = new ArrayList<>();

        while (number > 0) {
            result = number % 10;
            resultList.add(result);
            number = number/10;
        }
        ArrayList<Long> finalList = reverseArray(resultList);
        System.out.println("finalList is--->" + finalList);

    }

    private static ArrayList<Long> reverseArray(ArrayList<Long> resultList) {
        Long array[] = new Long[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            array[i] = resultList.get(i);
        }
        int i = 0;
        int j = array.length -1;
        while (i < j) {
            long temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        ArrayList<Long> finalList = new ArrayList<>();
        for (int k = 0; k < array.length; k++) {
            finalList.add(array[k]);
        }
        return finalList;
    }
}
