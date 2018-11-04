import java.util.Scanner;
/**
 * Class for list graph.
 */
class ListGraph {
    /**
     * num of vertices.
     */
    private int vertices;
    /**
     * num of edges.
     */
    private int edges;
    /**
     * bag of adjacent values.
     */
    private Bag<Integer>[] adjacent;
    /**
     * input strings.
     */
    private String[] tokens;
    /**
     * Constructs the object.
     */
    ListGraph() {

    }
    /**
     * Constructs the object.
     * Time complexity of this method is O(N)
     *
     * @param      sc The scan
     */
    ListGraph(final Scanner sc) {
        this.vertices = Integer.parseInt(sc.nextLine());
        adjacent = (Bag<Integer>[]) new Bag[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacent[i] = new Bag<Integer>();
        }
        int edge = Integer.parseInt(sc.nextLine());
        tokens = sc.nextLine().split(",");
        for (int i = 0; i < edge; i++) {
            String[] inputs = sc.nextLine().split(" ");
            addEdge(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]));
        }
    }
    /**
     * addedge method.
     * Time complexity of this method is O(N)
     *
     *
     * @param      vertexOne  The vertex one
     * @param      vertexTwo  The vertex two
     */
    public void addEdge(final int vertexOne, final int vertexTwo) {
        if (vertexOne == vertexTwo) {
            return;
        }
        if (!hasEdge(vertexOne, vertexTwo)) {
            edges++;
        }
        adjacent[vertexOne].add(vertexTwo);
        adjacent[vertexTwo].add(vertexOne);
    }
    /**
     * this method returns the iterable.
     *
     * @param      vertex  The vertex
     *
     * @return     the iterable
     */
    public Iterable<Integer> adj(final int vertex) {
        return adjacent[vertex];
    }
    /**
     * checks for an edge.
     * Time complexity of this method is O(N)
     *
     *
     * @param      vertexOne  The vertex one
     * @param      vertexTwo  The vertex two
     *
     * @return     True if has edge else False.
     */
    public boolean hasEdge(final int vertexOne,
                           final int vertexTwo) {
        for (int each : adj(vertexOne))  {
            if (each == vertexTwo) {
                return true;
            }
        }
        return false;
    }
    /**
     * Returns a string representation of the object.
     * Time complexity of this method is O(N)
     *
     * @return     String representation of the object.
     */
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(vertices + " vertices, " + edges + " edges" + "\n");
        if (edges > 0) {
            for (int i = 0; i < vertices; i++) {
                str.append(tokens[i] + ": ");
                for (int j : adjacent[i]) {
                    str.append(tokens[j] + " ");
                }
                str.append("\n");
            }
            return str.toString();
        } else {
            str.append("No edges");
            return str.toString();
        }
    }
}
/**
 * Class for matrix graph.
 */
class MatrixGraph {
    /**
     * tokens array.
     */
    private String[] tokens;
    /**
     * graphMatrix array.
     */
    private int[][] graphMatrix;
    /**
     * num of vertices.
     */
    private int vertices;
    /**
     * num of edges.
     */
    private int edges;
    /**
     * Constructs the object.
     */
    MatrixGraph() {
        // Blank constructor.
    }
    /**
     * Constructs the object.
     *
     * @param      sc  The scan
     */
    MatrixGraph(final Scanner sc) {
        this.vertices = Integer.parseInt(sc.nextLine());
        graphMatrix = new int[vertices][vertices];
        int edge = Integer.parseInt(sc.nextLine());
        tokens = sc.nextLine().split(",");
        for (int i = 0; i < edge; i++) {
            String[] inputs = sc.nextLine().split(" ");
            addEdge(Integer.parseInt(
                        inputs[0]), Integer.parseInt(inputs[1]));
        }

    }
    /**
     * adds an edge.
     * Time complexity of this method is O(N)
     *
     * @param      vertexOne     vertexOne
     * @param      vertexTwo     vertexTwo
     */
    public void addEdge(final int vertexOne, final int vertexTwo) {
        if (vertexOne != vertexTwo) {
            if (!hasEdge(vertexOne, vertexTwo)) {
                graphMatrix[vertexOne][vertexTwo] = 1;
                graphMatrix[vertexTwo][vertexOne] = 1;
                edges++;
            }
        }

    }
    /**
     * checks for an edge.
     * Time complexity of this method is O(N)
     *
     * @param      vertexOne     vertexOne
     * @param      vertexTwo     vertexTwo
     *
     * @return     True if has edge else False.
     */
    public boolean hasEdge(final int vertexOne, final int vertexTwo) {
        return graphMatrix[vertexOne][vertexTwo] == 1;
    }
    /**
     * prints all values.
     * Time complexity of this method is O(N)
     *
     */
    public void print() {
        String str = "";
        str += vertices + " vertices, " + edges + " edges" + "\n";
        if (edges > 0) {
            for (int i = 0; i < graphMatrix.length; i++) {
                for (
                    int j = 0; j < graphMatrix[0].length; j++) {
                    str += graphMatrix[i][j] + " ";
                }
                str += "\n";
            }
            System.out.println(str);
        } else {
            System.out.println(str + "No edges");
        }
    }
}
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        // Blank constructor
    }
    /**
     * this method performs the operations.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        switch (type) {
        case "List":
            ListGraph lgObj = new ListGraph(sc);
            System.out.println(lgObj.toString());
            break;
        case "Matrix":
            MatrixGraph mgObj = new MatrixGraph(sc);
            mgObj.print();
            break;
        default:
            break;
        }
    }
}
