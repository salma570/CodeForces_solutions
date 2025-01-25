import java.io.*;
import java.util.*;

public class ECPC {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		/*int n = sc.nextInt();
		pw.println("Ahmad");
		
		
		//pw.println(sc.nextInt()+sc.nextInt()+sc.nextInt());
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i =1; i<=k; i++) {
			pw.print(a*i+b + " ");
		}
		*/
		
		int [] a = new int [sc.nextInt()];
		long k = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			a[i]= sc.nextInt();
		}
		Arrays.sort(a);
		
		
		long sum =0;
		boolean t = true;
		for (int j = 0; j < a.length; j++) {
			if (sum+a[j]<k) {
				sum+=a[j];
			}else {
				pw.print(j+1);
				t = false;
				break;
			}
		}
		if (t){
		    	pw.print(a.length);
		}
		
		sc.close();
		pw.close();
	
	}
	
}
