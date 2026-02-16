package Graph;
import java.util.*;
public class graphBfs {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i =0;i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1,2));
        
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3, 2));

    }
    public static void bfs( ArrayList<Edge> g[],int V){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        q.add(0);
        while(!q.isEmpty()){
            int c = q.remove();
            if(vis[c] == false){
                System.out.print(c+" ");
                vis[c] = true;
                
                for(int i =0;i<g[c].size(); i++){
                    Edge e = g[c].get(i);
                    q.add(e.dest);
                }
            }
        }

    }
    public static void main(String args[]){
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bfs(graph, V);
        
    }
    
}
