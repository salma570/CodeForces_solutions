package a;
import java.util.*;
import java.io.*;

public class H_Taxi {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		int c1 = 0;
		int c2= 0;
		int c3= 0;
		int c4= 0;
		
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			switch (a[i]) {
				case 1:
					c1++;
					break;
				case 2:
					c2++;
					break;
				case 3:
					c3++;
					break;
				
				default:
					c4++;
					break;
			}
		}
		
		int Taxis = c4;
		int temp = Math.min(c1, c3); 
		Taxis += temp; 
		c1 -= temp; c3 -= temp; Taxis += c2/ 2; 
		
		if (c2% 2 != 0) { //reamining 2
			Taxis += 1; 
			c1 -= 2; 
		}
		if (c1 > 0) { //remaining 1s
			Taxis += Math.ceil(c1 / 4.0);
		}
		Taxis += c3; // remaining 3


		pw.println(Taxis);
		pw.close();
		sc.close();

	}
}