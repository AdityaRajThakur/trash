/**
 * Solution
 */
import java.util.*;




public class Solution {
    static boolean[] visited;
    static Queue<Integer> queue = new LinkedList<Integer>();
    static int[] distance ;

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
            array = new int[n][n];
            visited  = new boolean[n];
            distance = new int[n];
            for (int j = 0; j < m; j++) {
                    int u = scan.nextInt();
                    int v = scan.nextInt();
                    array[v-1][u-1]=array[u-1][v-1] = c_roads;
            }
            solution(n,m,c_lib,c_roads,array);
        }
        scan.close();
        
    }

    public static void shortestpath(int start , int [][] adjmat,int c_lib, int c_roads){
        if (visited[start]) return ;
        visited[start] = true;
        for (int i = 0; i < distance.length; i++) {
            if (i!=start){
                distance[i]= -1;
            }
        
        }
        distance[start] = 0;
        queue.add(start);
        
        while (!queue.isEmpty()) {
            int u = queue.poll();
            
            for (int i = 0; i < adjmat.length; i++) {
                
                    if (visited[i]==false && adjmat[u][i]==c_roads) {
                        distance[i] = distance[u] + c_roads;
                        queue.add(i);
                        visited[i] = true;
                    }
            }
        }
        distance[start] = c_lib;
    }

    public static void solution(int n , int m , int c_lib, int c_roads,int[][] array){

        if (c_lib<=c_roads) {
            System.out.println(c_lib*n);
            return;
        }
        
        shortestpath(0,array,c_lib,c_roads);
        printDist(array,c_lib,c_roads);
    }
    public static void printDist(int [][] adjmat,int c_lib, int c_roads){
        int cost =  0 ; 
        for (int i = 0; i < adjmat.length; i++) {
            if (distance[i]==-1) {
                shortestpath(i, adjmat, c_lib, c_roads);
            }else{
                cost+=distance[i];
            }
            
        }
       /* for (int i : distance) {
            if ( i !=-1) cost+=i;
        }*/
        System.out.println(cost);
    }
}