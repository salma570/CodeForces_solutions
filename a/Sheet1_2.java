package a;
import java.util.*;
public class Sheet1_2 {
	public static boolean distinct(int k) {
		String s = k+"";
		for(int i =0; i<s.length(); i++) {
			for(int j = i+1;j<s.length(); j++) {
				
				if(s.charAt(i)== s.charAt(j))
					return false;
			}
		}
		return true;
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.print("enter a yr");
		int yr = sc.nextInt();
		boolean found = false;
		while(!found) {
			if(distinct(++yr))
			{
				System.out.print(yr);
				found = !found;
			}
		}	
		sc.close();
	}
}
