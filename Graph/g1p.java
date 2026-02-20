package Graph;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
public class g1p {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i =0; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,4));
        
    
    }
    public static void bfs(ArrayList<Edge>graph[],int V,boolean vis[],int st){
        Queue <Integer> q = new LinkedList<>();
        q.add(st);
       // boolean vis[] = new boolean[V];
        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.print(curr+" ");
                vis[curr] = true;
            }
            for(int i=0; i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                q.add(e.dest);
            }
        }

    }
    public static void dfs(ArrayList<Edge> graph[],boolean vis[], int curr){
        System.out.print(curr+" ");
        vis[curr] = true;
        for(int i =0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(vis[e.dest]==false){
                dfs(graph, vis,e.dest );
            }
        }
    }
    public static boolean hasPath(ArrayList<Edge> graph[],boolean vis[],int s,int d, int c){
        if(c == d){
            return true;
        }
        vis[c] = true;
        for(int i=0;i<graph[c].size();i++){
            Edge e = graph[c].get(i);
            if(vis[e.dest] == false){
            boolean rastamila = hasPath(graph, vis, s, d, e.dest);
            if(rastamila == true){
                return true;
            }
            }
            
        }
        return false;
    }
    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean vis[] = new boolean[V];
        int s = 2;
        int d = 1;

       
        System.out.println( hasPath(graph,vis, s, d ,0));



    }
    
}
