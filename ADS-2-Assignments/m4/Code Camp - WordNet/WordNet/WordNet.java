public class WordNet {

    // constructor takes the name of the two input files
    public WordNet(String synsets, String hypernyms) {
        synsetsFile(synsets, hypernyms);
    }

    void synsetsFile(String synsets, String hypernyms) {
        int id = 0;
        int vertices = 0;
        try {
            In inObj = new In(synsets);
            while (!inObj.isEmpty()) {
                vertices++;
                String[] tokens = inObj.readString().split(",");
                id = Integer.parseInt(tokens[0]);
                String[] nouns = tokens[1].split(" ");
            }
            Digraph diObj = new Digraph(vertices);
            hypernymsFile(hypernyms, diObj);
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

    void hypernymsFile(String hypernyms, Digraph diObj) {
        In inObj = new In(hypernyms);
        while (!inObj.isEmpty()) {
            String[] tokens = inObj.readString().split(",");
            for (int i = 1; i < tokens.length; i++) {
                diObj.addEdge(Integer.parseInt(tokens[0]),
                              Integer.parseInt(tokens[1]));
            }
        }

        DirectedCycle dcObj = new DirectedCycle(diObj);
        if (dcObj.hasCycle()) {
            System.out.println("Cycle detected");
        } else {
            System.out.println(diObj);
        }
    }


    // returns all WordNet nouns
    // public Iterable<String> nouns()

    // // is the word a WordNet noun?
    // public boolean isNoun(String word)

    // // distance between nounA and nounB (defined below)
    // public int distance(String nounA, String nounB)

    // // a synset (second field of synsets.txt) that is the common ancestor of nounA and nounB
    // // in a shortest ancestral path (defined below)
    // public String sap(String nounA, String nounB)

    // // do unit testing of this class
    // public static void main(String[] args)
}