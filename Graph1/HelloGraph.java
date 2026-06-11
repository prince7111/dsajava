import java.util.*;
public class HelloGraph{
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static boolean hasPath(ArrayList<Edge> graph[], boolean vis[],int st,int end,int curr){ 
        
        if(curr == end){
            return true;
        }
        vis[curr] = true;
        for(int i = 0; i<graph[curr].size() ; i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                if(hasPath(graph, vis, st, end, e.dest)){
                    return true;
                }
            }
            
        }
        return false;
        
    }
    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V+1];
        for(int i =0 ; i< V+1; i++){
            graph[i] = new ArrayList<>();
        }
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 6));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));  
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,4));
        graph[6].add(new Edge(6,5));
        
        boolean vis[] = new boolean[V+1];
        System.out.println(hasPath(graph, vis, 1, 6, 1));
        System.out.println(hasPath(graph, vis, 1, 100, 1));
        
        

    
    }
}