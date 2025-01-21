package Sheet2;

import java.util.Scanner;
public class Minority {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c1=0;
		int c0=0;
		
	for(int i=0;i<n;i++){
		String s = sc.next();
		c1=0;
		c0=0;
	
		for(int j=0;j<s.length();j++){
			if(s.charAt(j)== '0') {
				c0++;
			}
			else {
				c1++;
			}
		}
	
		if(!(c0==c1)) {
			System.out.println((c0<c1)?(c0):(c1));
			
		}else {
			System.out.println(c0-1);
		}
		
	}
	sc.close();
	}
}
