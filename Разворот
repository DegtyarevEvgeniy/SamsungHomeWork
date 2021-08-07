import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] mArray;
        mArray = new int[n];
        for(int i = 0; i<n; i++){
            mArray[i] = in.nextInt();
        }
        int[] rArray = reverce(mArray);
        System.out.println(Arrays.toString(rArray));
    }

    private static int[] reverce(int[] mArray) {
        int[] newArray = new int[mArray.length];

        for (int i = 0; i < mArray.length; i++) {
            newArray[mArray.length - 1 - i] = mArray[i];
        }

        return newArray;
    }
}
