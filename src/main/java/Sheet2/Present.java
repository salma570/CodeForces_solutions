package Sheet2;

import java.io.IOException;
import java.util.Scanner;

public class Present {
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int[] in = new int[t+1];
		for (int i = 1; i <= t; i++) {
			int pi = sc.nextInt();
			in[pi] = i;
		}
		for (int i = 1; i < in.length; i++) {
			System.out.print(in[i]+" ");
		}
		sc.close();
	}
}


