package Sheet2;
import java.io.IOException;
import java.util.Scanner;
//import java.util.*;
public class Socks {
	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean [] seen = new boolean [n+1];
		
		int []socks = new int [2*n];
		for (int i = 0; i < n*2; i++)
		{
			socks[i] = sc.nextInt();
			//System.out.println(socks[i] );
		}
		
		int tableMAx = 0;
		int ontable =0;
		
		for(int i=0;i<2*n;i++) {
			int current = socks[i];
			//System.out.println(seen[current]);
			
				if(seen[current]) { //y true
					ontable--; 
					//System.out.println("O1");
				}else { /// y false
					seen[current] = true;
					ontable++; 
					tableMAx = Math.max(tableMAx, ontable);
					//System.out.println("O2");
				}
				//System.out.println(ontable+" "+tableMAx);
				//System.out.println(seen[current]);
		}
		System.out.println(tableMAx);
	sc.close();	
	}
}
