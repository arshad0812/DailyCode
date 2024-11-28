import java.util.LinkedList;
import java.util.Queue;


// Class to represent a graph using adjacency list
class Graph {

    int vertices;
    LinkedList<Integer> adj[];

    public Graph(int vertices){
        this.vertices = vertices;
        adj = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i)
            adj[i] = new LinkedList<Integer>();
    }


    void addEdge(int u,int v){
        adj[u].add(v);
    }


    void bfs(int startvertex){
        Queue<Integer> que=new LinkedList<Integer>();
        boolean visited[]=new boolean[vertices];
        visited[startvertex]=true;

        que.add(startvertex);

        while(!que.isEmpty()){
            int currentNode=que.poll();
            System.out.print(currentNode + " ");
            for(int neighbour:adj[currentNode]){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    que.add(neighbour);
                }
            }
        }
    }
}

public class Bfs {
    public static void main(String[] args)
    {
        // Number of vertices in the graph
        int vertices = 5;

        // Create a graph
        Graph graph = new Graph(vertices);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        // Perform graph traversal starting from vertex 0
        System.out.print(
            "Breadth First Traversal starting from vertex 0: ");
        graph.bfs(0);
    }
}
