import java.util.*;
import java.io.*;
public class I2 {
	public static void main (String [] args) throws IOException{
		Scanner sc= new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] time = new int[n];
		int[] dur = new int[n];
		for (int i = 0; i < n; i++) {
			time[i] = sc.nextInt();
			dur[i] = sc.nextInt();
		}
		int[] dp = new int[86400 + 1];
		int[] dq = new int[86400 + 1];
		int ans = (k == n ? 86400 + 1 : time[k]) - 1;
		
		
		for (int m = 1; m <= n; m++) { //loop on input
			for (int t = 1; t <= 86400; t++) {
						
					int x = Math.max(dp[t], dq[t - 1]);
							if (time[m - 1] + dur[m - 1] - 1 <= t)
								x = Math.max(x, dp[t - dur[m - 1]] + 1);
						dq[t] = x;
							if (m - x <= k) {
								int i = m + (k - (m - x));
								int t_ = i >= n ? 86400 + 1 : time[i];
								ans = Math.max(ans, t_ - t - 1);
							}
				}
				int[] tmp = dp; dp = dq; dq = tmp;
		}
		pw.println(ans);
		
		
			pw.flush();
	        sc.close();
	}
}
