import java.util.*;
import java.io.*;
public class DIV3 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        
    	int t = sc.nextInt();
        while (t-- > 0) {
        	
        	int n=sc.nextInt();
        	int m=sc.nextInt();
        	int k=sc.nextInt();
        	String s = sc.next();
        	
        	int i =0;
        	int w =0;
        	int w2 =0;
        	int currL=0;
        	int oldL=0;
        	String answ ="YES";
        	if(m < n+1)
        	while(i+m < n+1){
        		//pw.println(s.charAt(i));pw.flush();
				if (i!=0 && s.charAt(i) =='C') {
					answ ="NO";
					break;
				}else {
					if (s.charAt(i) =='W') {
						w++;
						if(w>k) {
							answ ="NO";
							break;
						}
				}else if (s.charAt(i) =='L') {
					currL =i;
					
					//pw.println(currL+" "+oldL);pw.flush();
					if (Math.abs(currL-oldL)<=m) {
					//	pw.println("1");pw.flush();

						w=0;
						oldL=currL;
					}else {//cn't jump
						//pw.println("11");pw.flush();
						for( int j = oldL+m; j<currL;j++){
                               if(s.charAt(j)=='C'){
                            	   answ ="NO"; 
                            	   //pw.println("C"); pw.flush();
                            	   break;
                            	   
                                }
                                else {if(s.charAt(j)=='W') {

                             	  // pw.println("W");pw.flush();
                                	w2++;
                                    if(w2>k) {
            							answ ="NO";
            							//pw.println(w2);pw.flush();
            							break;
            						}
								}
                                    
                                }
							}
						//pw.println(currL+" "+oldL);pw.flush();
						oldL=currL;
                        w=0;
						}
					}
				}
				i+=m;
				}
        	pw.println(answ);
        }
        	
        	
        
        pw.flush();
        sc.close();
    }
    }
 

