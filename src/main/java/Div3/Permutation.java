package Div3;

import java.util.*;
import java.io.*;

import java.util.Scanner;
public class Permutation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			
			int n=sc.nextInt();
			int m=sc.nextInt();
			int k=sc.nextInt();
			
			for(int i=n;i>=k;i--)
			{
				System.out.print(i+" ");
			}
			
			for(int j=m+1;j<k;j++)
			{
				System.out.print(j+" ");
			}
			for(int i=1;i<m+1;i++)
			{
				System.out.print(i+" ");
 
			}
			System.out.println(); 
			
		}
 
	sc.close();
	}
	public static void solve() {
		try {
            FastReader sc = new FastReader();
            FastWriter out = new FastWriter();
            int t=sc.nextInt();
            while(t-->0) {
            	int n=sc.nextInt();
            	int m=sc.nextInt();
            	@SuppressWarnings("unused")
				int k=sc.nextInt();
            	int[] a = new int[n];
            	int num=n;
            	int last=0;
            	for(int i=0;i<n;i++) {
            		if(num==m) {
            			last=i;
            			break;
            		}
            		a[i]=num--;
            	}
            	for(int i=last,j=1;i<n;i++,j++) {
            		a[i]=j;
            	}
            	for(int i=0;i<n;i++) {
            		out.print(a[i]+" ");
            	}
            	out.println("");
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
	 static class FastReader {
	        BufferedReader br;
	        StringTokenizer st;
	 
	        public FastReader() {
	            br = new BufferedReader(new InputStreamReader(System.in));
	        }
	 
	        String next() {
	            while (st == null || !st.hasMoreTokens()) {
	                try {
	                    st = new StringTokenizer(br.readLine());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	            return st.nextToken();
	        }
	 
	        int nextInt() {
	            return Integer.parseInt(next());
	        }
	 
	        long nextLong() {
	            return Long.parseLong(next());
	        }
	 
	        double nextDouble() {
	            return Double.parseDouble(next());
	        }
	 
	        String nextLine() {
	            String str = "";
	            try {
	                str = br.readLine().trim();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	            return str;
	        }
	    }
	 static class FastWriter {
	        private final BufferedWriter bw;
	 
	        public FastWriter() {
	            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        }
	 
	        public void print(Object object) throws IOException {
	            bw.append("" + object);
	        }
	 
	        public void println(Object object) throws IOException {
	            print(object);
	            bw.append("\n");
	        }
	 
	        public void close() throws IOException {
	            bw.close();
	        }
	    }

}
