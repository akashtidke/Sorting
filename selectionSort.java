import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
        selectSort(arr);
    }

    static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int max=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[max]>arr[j]){
                    max=j;
                }
            }
            int temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;


        }
        System.out.println(Arrays.toString(arr));
    }
}