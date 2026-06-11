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
    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        for(int i =0 ; i< V; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(1, 2));
        graph[0].add(new Edge(1, 3));

        graph[1].add(new Edge(2, 1));
        graph[1].add(new Edge(2, 4));

        graph[2].add(new Edge(3, 1));
        graph[2].add(new Edge(3, 5));

        graph[3].add(new Edge(4, 2));
        graph[3].add(new Edge(4, 5));
        graph[3].add(new Edge(4, 6));

        graph[4].add(new Edge(5,3));
        graph[4].add(new Edge(5,4));  
        graph[4].add(new Edge(5,6));

        graph[5].add(new Edge(6,1));
        graph[5].add(new Edge(6,1));
        System.out.print(5+" neighbour =");
        for(int i=0; i<graph[4].size(); i++){
            Edge e = graph[4].get(i);
            
            System.out.print(e.dest+",");

        }

    
    }
}