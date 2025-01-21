package Sheet2;

import java.util.*;
import java.io.*;

public class WhereistheBishop{
	
	
	public static void main(String[] args) throws IOException{
		PrintWriter pw = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			solve();
		}
		pw.close();
	}
	public static void solve() {
		
	}
}



final class Scanner {

	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream system) {
		br = new BufferedReader(new InputStreamReader(system));
	}

	public Scanner(String file) throws Exception {
		br = new BufferedReader(new FileReader(file));
	}

	public String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	public String nextLine() throws IOException {
		return br.readLine();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	public double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

	public boolean ready() throws IOException {
		return br.ready();
	}
}