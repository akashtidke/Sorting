import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        boolean[]arr=new boolean[n+1];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]==false){
                for (int j = i; i*j < arr.length; j++) {
                    arr[i*j]=true;
                }
            }

        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]==false){
                System.out.println(i);
            }
        }
    }
}
