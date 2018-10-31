import java.util.Scanner;
class Solution {
	Solution() {

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
		if (dcObj.hasCycle()) {
			System.out.println("Cycle exists.");
		} else {
			System.out.println("Cycle doesn't exists.");
		}
	}
}
