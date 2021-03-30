
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.io.InputStreamReader;
public class gcd_sum{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t  = Integer.parseInt(br.readLine());
        
        while (t-->0) {
            String str = br.readLine();
            BigInteger b3 = dofor(str);
            while (true) {
                if (b3.compareTo(BigInteger.ONE)==1) {
                    System.out.println(str);
                    break;
                    // System.out.println();
                }else{
                    str = String.valueOf(Long.valueOf(str)+1);
                    b3 = dofor(str);
                }
            }

            // System.out.println(sumof(Integer.parseInt(str)));
            // BigInteger b1 = b1.valueOf(val)

        }
    }

    // public static boolean primility(int a){
    //     for (int i = 2; i*i <=a; i++) {
    //         if(a%i==0) return false ;
    //     }
    //     return true;
    // }
    public static Long sumof(long num){
        long sum = 0 ; 
        while (num!=0) {
            sum += num%10;
            num = num/10;
        }
        return sum ;
    }
    public static BigInteger gcd(BigInteger n1 , BigInteger n2  ){
        return n1.gcd(n2);
    }
    public static BigInteger dofor(String str){
        
        BigInteger b1 = new BigInteger(str);
        BigInteger b2 = BigInteger.valueOf(sumof(Long.parseLong(str)));
        return gcd(b1, b2);
        
    }
}
