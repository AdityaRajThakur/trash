import java.util.*;


public class Graph {

    private int vertex;
    boolean[] visited;
    Queue<Integer> queue = new LinkedList<Integer>();
    int[][] adjmat;
    public Graph(int vertex){
        this.vertex = vertex; 
        visited = new boolean[vertex];

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
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.Entergraph();
        g.bfs(0);

    }
}
