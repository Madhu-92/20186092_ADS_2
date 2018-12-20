import java.util.Scanner;
public final class Solution {
	protected Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfVertices = Integer.parseInt(sc.nextLine());
		int numOfEdges = Integer.parseInt(sc.nextLine());
		DiGraph dgObj = new DiGraph(numOfVertices);
		while (numOfEdges > 0) {
			String[] connectedVertices = sc.nextLine().split(" ");
			dgObj.addEdge(Integer.parseInt(connectedVertices[0]),
			           Integer.parseInt(connectedVertices[1]));
			numOfEdges--;
		}
		DirectedCycle dcObj = new DirectedCycle(dgObj);
		if (dcObj.isBipartite()) {
			System.out.println("Graph is bipartite");
		} else {
			System.out.println("Graph is not a bipartite");
		}
	}
}