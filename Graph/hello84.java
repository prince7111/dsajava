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
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
          for(int i = 0; i<v; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,0));
        graph[0].add(new Edge(0,2,0));
        graph[0].add(new Edge(0,3,0));
        graph[0].add(new Edge(0,4,0));

        graph[1].add(new Edge(1,0,0));

        graph[2].add(new Edge(2,0,0));

        graph[3].add(new Edge(3,0,0));

        graph[4].add(new Edge(4,0,0));
      
        for(int i =0; i<v; i++){
            System.out.print("Vertex "+i+ " Neighbour :");
            for(int j = 0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                System.out.print(e.dest+" ");  
            }
            System.out.println("\n");
        }
    }
}