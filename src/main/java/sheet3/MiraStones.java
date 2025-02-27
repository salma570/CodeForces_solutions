package sheet3;
import java.util.*;
import java.io.*;

public class MiraStones {
public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	PrintWriter pw = new PrintWriter(System.out);
	int n = sc.nextInt();
	Long [] v = new Long [n]; //cost of the stones
	for(int i=0; i<n ;i++) {
    	v[i]=sc.nextLong();
    }
	int m = sc.nextInt(); //#Q
	Long u[] = v.clone();
    Arrays.sort(u);
    
    Long uprefix[] = u.clone();
    Long vprefix [] = v.clone();
    
    for (int i=1 ;i<n; i++) {
    	uprefix[i]+=uprefix[i-1];
    	vprefix[i]+=vprefix[i-1];
    	
    }
    System.out.println(Arrays.toString(uprefix));
    System.out.println(Arrays.toString(vprefix));
    
	for(int i =0; i<m; i++){
		int q = sc.nextInt();
		int l = sc.nextInt()-1;
		int r = sc.nextInt()-1;
		if(q==1) {
			System.out.println(vprefix[r]-vprefix[l-1]);
		}else {
			System.out.println(uprefix[r]-uprefix[l-1]);
		}
	}
	pw.flush();
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
