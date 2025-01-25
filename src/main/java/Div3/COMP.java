import java.io.PrintWriter;
import java.util.Scanner;

public class COMP {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int r =1;
		int t = sc.nextInt();
		while (t-->0) {
			int h = sc.nextInt();
			int m = sc.nextInt();
			int s  = sc.nextInt();
			
			int h2 = sc.nextInt();
			int m2= sc.nextInt();
			int s2  = sc.nextInt();
			
			pw.print("Case "+r+": ");
			
			if((h*3600+m*60+s)==(h2*3600+m2*60+s2)) {
				pw.println("Yes");pw.flush();
			}else {
				pw.println("No");
			}
			r++;
			
		}
		sc.close();
		pw.close();
	}
}
