import java.util.Scanner;
/**
 * Class for page rank.
 */
class PageRank {
    private double[] pageRank;
    private double[] prevRank;
    private Digraph graph;
    /**
     * Constructs the object.
     *
     * @param      graph  The graph
     */
    PageRank(Digraph graph) {
        this.graph = graph;
        int vertices = graph.V();
        for (int i = 0; i < vertices; i++) {
            pageRank[i] = 1 / vertices;
        }
    }
}
/**
 * Class for web search.
 */
class WebSearch {
    /**
     * Constructs the object.
     *
     * @param      pr    { parameter_description }
     * @param      file  The file
     */
    WebSearch(final PageRank pr, final String file) {

    }
}

/**
 * Class for solution.
 */
public class Solution {
    /**
     * Constructs the object.
     */
    protected Solution () {
        // Blank Constructor.
    }
    /**
     * main method to perform operations.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfVertices = Integer.parseInt(sc.nextLine());
        Digraph graph = new Digraph(numOfVertices);
        for (int i = 0; i < numOfVertices; i++) {
            String[] tokens = sc.nextLine().split(" ");
            for (int j = 1; j < tokens.length; j++) {
                graph.addEdge(Integer.parseInt(tokens[0]),
                              Integer.parseInt(tokens[j]));
            }
        }
        System.out.println(graph);
        PageRank pageObj = new PageRank(graph);
        // pageObj.add();
        System.out.println(pageObj.toString());
        // read the first line of the input to get the number of vertices
        // iterate count of vertices times 
        // to read the adjacency list from std input
        // and build the graph  
        // Create page rank object and pass the graph object to the constructor
        // print the page rank object
        // This part is only for the final test case
        // File path to the web content
        String file = "WebContent.txt";
        // instantiate web search object
        // and pass the page rank object
        // and the file path to the constructor
        // read the search queries from std in
        // remove the q= prefix and extract the search word
        // pass the word to iAmFeelingLucky method of web search
        // print the return value of iAmFeelingLucky
    }
}
