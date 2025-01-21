package Sheet1;

import java.util.Scanner;
public class Sheet1_D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		
		for(int i=0;i<num;i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int sum = 0;
			sum = a + b + c;
			if (sum>=2) {
				count+=1;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
