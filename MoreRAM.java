package Sheet2;

import java.util.*;
import java.io.*;

public class MoreRAM {
	
	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int a[] = sc.nextIntArray(n);
			int b[] = sc.nextIntArray(n);
			//int[][] ??? 
			pair[] pairs = new pair[n];
			for(int i=0;i<n;i++) {
				pairs[i] = new pair(a[i],b[i]);
			}
			// a[i][1]
			//a[i][2]
			
			
			Arrays.sort(pairs); //x2d arrays
			int i=0;
			
			while(i<n && k>=pairs[i].x) { // k>= a[i][1]
				k+= pairs[i].y; //k+= //a[i][2]
				i++;
			}
			System.out.println(k);
		}
	}

    static class pair implements Comparable<pair>{
        int x , y;
        public pair(int x , int y){
            this.x = x;
            this.y = y;
        }
        public int compareTo(pair p){
            return x - p.x;
        }
    }
    static class Scanner {
    	 
		StringTokenizer st;
		BufferedReader br;
 
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
 
		public Scanner(String file) throws IOException {
			br = new BufferedReader(new FileReader(file));
		}
 
		public Scanner(FileReader r) {
			br = new BufferedReader(r);
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public String readAllLines(BufferedReader reader) throws IOException {
			StringBuilder content = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				content.append(line);
				content.append(System.lineSeparator());
			}
			return content.toString();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}
 
		public long[] nextlongArray(int n) throws IOException {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
 
		public Long[] nextLongArray(int n) throws IOException {
			Long[] a = new Long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
 
		public int[] nextIntArray(int n) throws IOException {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		public Integer[] nextIntegerArray(int n) throws IOException {
			Integer[] a = new Integer[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
	}
}
