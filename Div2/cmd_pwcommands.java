import java.util.*;
import java.io.*;
public class cmd_pwcommands {
	public static void main (String [] args) throws IOException{
		Scanner sc= new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		Stack<String> stack = new Stack<>();
		
		
		
		while (n-->0) {
			String cmd = sc.next();						//1
			
			if (cmd.equals("pwd")) {
						String ans = "/";
						
		                Iterator<String> path = stack.iterator(); 
			                while (path.hasNext()) {
			                    ans += path.next() + "/";
			                }
		               System.out.println(ans);
		               
		               
		               
		               
		               
            } else { //cd
            		
            		String loc = sc.next(); 			//		2 input
	                if (loc.charAt(0) == '/') {
	                    stack.clear();
	                }
	 
	                String[] locations = loc.split("/");
	                
	                // [home, vasya]
	                // [home, vasya]
	                // [vasya, .., petya]

	                //for each on location []
	                
	                for (String location : locations) {
	                    if (location == "") continue;
	                    
	                    if (location.equals("..")) {
	                        stack.pop();
	                        
	                    } else {
	                        stack.push(location);
	                    }
	                    
	                  // stack: [home]
	                  // stack: [home, vasya]
	                  // stack: [home]
		              // stack: [home, petya]
	                }
            }
		}
		
		sc.close();
		pw.flush();
	}
}
