import java.util.*;
import java.io.*;
public class l {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();

            StringBuilder s=new StringBuilder(sc.next());
            
            if(m>=n+1) pw.println("YES");
            else {
            	String answ ="YES";
                int oldL = 0;
                int newL=-1;
                int w =0;
                int w2=0;
                
                for (int i = 1; i < s.length(); i++) {
                    if(s.charAt(i)=='W')
                        w++;
	                    if(w>k){
	                    	answ ="NO"; break;
	                    }
                    else if(s.charAt(i)=='C') {
                    	answ ="NO"; break;}
                    else if (s.charAt(i) == 'L') {
                        newL=i;
                        if (newL-oldL>m){
                            for(int j=oldL+m; j<newL;j++){
                                if(s.charAt(j)=='C'){
                                	answ ="NO"; break;
                                }
                                else { // =='W'
                                    w2++;
                                    if(w2>k){
                                    	answ ="NO"; break;
                                    }
                                }
                            }
                            oldL=newL;
                            w=0; 
                        }
                        else{
                            oldL=newL;
                            w=0;
                        }
                    }
                }
                pw.println(answ);
            }

        }

        pw.flush();
        sc.close();
    }
    }