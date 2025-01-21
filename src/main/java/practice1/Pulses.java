package practice1;
import java.util.*;
import java.io.*;


public class Pulses {
public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	PrintWriter pw = new PrintWriter(System.out);
	int n = sc.nextInt();
	for(int i =0; i<n; i++){
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int addcount = 0;
		while(addcount<5){
			int min = (int) Math.min(c, Math.min(a, b));
			if(min ==c) {
				c ++;
			}else if (min ==b) {
				b ++;
			}else {
				a++;
			}
			addcount++;
			//pw.println(addcount +" "+a+" "+b+" "+ c);
		}
		pw.println(a*b*c);	
	}
	sc.close();
	pw.flush();
}
}
