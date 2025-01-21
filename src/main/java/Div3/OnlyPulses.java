import java.util.PriorityQueue;
import java.util.Scanner;
public class OnlyPulses {

    static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
 
            solve();
 
        }
    }
 
    private static void solve() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(sc.nextInt());
        pq.add(sc.nextInt());
        pq.add(sc.nextInt());
 
        for(int i = 0 ; i<5 ; i++){
            int x = pq.poll();
            pq.add(x+1);
        }
 
        System.out.println(pq.poll()*pq.poll()*pq.poll());
    }
 
}
