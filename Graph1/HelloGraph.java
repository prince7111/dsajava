import java.util.*;
public class HelloGraph{
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
    public static void Bfs(ArrayList<Edge>graph[]){     
        int V = 6;   
        Queue <Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];

        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr]==false){
                System.out.println(curr);
                vis[curr] = true;
                for(int i =0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    if(!vis[e.dest]){
                      q.add(e.dest);
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        for(int i =0; i<V; i++){
            graph[i] = new ArrayList<>();
        }
         graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));

         graph[1].add(new Edge(1, 0, 0));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 0));
        graph[2].add(new Edge(2, 4, 0));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 4, 0));
        graph[3].add(new Edge(3, 5, 0));

        graph[4].add(new Edge(4, 2, 0));
        graph[4].add(new Edge(4, 3, 0));
        graph[4].add(new Edge(4, 5, 0));

        graph[5].add(new Edge(5, 3, 0));
        graph[5].add(new Edge(5, 4, 0));
        Bfs(graph);
        

        
    }
}