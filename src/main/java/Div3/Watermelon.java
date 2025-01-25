import java.util.*;
import java.io.*;
public class Watermelon {
public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	PrintWriter pw = new PrintWriter(System.out);
	
	int w= sc.nextInt();
    if(w>2 && w%2==0)
        pw.println("YES");
    else {
    	 pw.println("NO");
	}
	sc.close();
	pw.flush();
}
}
