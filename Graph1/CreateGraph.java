import java.util.*;

public class CreateGraph {
    //CREAT GRAPH :ADJACECNY LIST 
    //5 Nodes (0,1,2,3,4)
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void main(String args[]){
        //
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[5];
        for(int i = 0; i<V; i++){
            graph[i]= new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,5));
        graph[0].add(new Edge(0, 2, 3));

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 2));
        graph[1].add(new Edge(1, 3, 4));

        graph[2].add(new Edge(2,0,3));
        graph[2].add(new Edge(2,1,2));
        graph[2].add(new Edge(2,4,2));
       
        graph[3].add(new Edge(3,1,4));
        graph[3].add(new Edge(3,4,8));

        graph[4].add(new Edge(4, 2, 2));
        graph[4].add(new Edge(4, 3, 8));
        System.out.println("Q1) how mainy edges in graph[1] ");
        System.out.println("Graph 1 Edges:"+graph[1].size());
        System.out.println("Q2) graph[4] all dest and weoght:");
        for(int i=0;i<graph[4].size();i++){
            Edge e = graph[4].get(i);
            System.out.println("graph[4] "+i+"th index dest = "+e.dest+ ",weight"+ e.wt);
        }
        System.out.println("Q.4(theoritical) V ="+graph.length);
        System.out.println("--------------------");

    }
    
}
