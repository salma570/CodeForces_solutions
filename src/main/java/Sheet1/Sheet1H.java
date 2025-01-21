package Sheet1;

import java.util.Scanner;
public class Sheet1H {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		for(int i = 0 ; i<n;i++) {
			sum+= sc.nextInt();
		}
		
		/*
		if(sum%4==0) {
			System.out.print(sum/4);
		}else {
			System.out.print((sum/4)+1);
		}
		*/
		
		System.out.print((int)Math.ceil(sum/4));
		sc.close();
			
	}

}
