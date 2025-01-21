package Sheet2;

import java.util.Scanner;
public class Sheet2A {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			if(i%2==0) {
				System.out.print("I love ");
			}else {
				System.out.print("I hate ");
			}
			
			if(i == n) System.out.print("it");
			else {
				System.out.print("that ");
			}
		}
		sc.close();
	}
}
