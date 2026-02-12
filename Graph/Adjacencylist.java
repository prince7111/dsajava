package Graph;
import java.util.ArrayList;
public class Adjacencylist {
    static class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,0));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,2,0));
        graph[1].add(new Edge(1,3,12));

        graph[2].add(new Edge(2,0,0));
        graph[2].add(new Edge(2,1,0));
        graph[2].add(new Edge(2,4,0));

        graph[3].add(new Edge(3,1,12));
        graph[3].add(new Edge(3,5,5));

        graph[4].add(new Edge(4,2,0));
        graph[4].add(new Edge(4,5,0));

         graph[5].add(new Edge(5,4,0));
        graph[5].add(new Edge(5,3,5));


    }
    public static void main(String args[]){
       System.out.println("Hello World");
         int V = 6; //0-1-2-3-4-5
         ArrayList<Edge> graph[] = new ArrayList[V];
         creatGraph(graph);

         int calcWeight =0;
         int s1;
         int d1;
         
         for(int i =0; i<graph.length; i++){
            for(int I =0; I<graph[i].size();I++){
                s1 = graph[i].get(I).src;
                d1 = graph[i].get(I).dest;
                if((s1==0 && d1 ==1) || (s1 == 1 && d1 ==3) || s1 ==3 &&d1 ==5 ){
                   calcWeight += graph[i] .get(I).weight;
                }
                
            }
         }
         System.out.println(".()"+calcWeight);
       

        }
        
    }
    

