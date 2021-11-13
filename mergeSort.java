import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int []arr1={5,7,3,8,10,2};
        System.out.println(Arrays.toString(merge(arr1)));
        System.out.println(Arrays.toString(arr1));

    }
    static int [] merge(int []arr){
       if (arr.length==1){
           return arr ;
       }
        int mid=arr.length/2;
        int[] start=merge(Arrays.copyOfRange(arr,0,mid));
        int []end=merge(Arrays.copyOfRange(arr,mid,arr.length));

        return sort2Arrays(start,end);


        }
        static int[]sort2Arrays(int []start,int[]end){
        int[] ans=new int[start.length+end.length];

        int i=0;
        int j=0;
        int k=0;
        while (i<start.length&&j<end.length) {
            if (start[i] > end[j]) {
                ans[k] = end[j];
                k++;
                j++;
            } else  {
                ans[k] = start[i];
                i++;
                k++;
            }
        }
        while (i<start.length){
            ans[k]=start[i];
            i++;
            k++;
        }
            while (j<end.length){
                ans[k]=end[j];
                j++;
                k++;
            }

        return ans;
        }




}

