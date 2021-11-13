import java.util.Arrays;

public class t3sumtarget {
    public static void main(String[] args) {
        int[]arr={3,6,2,5,7,4,8,9,7,18};
        int target=22;
        triplet(arr,target);
    }
    static void triplet(int []arr,int target){
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            int newtarget=target-arr[i];
            int left=i+1;
            int right=arr.length-1;
            while (left<right){
                if (arr[left]+arr[right]>newtarget){
                    right--;
                }else if (arr[left]+arr[right]<newtarget){
                    left++;
                }else {
                    System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
                    left++;
                    right--;
                }
            }
        }
    }
}
