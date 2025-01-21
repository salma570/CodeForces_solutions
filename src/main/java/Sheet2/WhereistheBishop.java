package Sheet2;

import java.util.*;
import java.io.*;

public class WhereistheBishop{
	static PrintWriter pw = new PrintWriter(System.out);
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException{
		
		int t = sc.nextInt();
		while(t-->0) {
			solve();
		}
		pw.close();
	}
	public static void solve() throws IOException {
		char [][] in = new char[8][8];
		for (int i = 0; i < 8; i++) {
			String s = sc.next();
			in[i] = s.toCharArray();
		}
		
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				if(in[i][j] == '#' && in[i+1][j+1] == '#' 
						&& in[i-1][j-1] == '#' && in[i-1][j+1] == '#' ) {
					pw.println((i+1) +" "+ (j+1));
				}
				
			}
			
		}
		pw.flush();
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