import java.util.Arrays;

public class t3sumtarget {
    public static void main(String[] args) {
        int[]arr={3,6,2,5,7,4};
        int target=10;
        triplet(arr,target);
    }
    static void triplet(int []arr,int target){
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int newtarget=target-arr[i];
            int left=i+1;
            int right=arr.length-1;
            while (right<left){
                if (arr[left]+arr[right]>newtarget){
                    left--;
                } else if (arr[left]+arr[right]<newtarget) {
                    right++;
                }else {
                    System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
                }
            }
        }
    }
}
