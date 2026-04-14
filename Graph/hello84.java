import java.util.*;
public class hello84{
    static class Edge{
        int src;
        int dest;
        int wt;
         Edge(int s,int d, int wt){
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

    public static void main(String args[]){
        int v = 3;
        ArrayList<Edge> graph[] = new ArrayList[v];
          for(int i = 0; i<v; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,1,1));
      
        for(int i = 0; i<v; i++){
            System.out.print("Vertex "+i+ " Neighbour :");
            for(int j = 0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                System.out.print(e.dest+" ");  
            }
            System.out.println("\n");
        }
    }
}