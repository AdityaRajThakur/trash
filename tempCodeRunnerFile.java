import java.util.*;
public class prog {
    public static long binary(long a , long b){
        long res  = 1 ;
        while (b!=0) {
            if (b%2!=0) res*=a; 
            a*=a ;
            b/=2;
        }
        return res ;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long last_digit = binary(5, n)%100;
        System.out.println(last_digit);
    }
}
