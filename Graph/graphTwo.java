package Graph;
import java.util.*;

public class graphTwo {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static boolean isCycleDirected( ArrayList<Edge> graph[],boolean vis[],int curr,boolean rec[]){

        vis[curr] = true;
        rec[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(rec[e.dest]){
                return true;
            }else if(!vis[e.dest]){
                if(isCycleDirected(graph, vis, e.dest, rec)){
                    return true;
                }
            }
        }
        rec[curr] = false;
        return false;

    }
    public static void main(String args[]){
        System.out.println("Hello World");
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        for(int i=0;i<graph.length;i++){
            graph[i] =new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));

        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,0));
        System.out.println( isCycleDirected(graph, new boolean[v], 0, new boolean[v]));

       

        
    }
    
}
