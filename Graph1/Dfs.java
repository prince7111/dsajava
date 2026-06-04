import java.util.*;
public class Dfs{
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void Dfs(ArrayList<Edge> graph[],int V){
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];
        s.add(0);
        while(!s.isEmpty()){
            int curr = s.pop();
            if(vis[curr]==false){

                System.out.print(curr+" ");
                vis [curr] = true;
                for(int i = 0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    s.push(e.dest);
                }
            }
            
        }
    }
    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        for(int i = 0; i< V; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));

        Dfs(graph,V);
        
    }
}