import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		String[] words = loadWords();
		//Your code goes here...
		TST<Integer> tst = new TST<Integer>();
        Scanner sc = new Scanner(System.in);
        String prefix = sc.nextLine();
        int j = 0;
        for (String each : words) {
            SuffixArray suffixArr = new SuffixArray(each);
            for (int i = 0; i < each.length(); i++) {
                tst.put(suffixArr.select(i), j++);
            }
        }
        for (String each : tst.keysWithPrefix(prefix)) {
            System.out.println(each);
        }
	}

	public static String[] loadWords() {
		In in = new In("/Files/dictionary-algs4.txt");
		String[] words = in.readAllStrings();
		return words;
	}
}