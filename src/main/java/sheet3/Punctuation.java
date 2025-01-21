package sheet3;

import java.util.*;
public class Punctuation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringBuilder res = new StringBuilder("");
		boolean addedSpace = false;
		for(int i =0; i< s.length()-1; i++){
			
			char c = s.charAt(i);
			char nxt = findnxt(s,i);
			if (!space(c)) {
				res.append(c);
				if (punct(c)) {
					res.append(' ');
					addedSpace = true;
				}else {
					addedSpace = false;
				}
			}else {
				if (!addedSpace & !punct(nxt)) {
					res.append(' ');
					addedSpace = true;
				}
			}
		}
		if (!space(s.charAt(s.length()-1))) {
			res.append(s.charAt(s.length()-1));
		}
		System.out.println(res);
		sc.close();
	}
	public static boolean space(char c) {
		if(c == ' ') 
			return true;
		
			return false;
		
	}
	public static boolean punct(char c) {
		if(c == '?' ||c == '!' ||c == '.' ||c == ',' ) 
			return true;	
		return false;	
	}
	public static char findnxt(String s, int i) {
		for(; i<s.length(); i++){
			if (!space(s.charAt(i))) {
				return s.charAt(i);
			}
		}
		return s.charAt(s.length()-1);
		
	}

	
}
