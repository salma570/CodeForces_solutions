package Div3;

import java.util.*;
import java.io.*;

public class AngryMonk {
public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	PrintWriter pw = new PrintWriter(System.out);
	
	int nn = sc.nextInt();
	for(int i =0; i< nn ; i++){
		int operat=0;
		Long n = sc.nextLong();//Length
		int k = sc.nextInt();//#peices
		Integer[] a = new Integer [k];
		for(int j =0; j<k; j++){
			a[j] = sc.nextInt();
		}
		Arrays.sort(a, Collections.reverseOrder());
		//pw.println(Arrays.toString(a));
		
		while(a[0]< n) {
				int index = nonZero(a);
				if(index != -1) {
					if(a[index]!=1)
						operat++;
					a[index]-=1;
					a[0]+=1;
					operat++;
				}else {
					break;
				}
				
			//pw.println(operat);
			//pw.println(Arrays.toString(a));
			//pw.flush();
		}	
		pw.println(operat);
	}
	
	sc.close();
	pw.flush();
	}
	
	public static int nonZero(Integer [] a) {
		for(int i =1; i<a.length; i++){
			if(a[i]!=0) {
				return i;
			}
		}
		return -1;
	}
}