package dynamic_programming;
/**
 * fib
 */
import java.util.*;

public class fib {

    public static int fibo(int n,int[] memorize){
        if (n==0) return 0 ;
        if (n==1) return 1; 
        if (memorize[n]!=0) {
            return memorize[n];
        }else{
            return memorize[n] = fibo(n-1,memorize)+ fibo(n-2,memorize);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i= scan.nextInt();
        int[] memorize = new int[i+1];
        System.out.println(fibo(i,memorize));        
    }
}