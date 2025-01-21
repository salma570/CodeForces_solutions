package Sheet1;

import java.util.*;
public class Sheet1G {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int x = 0;
		for (int i=0 ; i<num ; i++) {
			String statement = sc.next();
			if (statement.charAt(1)=='+') {
				x+=1;
			}
			else {
				x-=1;
			}
		}
		System.out.print(x);
		
		sc.close();
	}
	

}
