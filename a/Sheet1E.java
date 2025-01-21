package a;

import java.util.*; 
public class Sheet1E {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2==0 & num!=2) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
		sc.close();
	}

}
