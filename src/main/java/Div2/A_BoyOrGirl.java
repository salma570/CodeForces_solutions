 package Div2;
import java.util.*;
import java.io.*;
public class A_BoyOrGirl{

    // use frequency arrays
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
        int n = 5; // sc.nextInt();

        int [] a = new int [n];
        for(int i =0; i<n; i++){
            int x = sc.nextInt();
            a[i-1]++;
            System.out.println(Arrays.toString(a));
        }
     System.out.println(Arrays.toString(a));   
     sc.close();
    }
}
