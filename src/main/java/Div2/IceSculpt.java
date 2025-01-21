package Div2;
import java.util.*;
import java.io.*;
public class IceSculpt {
	public static void main (String [] args) throws IOException{
		Scanner sc= new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		int[] arr=new int[n];
	    for(int i=0;i<n;i++)
	    	arr[i]=sc.nextInt();
	    
	    
	    int answ =Integer.MIN_VALUE;
	    for(int i=1;(i<=n);i++){ 
	    	//cond1: # vertices should be between 3 and n,
	    	if(n%i==0 && n/i>=3 ) {
				            
				                for(int j=0;j<i;j++){
				                    
				                	int sum=0;
					                    for(int k=j;k<n;k+=i){
					                        sum+=arr[k];
					                    }
				                    answ =Math.max(answ ,sum); //cond2: sum maximised
				                }
	    		} 
	        }
	        
	        pw.println(answ);
	        pw.flush();
	        sc.close();
	}
}
