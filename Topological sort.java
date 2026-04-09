
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();//2

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();//1

        ArrayList<int[]> edges = new ArrayList<>();

        int indegree[] = new int[V];

        System.out.println("Enter edges (u v):");

        for (int i = 0; i < E; i++) {//1<1
            int u = sc.nextInt();//1
            int v = sc.nextInt();//0
            edges.add(new int[]{u, v});////1 0
            indegree[v]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < V; i++) {//2<2
            if (indegree[i] == 0) {
                q.add(i);//1
            }
        }

        System.out.println("Topological Sort:");

        while (!q.isEmpty()) {//0

            int node = q.poll();//0
            System.out.print(node + " ");//1 0

            for (int i = 0; i < edges.size(); i++) {//1<1
                int u = edges.get(i)[0];//1
                int v = edges.get(i)[1];//0

                if (u == node) //1==0
                {
                    indegree[v]--;

                    if (indegree[v] == 0) {//0==0
                        q.add(v);//0
                    }
                }
            }
        }
    }
}
