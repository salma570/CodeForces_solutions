package Sheet2;
import java.util.Scanner;
//import java.util.Arrays;

public class Sheet2C {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
        Long min = sc.nextLong() ;
        Long sum = min ;
        
        for (int i=1 ; i<n ; i++) {
        	Long x = sc.nextLong();
        	sum += x;
        	
        	if (x%2==1)
        	{
        		if(min%2==0) {
        			min = x;
        		}else if (x<min) { //min odd
            		min = x;
            	}
        	}
        }
        if (sum%2==1) { //sum fel akheir odd subtract the smallest
        	sum -= min;
        }
		
		/*
		
		int n = sc.nextInt();
		Long[] nums = new Long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
        }
        Arrays.sort(nums);
        int sum = 0;
        for (int i =n-1; i >0; i--) {
            if (sum % 2 == 0 && nums[i] % 2 == 0) {
                sum += nums[i];
            } else if (sum % 2 == 1 && nums[i] % 2 == 1) {
                sum += nums[i];
            }
        }
		*/
		System.out.print(sum);
		sc.close();
	}
}
