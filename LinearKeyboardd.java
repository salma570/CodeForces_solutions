package Sheet2;

import java.util.Scanner;

public class LinearKeyboardd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0; i<n;i++) {
			String main = sc.next();
			String find = sc.next();
			time(main,find);
		}
	sc.close();
	}
	public static void time(String m,String f) {
		int res=0;
		for(int i =0; i<f.length()-1;i++) {
			int ch1 = findIndex( m, f.charAt(i));
			int ch2 = findIndex( m, f.charAt(i+1));
			
			res+= Math.abs(ch2 - ch1);
		}
		System.out.println(res);
	}
	public static int findIndex(String m,char f) {
			for(int j=0; j<m.length();j++) {
				if(m.charAt(j)==f) {
					return j;
				}
		}
		return -1;
	}
}
