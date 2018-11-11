import java.util.Scanner;
import java.util.HashMap;
/**
 * class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        // Blank constructor.
    }
    /**
     * Main method to perform operations.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        String[] stations = sc.nextLine().split(" ");
        int vertices = Integer.parseInt(inputs[0]);
        int edges = Integer.parseInt(inputs[1]);
        EdgeWeightedGraph ewGraph = new EdgeWeightedGraph(vertices);
        HashMap<String, Integer> hmObj = new HashMap<String, Integer>();
        for (int i = 0; i < vertices; i++) {
            hmObj.put(stations[i], i);
        }
        while (edges > 0) {
            String[] distance = sc.nextLine().split(" ");
            Edge edge = new Edge(hmObj.get(distance[0]),
                                 hmObj.get(distance[1]),
                                 Double.parseDouble(distance[2]));
            ewGraph.addEdge(edge);
            edges--;
        }
        int numQueries = Integer.parseInt(sc.nextLine());
        while (numQueries > 0) {
            String[] srcDest = sc.nextLine().split(" ");
            int source = hmObj.get(srcDest[0]);
            DijkstraUndirectedSP dijkstra = new
            DijkstraUndirectedSP(ewGraph, source);
            if (dijkstra.hasPathTo(hmObj.get(srcDest[1]))) {
                System.out.println(
                    (int) dijkstra.distTo(hmObj.get(srcDest[1])));
            }
            numQueries--;
        }
    }
}
