package Div3;
import java.util.*;
import java.io.*;
public class Crocodiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(); // length
			int m = sc.nextInt();	//distance
			int k = sc.nextInt();  // swim without freezing
			String a = sc.next();
			
			char curr='L';
        	int i= -1;
        	boolean flag=true;
        	
        	while(i<n) {
        		
        		// case 1
        		if(curr=='L') {
        			
        			if(i>=n-m) // if m is grater than n 
        				break; //possible
        			
        			
        			int initial=     i; //equal to -1
        			int furthest=   -1;
        			
        			for(int j=initial+1 // j =0
        					;  j<n  // didn't pass the length
        						&& j<=initial+m //less than distance to travel 
        							;j++) {
        				
        				if(a.charAt(j)=='L') {
        					i=j; // check condition L
        					curr='L';
        				}else if(a.charAt(j)=='W')
        					furthest=j; //exc
        			}
        			
        			//***************************
        			
        			if(i==initial) {
        				if(furthest==-1) {
        					flag=false; // no change
        					break;
        				}else {
        					curr='W';
        					i=furthest;
        				}
        			}
        			//____________________________________________
        		}else if(curr=='W') {
        			if(k<=0) {
        				flag=false;
        				break;
        			}
        			if(i==n-1) {
        				if(k<=0) 
        					flag=false;
        				break;
        				
        			}
        			if(a.charAt(i+1)!='C') {
        				curr=a.charAt(i+1);
        				i++;
        				k--;
        			}else {
        				flag=false;
        				break;
        			}
        		}
        		//__________________________________________
        	}//while
        	
        	//_______________________________________________
        	
        	if(flag)
        		pw.println("YES");
        	else
        		pw.println("NO");
        }
		
	sc.close();
	pw.flush();
	}
}
