import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
//        int n=scn.nextInt();
//        int[]arr=new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i]=scn.nextInt();
//        }
        int []arr={7,8,3,1,2};
        sort(arr);

    }
//brute force
    static void sort(int[]arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));

    }
//    recursively


}
