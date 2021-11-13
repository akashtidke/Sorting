import java.lang.reflect.Array;
import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int []arr={1,8,6,2,5,7};
        insersort(arr);
    }
    static void insersort(int[]arr) {

        for (int i = 1; i < arr.length; i++) {
            // System.out.println(i);
            int current = arr[i];
            for (int j = i - 1; j >= 0; j--) {
if (arr[j]>arr[j+1]){
    int temp=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=temp;
}

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
