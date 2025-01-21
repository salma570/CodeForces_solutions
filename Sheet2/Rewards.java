package Sheet2;

import java.util.Scanner;
public class Rewards {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cups = sc.nextInt()+sc.nextInt()+sc.nextInt();
		int medals = sc.nextInt()+sc.nextInt()+sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		int k  = 0;
		k+= Math.ceil(cups/5.0);
		k+= Math.ceil(medals/10.0) ;
		System.out.print((k>n)?("NO"):("YES"));
		
		
			
	}
}
