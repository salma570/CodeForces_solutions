package Sheet2;

import java.util.Scanner;

public class SquareString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i =0; i<n;i++) {
			squareString(sc.next());
		}
		sc.close();
	}
	public static void squareString(String s) {
		String res ="NO";
		for(int i =0; i<s.length();i++) {
			if (s.substring(0,i).equals(s.substring(i))){
				res = "YES";
				break;
				}
		}
		System.out.println(res);
	}
	
}
