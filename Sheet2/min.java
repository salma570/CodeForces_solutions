package Sheet2;

import java.util.Scanner;
public class min{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int zero=0;
        int one=0;
        
        for (int i=0;i<n;i++){
            String s =sc.next();
            zero=0;
            one=0;
            for(int j=0; j<s.length();j++){
                if (s.charAt(j)== '0'){
                    zero++;
                } else{
                    one++;
                }
            }
            if(zero<one){
                System.out.println(zero);
            } else{
                if(one<zero){
                    System.out.println(one);
                } else{
                    System.out.println(zero-1);
                }
            }
        }
    sc.close();
    }
}