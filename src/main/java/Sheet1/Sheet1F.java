package Sheet1;

import java.util.*;
public class Sheet1F {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		String[] list = new String[n];
		
		for(int i =0; i<n;i++) {
			list[i] = sc.next();
			if(list[i].length()<=10)
				System.out.println(list[i]);
			else {
				System.out.println(list[i].charAt(0)+""+
						(list[i].length()-2)+""
						+list[i].charAt(list[i].length()-1));
			}
		}
		sc.close();
	}
}
