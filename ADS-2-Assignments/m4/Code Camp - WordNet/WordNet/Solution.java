public class Solution {

	public static void main(String[] args) {
		In inObj = new In();
		String file1 = inObj.readLine();
		String file2 = inObj.readLine();
		String type = inObj.readLine();
		try {
			if (type.equals("Graph")) {
				WordNet wordnetObj = new WordNet(file1, file2);
				wordnetObj.display();
				return;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			if (type.equals("Queries")) {
				while (!inObj.isEmpty()) {
					String[] queryNames =
					    inObj.readLine().split(" ");
					if (queryNames[0].equals("null")) {
						throw new Exception("IllegalArgumentException");
					}
					WordNet wordNetObj = new WordNet(file1, file2);
					System.out.println("distance = "
					                   + wordNetObj.distance(queryNames[0],
					                           queryNames[1])
					                   + ", ancestor = "
					                   + wordNetObj.sap(queryNames[0],
					                                    queryNames[1]));
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
