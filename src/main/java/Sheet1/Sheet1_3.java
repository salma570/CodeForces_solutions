package Sheet1;

import java.util.Scanner;

public class Sheet1_3 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.print("Start");
		int n = sc.nextInt();
		String s= sc.next();
		int count = 0;
		for(int i =0; i<n-1;i++) {
			if(s.charAt(i)==s.charAt(i+1))
				count++;
		}
		System.out.println(count);
		
		sc.close();
	}
	
	

}
