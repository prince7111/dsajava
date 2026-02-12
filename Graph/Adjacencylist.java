package Graph;
import java.util.ArrayList;
public class Adjacencylist {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void creatGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        } //Node 0
        graph[0].add(new Edge(0,1)); 
        graph[0].add(new Edge(0,2));// 0
         //Node 1
        graph[1].add(new Edge(1,0)); 
        graph[1].add(new Edge(1,2));

        //Node 2
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,4));

        //Node 3
        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,4));
        //Node 4
        graph[4].add(new Edge(4,2));
        graph[4].add (new Edge(4,3));


    }
    public static void main(String args[]){
        System.out.println("Hello World");
        int V = 5; //0-1-2-3-
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        int maxN =0;
        int node = -1;
        for(int i =0;i<graph.length;i++){
          if(graph[i].size() > maxN){
            maxN = graph[i].size();
            node = i;
          }

        }
        System.out.println("max neighbour node ="+node+"\nNeighbour="+maxN);
    }
    
}
