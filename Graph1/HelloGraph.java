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
    public static  void Bfs( ArrayList<Edge> graph[],int V){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] =new boolean[V+1];
        q.add(1);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.println(curr);
                vis[curr] = true;
                for(int i = 0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                        q.add(e.dest);
                    
                }

            }
        }

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

        graph[6].add(new Edge(6,1));
        graph[6].add(new Edge(6,1));
        Bfs(graph,V);
        

    
    }
}