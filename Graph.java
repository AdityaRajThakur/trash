import java.util.*;


public class Graph {

    private int vertex;
    boolean[] visited;
    Queue<Integer> queue = new LinkedList<Integer>();
    int[] distance ;
    int[][] adjmat;
    public Graph(int vertex){
        this.vertex = vertex; 
        visited = new boolean[vertex];
        distance = new int[vertex];
        adjmat = new int[vertex][vertex];
    }

    public void Entergraph(){
        System.out.println("Enter the Graph");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <adjmat.length; i++) {
                for (int j = 0; j <adjmat.length; j++) {
                   if (i!=j && adjmat[i][j]!=1) {
                       System.out.println(i+" is connected to " +j);
                       adjmat[i][j] = scan.nextInt();
                       adjmat[j][i] = 1;
                   } 
                }
        }
        scan.close();
    }
    public void dfs(int start){
        if (visited[start]) return ;
        visited[start] = true;
        System.out.print(start+"->");
        for (int i = 0; i < adjmat.length; i++) {
            if ( visited[i]==false && adjmat[start][i]==1) {
                dfs(i);
            }
        }
    }
    public void bfs(int start){
        if (visited[start]) return ;
        visited[start] = true;
        queue.add(start);
        
        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u+"->");
            for (int i = 0; i < adjmat.length; i++) {
                    if (visited[i]==false && adjmat[u][i]==1) {
                        queue.add(i);
                        visited[i] = true;
                    }
            }
        }
    }
    // This contain the Shortest path algorithm in unweighted graph
    public void shortestpath(int start){
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
                
                    if (visited[i]==false && adjmat[u][i]==1) {
                        distance[i] = distance[u] +1;
                        queue.add(i);
                        visited[i] = true;
                    }
            }
        }
    }
    public void printDist(){
        for (Integer  integer: distance) {
            System.out.print(integer+" ");
        }
    }
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.Entergraph();
        g.bfs(0);
        g.shortestpath(0);

    }
}
