package Sheet2;
import java.util.Scanner;
public class Panagram {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<26) {
			System.out.print("NO");
		}else {
			String s = sc.next();
			s = s.toLowerCase();
			
			/*
			int [] alphabet = new int[26];
			for(int i =0; (i<n) ;i++) {
				alphabet[s.charAt(i) -'a']= 1;
			}
			int count = 0;
			for(int i =0; i<26; i++) {
				count+= alphabet[i];
			}
			
		System.out.println((count == 26)? "YES":"NO");
			*/
			
			boolean [] chars= new boolean[26];
			for(int i =0; (i<n) ;i++) {
				chars[s.charAt(i) -'a'] = true;
			}
			boolean res = true;
			for(int i =0; i<26; i++) {
				res &= chars[i];
			}
			
			System.out.println((res)? "YES":"NO");
			}
			
			
			
		
		sc.close();
 	}
}