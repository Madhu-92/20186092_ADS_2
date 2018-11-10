import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// Self loops are not allowed...
		// Parallel Edges are allowed...
		// Take the Graph input here...
		Scanner sc = new Scanner(System.in);
		int numOfVertices = Integer.parseInt(sc.nextLine());
		int numOfEdges = Integer.parseInt(sc.nextLine());
		EdgeWeightedGraph ewGraph = new EdgeWeightedGraph(numOfVertices);
		for(int i = 0; i < numOfEdges; i++){
            String[] eValues = sc.nextLine().split(" ");
            ewGraph.addEdge(new Edge(Integer.parseInt(eValues[0]),
            						 Integer.parseInt(eValues[1]),
                					 Double.parseDouble(eValues[2])));
        }
		String caseToGo = sc.nextLine();
		switch (caseToGo) {
		case "Graph":
			//Print the Graph Object.
            System.out.println(ewGraph);
			break;

		case "DirectedPaths":
			// Handle the case of DirectedPaths, where two integers are given.
			// First is the source and second is the destination.
			// If the path exists print the distance between them.
			// Other wise print "No Path Found."
			break;

		case "ViaPaths":
			// Handle the case of ViaPaths, where three integers are given.
			// First is the source and second is the via is the one where path should pass throuh.
			// third is the destination.
			// If the path exists print the distance between them.
			// Other wise print "No Path Found."
			break;

		default:
			break;
		}

	}
}