import java.util.Arrays;

public class Merge2Arrays {
    public static void main(String[]args){
        int []arr1={1,3,5,7,9};
        int []arr2={2,4,6};
        int[]ans=new int[(arr1.length)+(arr2.length)];
int i=0;
int j=0;
int k=0;
while (i<arr1.length&&j<arr2.length){
    if (arr1[i]<arr2[j]){
        ans[k]=arr1[i];
        i++;
        k++;
    }else {
        ans[k]=arr2[j];
        j++;
        k++;
    }
}
while (i<arr1.length){
    ans[k]=arr1[i];
    i++;
    k++;
}
        while (j<arr2.length){
            ans[k]=arr1[j];
            j++;
            k++;
        }




        System.out.println(Arrays.toString(ans));
    }
}
