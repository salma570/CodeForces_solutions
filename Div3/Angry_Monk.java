//https://codeforces.com/contest/1992/problem/B

import java.io.*;
import java.util.*;
public class Angry_Monk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t=sc.nextInt();
        while (t-->0) {
            int k=sc.nextInt();
            int n=sc.nextInt();
            int[] a=new int[n];
            for (int i=0;i<n;i++)
                a[i]=sc.nextInt();
            Arrays.sort(a);
            long s=0;
            for (int i=0;i<n-1;i++)
                s+=(long)2*a[i]-1;
            pw.println(s);
 
        }
 
        pw.flush();
        }
}
