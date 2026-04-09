import java.util.ArrayList;

public class hello84 {
    static class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }

    }
    public static void main(String args[]){
        System.out.println("Hello world");
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        for(int i =0;i<v; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,4));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,3));

        for(int i=0;i<graph[1].size();i++){
            Edge e = graph[1].get(i);
            System.out.println("src "+e.src + " dest "+e.dest);
        }
        
    }
    
}
