package Sheet1;
import java.util.Scanner;
public class Sheet1 {
	public static boolean unique(String s,char c) {
		for(int i =0; i<s.length();i++) {
			if(s.charAt(i)== c)
				return false;
		}
		return true;
		
	}
	 public static void main(String [] args) {
		 Scanner sc = new Scanner(System.in);
		 String Username = sc.next();
		 int count = 0;
		 for(int i =0; i<Username.length();i++) {
			 if(unique(Username.substring(0,i),Username.charAt(i)))
				 count++;
		}
		
		if(count%2 ==0) {
			System.out.println("CHAT WITH HER!");
		}
		else {
			System.out.println("IGNORE HIM!");
		}
		
		sc.close();
		 
		 
	}

}
