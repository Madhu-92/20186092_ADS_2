public class Solution {

    public static void main(String[] args) {
    	In inObj = new In();
    	String file1 = inObj.readString();
    	String file2 = inObj.readString();
    	String type = inObj.readString();
    	if (type.equals("Graph")) {
    		WordNet wordnetObj = new WordNet(file1, file2);
    	}
        
    }

}