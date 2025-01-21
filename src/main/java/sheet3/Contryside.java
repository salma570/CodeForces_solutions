package sheet3;

import java.util.*;
import java.io.*;

public class Contryside {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
	
		int n = sc.nextInt();
        int Array[] = new int[n];
        for(int i=0 ; i<n ; i++) {
        	Array[i] = sc.nextInt();
        }
        if (Array[n-1]==0) {
        	pw.println("UP");
        }
        else if (Array[n-1]==15) {
    		pw.println("DOWN");
        }
        else if (n==1) {	
       		pw.println(-1);
        }
        else {
        	pw.println(Array[n-2]<Array[n-1]? "UP":"DOWN");
        }
		
		
		sc.close();
		pw.flush();
	}
}
