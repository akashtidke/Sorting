import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int[]arr={4,5,67,32,645,67};
        duplicate(arr);
    }
    static void duplicate(int[]arr){
        int ans=-1;
        Arrays.sort(arr);
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i]==arr[i+1]){
                ans=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);

    }
}
//2021 passout hu ho jayega kya jan tak low package chalega pune