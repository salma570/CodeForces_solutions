package aditionalproblems;
import java.util.Scanner;
import java.io.*;


public class Stripes {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			char [][] in = new char[8][8];
			for (int i = 0; i < 8; i++) {
				String s = sc.next();
				in[i] = s.toCharArray();
			}
			//			for (int i = 0; i < in.length; i++) {
			//				for (int j = 0; j < in.length; j++) {
			//					System.out.print(in[i][j]);
			//				}
			//				System.out.println();
			//			}
			boolean flag = true;
			for (int i = 0; i < 8; i++) {
				flag = true; // Red
				for (int j = 0; j < 8; j++) {
					if(in[i][j] != 'R') {
						flag = false; // blue
					}
				}
				if(flag) {
					System.out.println("R");
					break;
				}
			}
			
			if(!flag) {
				System.out.println("B");
			}
		}
		sc.close();
	}
}
