package practce1;



import java.util.Scanner;

public class oddEvenPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int odd = 0;
		int even = 0;
		int prime = 0;
		
	

		
		while(x!=0){
			int tmp = x%10;
			
			if(tmp == 2 || tmp == 3 || tmp == 5 || tmp == 7){
				prime++;
			}
			
			
			
			if(x%2==0){
				even++;
			}
			else if(x%2!=0){
				odd++;
			}
			
			x=x/10;
		} 
		
		System.out.println(even);
		System.out.println(odd);
		System.out.println(prime);
		
	}

}

