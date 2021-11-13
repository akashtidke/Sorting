import java.util.Arrays;

public class targetSumPair {
    public static void main(String[] args) {
        int[]arr={4,5,67,32,645,67};
    TargetSum(arr,9);
    }
    static void TargetSum(int[]arr,int taret){
        Arrays.sort(arr);
//        duplicate lelo
        int left=0;
        int right=arr.length-1;
        while (left<right){
            if (arr[left]+arr[right]>taret){
                right--;
            }else if (arr[left]+arr[right]<taret){
                left++;
            }else {
            System.out.println(arr[left]+" "+arr[right]);
            left++;
            right--;
        }
        }
    }
}
