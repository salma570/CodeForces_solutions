import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class BRUTEFORCE {
	public static void main (String [] args) throws IOException{
		Scanner sc= new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		// cd tracks prb
		Scanner sc = new Scanner(System.in);
		
		while(sc.ready()) {
			int n = sc.nextInt();
			int tracks = sc.nextInt();
			int [] a = new int[tracks];
			
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
				
			}
			int mask =0;
			int sum =0;
			
			ArrayList<Integer> tmpArrayList = new ArrayList<Integer>();
			ArrayList<Integer> answ = new ArrayList<Integer>();
			int max =0;
			while (mask<1<<tracks) {
				for (int i = 0; i < tracks; i++) {
					if ((mask&(1<<i))!=0) {
						sum += a[i];
						tmpArrayList.add(a[i]);
					}
				}
			}
		}
		
		
		
		
		
		
		
		pw.flush();
        sc.close();
	}
	public static void subsets() {
		//subsets
				// 2^(n) possible subsets
				
				int mask =0;
				int [] a1 = new int [] {1,2,3}; //2^(3)
				
				while (mask<Math.pow(2, a1.length)) {
					for (int i = 0; i < a1.length; i++) {
						if ((mask & (1<<i))!=0) {
							System.out.println(a1[i]+" ");
						}
						System.out.println();
						mask++;
					}
				}
	}
	public static void E1() {
		Scanner sc= new Scanner(System.in);
		
		//************************	1/nested loops
				/*	A,B,C <= 10 000
				 * x+y+z = A
				 * x*y*z = B
				 * x*x+y*y+z*z = C
				 * Find x,y,z
				 * 
				 * 
				 * */
				
				//not do-able > all possiblities
				for (int i = -10000; i <= 10000; i++) {//x^2 boundries
					for (int j = -10000; j < 10000; j++) {
						for (int k = -10000; k < 10000; k++) {
							//10e12
						}
					}
				}
				
				//assuming x & c maximum, y and z minimum  x^2 ~ (100)^2 = 10 000
				
				
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				
				
				for (int i = -100; i <= 100; i++) {//x^2 boundries
					for (int j = -100; j < 100; j++) {
						for (int k = -100; k < 100; k++) {
							if(i!= j && i!= k && j!= k && ((i+j+k)== a)&& ((i*j*k)== b)&& ((i*i+j*j+k*k)== c)) {
								System.out.println(i+" "+j+" "+k);
							}
						}
					}
				}
	sc.close();
	}
	
}
