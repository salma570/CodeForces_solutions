package Sheet1;
import java.util.Scanner;
public class H_Taxii {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt()-1;
		
		if(n<=1) {
			System.out.print(n);
		}else {
			int [] a = new int [n];
			a[0] = sc.nextInt();
			int cnt =1;
			for(int i =0; i<n;i++) {
				int temp= sc.nextInt(); 
				if(a[cnt-1] +temp <=4) {
					a[cnt-1] +=temp; 
				}
				else {
					a[i]= temp;
					cnt++;
				}
				//System.out.println(Arrays.toString(a)+""+ i);
			}
			//System.out.println("out");
			System.out.println(cnt);
			sc.close();
		}
		
	}
}
