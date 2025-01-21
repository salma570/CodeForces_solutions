package Sheet2;

import java.io.*;
import java.util.Scanner;

public class D_theasquare {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		long n = sc.nextInt();
		long m = sc.nextInt();
		long a = sc.nextInt();
 
		long Row = (int) Math.ceil((double) n / a); 
		long Col = (int) Math.ceil((double) m / a);
		
		
		pw.println(Row * Col); 
		
		
		pw.flush();
		sc.close();

}
}