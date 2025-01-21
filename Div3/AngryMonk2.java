import java.util.Scanner;
import java.util.Arrays;

public class AngryMonk2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long count=0;
            int arr[] = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]==1){
                    count++;
                }
                else{
                    count+=arr[i]+(arr[i]-1);
                }

            }
            Arrays.sort(arr);
            System.out.println(count-(2*arr[k-1]-1));


        }
    } 
}
