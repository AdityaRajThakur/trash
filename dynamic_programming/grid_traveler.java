package dynamic_programming;

import java.util.*;
public class grid_traveler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[][] memorize = new int[n+1][m+1];
            System.out.println(grid(n, m,memorize));
        }
        scan.close();
    }
    public static int grid(int n , int m , int[][] memorize){
        if ( n == 0 || m == 0 ) return 0 ; 
        if ( n == 1 && m == 1)  return 1 ; 
        if (memorize[n][m]!=0) {
            return memorize[n][m];
        }
        return memorize[n][m] = grid(n-1,m,memorize) + grid (n,m-1,memorize);
        
    }
}
