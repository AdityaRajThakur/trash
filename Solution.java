/**
 * Solution
 */
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array ;
        int n , m , c_lib,c_roads;
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            n =scan.nextInt();
            m = scan.nextInt();
            c_lib = scan.nextInt();
            c_roads = scan.nextInt();
            array = new int[m][m];
            for (int j = 0; j < m; j++) {
                    int u = scan.nextInt();
                    int v = scan.nextInt();
                    array[v-1][u-1]=array[u-1][v-1] = c_roads;
            }
            solution(n,m,c_lib,c_roads,array);
        }
        scan.close();
        
    }
    public static void solution(int n , int m , int c_lib, int c_roads,int[][] array){
        
}