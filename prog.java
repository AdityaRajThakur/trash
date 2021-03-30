import java.util.*;
import java.math.BigInteger;
public class prog {
    public static long binary(long a , long b){
        long res  = 1 ;
        while (b>0) {
            if (b%2!=0) res*=a; 
            a*=a;
            b/=2;
        }
        return res ;
    }
    // according to the rule of modulo arthimatic is that a.b % c = (a^a-1 mod c) . (b mod c) . mod c 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();


        System.out.println(25);
    }
}
