import java.util.*;


class graph{

    int v;
    LinkedList<Integer> adj[];

    public graph(int v){
        this.v=v;
        this.adj=new LinkedList[v];

        for(int i=0;i<v;i++){
            adj[i]=new LinkedList();
        }
    }


    public void addEdge(int u,int v){
        adj[u].add(v);
    }

    public void dfsutil(int CurrentVertex,boolean visited[]){
        visited[CurrentVertex]=true;
        System.out.println(CurrentVertex);
        LinkedList<Integer> arr=adj[CurrentVertex];
        // for(int i=0;i<arr.size();i++)
        // {
        //     System.out.println(arr.get(i));
        // }
        for(int i=0;i<arr.size();i++){
            if(!visited[arr.get(i)])
            {
                dfsutil(arr.get(i),visited);
            }
        }
    }


    public void dfs(int CurrentVertex){
        boolean visited[]=new boolean[v];
        dfsutil(CurrentVertex,visited);

    }
}


public class Dfs{
    public static void main(String[] args) {
        System.out.println("DFS Graph");
        graph grp=new graph(5);

        grp.addEdge(0, 1);
        grp.addEdge(0, 2);
        grp.addEdge(1, 3);
        grp.addEdge(2, 0);
        grp.addEdge(2, 3);
        grp.addEdge(3, 4);
      
        grp.dfs(0);

    }
}