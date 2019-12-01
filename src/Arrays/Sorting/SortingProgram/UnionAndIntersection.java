package Arrays.Sorting.SortingProgram;

/**
 * Find union and intersection of two sorted array.
 *
 * int [] arr1 = {1, 3, 4, 5, 7};
 * int [] arr2 = {2, 3, 5, 6};
 *
 * Union : { 1, 2, 3, 4, 5, 6, 7 } ---> Remove duplicate elements
 * Intersection (3, 5) : Common elements
 *
 */
public class UnionAndIntersection {
    public static void main (String [] args) {
        UnionAndIntersection obj = new UnionAndIntersection();
        obj.unionImpl();
        obj.intersectionImpl();
    }

    private void intersectionImpl() {
        int [] arr1 = {1, 3, 4, 5, 7};
        int [] arr2 = {2, 3, 5, 6};
        int [] arr3 = new int[arr1.length + arr2.length];
        int i, j, k;
        i = j = k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else if (arr1[i] == arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                j++;
                k++;
            }
        }

        System.out.println("---Intersection of two sorted merge arrray is---");
        for (int m = 0; m < k; m++) {
            System.out.print(arr3[m] + " ");
        }
    }

    private void unionImpl() {
        int [] arr1 = {1, 3, 4, 5, 7};
        int [] arr2 = {2, 3, 5, 6};
        int [] arr3 = new int[arr1.length + arr2.length];
        int i, j, k;
        i = j = k = 0;
        int prevIndex = 0;





        while (i < arr1.length && j < arr2.length) {
            if (k == 0) {
                prevIndex = k;
            } else {
                prevIndex = k -1;
            }
            if (arr1[i] < arr2[j]) {
                if (arr3[prevIndex] != arr1[i]) {
                    arr3[k] = arr1[i];
                    i++;
                    k++;
                } else {
                    i++;
                }
            } else {
                if (arr3[prevIndex] != arr2[j]) {
                    arr3[k] = arr2[j];
                    j++;
                    k++;
                } else {
                    j++;
                }
            }
        }

        while (i < arr1.length) {
            if (k == 0) {
                prevIndex = k;
            } else {
                prevIndex = k -1;
            }
            if (arr3[prevIndex] != arr1[i]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                i++;
            }
        }

        while (j < arr2.length) {
            if (k == 0) {
                prevIndex = k;
            } else {
                prevIndex = k -1;
            }
            if (arr3[prevIndex] != arr2[j]) {
                arr3[k] = arr2[j];
                j++;
                k++;
            } else {
                j++;
            }
        }

        System.out.println("---Union of two sorted merge arrray iss---");
        for (int m = 0; m < k; m++) {
            System.out.print(arr3[m] + " ");
        }
    }
}
