package Sheet2;

import java.util.Scanner;
import java.io.*;

//implementation problem
public class IQtest{
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);	
			int [][] in = new int[4][4];
			for (int i = 0; i < 4; i++) {
				String s = sc.next();
				for (int j = 0; j <4; j++) {
					in[i][j] = s.charAt(j)=='#'? 1:0;
				}
			}
//			for (int i = 0; i < in.length; i++) {
//				for (int j = 0; j < in.length; j++) {
//					System.out.print(in[i][j]);
//				}
//				System.out.println();
//			}
			boolean flag = false;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					int sum = in[i][j] + in[i+1][j+1]+ in[i+1][j] + in[i][j+1];
//					System.out.println( in[i][j] +" "+ in[i+1][j+1]+" "+in[i+1][j] +" "+ in[1][j+1]);
					if(sum != 2) {
						flag = true;
					}
				}
			}
			if(flag) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		sc.close();
	}
}