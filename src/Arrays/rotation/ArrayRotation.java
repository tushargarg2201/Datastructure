package Arrays.rotation;

public class ArrayRotation {
    public static void main(String[] a)
    {
        int arr[]={1,2,3,4,5,6,7,8};

        int numRotation=6;
        int tempArr[]=new int[numRotation];

        for(int i=0;i<numRotation;i++)
        {
            tempArr[i]=arr[i];
        }

        int shiftIndex=0;
        for (int i=numRotation;i<arr.length;i++)
        {
                arr[shiftIndex]=arr[i];
                shiftIndex++;
        }

        for (int i=0;i<tempArr.length;i++)
        {
            arr[shiftIndex] = tempArr[i];
            shiftIndex++;
            //arr[arr.length-numRotation]=tempArr[i];
            //numRotation--;
        }

        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

}
