package Graph;
import java.util.*;
public class diconectedGraphBfs {

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

        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4, 3));

    }
    public static void bfs( ArrayList<Edge>graph[],int V, boolean vis[],int i){
        Queue<Integer> q = new LinkedList<>();
      //
        q.add(i);
        while(!q.isEmpty()){
            int c = q.remove();
            if(vis[c] == false){
                System.out.print(c+" ");
                vis[c] = true;
                
                for(int j =0;j<graph[c].size(); j++){
                    Edge e = graph[c].get(j);
                    q.add(e.dest);
                }
            }
        }

    }
    public static void main(String args[]){
        System.out.println("Prince meena");
        System.out.println("JAVA- Graph (BFS on disconnected graph)");
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean vis[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i] == false){
                bfs(graph, V, vis, i);
            }
        }
        System.out.println();
         System.out.println("44");

       
        
    }
    
}

    

